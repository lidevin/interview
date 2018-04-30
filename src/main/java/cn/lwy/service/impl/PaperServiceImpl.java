package cn.lwy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.exception.GeneralException;
import cn.lwy.mapper.PaperMapper;
import cn.lwy.mapper.PaperQstListMapper;
import cn.lwy.mapper.QuestionMapper;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.PaperQstList;
import cn.lwy.pojo.PaperQstListExample;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.PaperService;
import cn.lwy.utils.CommonUtils;
import cn.lwy.vo.PageVo;
import cn.lwy.vo.PaperVo;

@Service
public class PaperServiceImpl implements PaperService {

	@Autowired
	private PaperMapper paperMapper;
	
	@Override
	public Paper getById(Number id) {
		return paperMapper.selectByPrimaryKey((Integer)id);
	}

	@Override
	public boolean deleteById(Number id) {
		if(paperMapper.deleteByPrimaryKey((Integer)id) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(Paper entity) {
		if(paperMapper.insert(entity) == 1) {
			return true;
		}
		return false;
	}

	public void insertWithQstSelective(Paper paper) throws Exception{
		if(paper == null || paperMapper.insertSelective(paper) != 1) {
			throw new GeneralException(1, "添加试卷信息错误");
		}
		PaperVo vo = new PaperVo();
		Byte difficult = paper.getDifficult();
		//获取id
		Integer pid = paper.getId();
		//查询单选题
		QuestionExample example1 = new QuestionExample();
		example1.createCriteria().andQsttypeEqualTo((byte)1).andDifficultEqualTo(difficult);
		vo.setSingle(questionMapper.selectByExample(example1));
		//查询多选题
		QuestionExample example2 = new QuestionExample();
		example2.createCriteria().andQsttypeEqualTo((byte)2).andDifficultEqualTo(difficult);
		vo.setMutil(questionMapper.selectByExample(example2));
		//查询判断题
		QuestionExample example3 = new QuestionExample();
		example3.createCriteria().andQsttypeEqualTo((byte)3).andDifficultEqualTo(difficult);
		vo.setJudge(questionMapper.selectByExample(example3));
		//查询主观题
		QuestionExample example4 = new QuestionExample();
		example4.createCriteria().andQsttypeEqualTo((byte)4).andDifficultEqualTo(difficult);
		vo.setSubject(questionMapper.selectByExample(example4));
		//自动生成题目
		List<Question> qstList = CommonUtils.createPaper(paper, vo);
		if(qstList == null) {
			throw new GeneralException(1, "生成题目集错误");
		}
		//题目插入到试卷题目集合中
		int count = 0;
		for (Question question : qstList) {
			PaperQstList record = new PaperQstList();
			record.setPid(pid);
			record.setQid(question.getId());
			record.setQsttype(question.getQsttype());
			count += paperQstListMapper.insert(record);
		}
		System.out.println("-----3-----");
		if(count != qstList.size()) {
			throw new GeneralException(1, "添加题目错误");
		}
	}
	@Override
	public boolean insertSelective(Paper paper){
		if(paperMapper.insertSelective(paper) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateByIdSelective(Paper entity) {
		if(paperMapper.updateByPrimaryKeySelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateById(Paper entity) {
		if(paperMapper.updateByPrimaryKey(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public Page<Paper> getByExampleAndVo(PaperExample example, PageVo vo) {
		Page<Paper> page = new Page<Paper>();
		//每页显示行数
		page.setSize(vo.getSize());
		//设置当前页数
		page.setPage(vo.getPage());
		//计算当前的记录数
		vo.setStartRow((vo.getPage()-1)*vo.getSize());
		//设置所有记录数
		page.setTotal(paperMapper.countByExample(example));
		//设置查出的记录
		page.setRows(paperMapper.selectByExampleAndVo(example,vo));
		return page;
	}

	@Override
	public List<Paper> getByExample(PaperExample example) {
		return paperMapper.selectByExample(example);
	}

	@Autowired
	private PaperQstListMapper paperQstListMapper;
	@Autowired
	private QuestionMapper questionMapper;
	@Override
	public List<Question> getQstList(Integer pid) {
		PaperQstListExample example = new PaperQstListExample();
		example.createCriteria().andPidEqualTo(pid);
		List<PaperQstList> paperQstList = paperQstListMapper.selectByExample(example);
		List<Question> questions = new ArrayList<Question>();
		if(paperQstList != null) {
			//查询所有的题目id
			for (PaperQstList p : paperQstList) {
				questions.add(questionMapper.selectByPrimaryKey(p.getQid()));
			}
		}
		return questions;
	}

}
