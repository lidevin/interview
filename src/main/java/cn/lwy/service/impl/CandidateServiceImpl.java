package cn.lwy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lwy.exception.GeneralException;
import cn.lwy.mapper.CandidateMapper;
import cn.lwy.mapper.CandidatePaperMapper;
import cn.lwy.mapper.PaperMapper;
import cn.lwy.mapper.PaperQstMapper;
import cn.lwy.mapper.QuestionMapper;
import cn.lwy.pojo.Candidate;
import cn.lwy.pojo.CandidateExample;
import cn.lwy.pojo.CandidatePaper;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.PaperQst;
import cn.lwy.pojo.Question;
import cn.lwy.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateMapper candidateMapper;
	
	@Override
	public Candidate getById(Number id) {
		return candidateMapper.selectByPrimaryKey(id.toString());
	}

	@Override
	public boolean deleteById(Number id) {
		if(candidateMapper.deleteByPrimaryKey(id.toString()) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(Candidate entity) {
		return candidateMapper.insert(entity)==1?true:false;
	}

	@Override
	public boolean insertSelective(Candidate entity) {
		return candidateMapper.insert(entity)==1?true:false;
	}

	@Override
	public boolean updateByIdSelective(Candidate entity) {
		return candidateMapper.updateByPrimaryKey(entity)==1?true:false;
	}

	@Override
	public boolean updateById(Candidate entity) {
		return candidateMapper.updateByPrimaryKey(entity)==1?true:false;
	}

	@Override
	public Candidate getByOpenid(Candidate candidate) throws Exception {
		if(candidate == null)
			throw new GeneralException("传入参数错误");
		String openid = candidate.getWid();
		if(openid == null)
			throw new GeneralException("传入参数错误");
		CandidateExample example = new CandidateExample();
		example.createCriteria().andWidEqualTo(openid);
		List<Candidate> list = candidateMapper.selectByExample(example);
		if(list == null || list.size() != 1) {
			throw new GeneralException("查无此人");
		}
		return list.get(0);
	}

	@Autowired
	private PaperMapper paperMapper;
	
	@Override
	public List<Paper> getRecentPaper(Long time) {
		long curTime = System.currentTimeMillis();
		PaperExample example = new PaperExample();
		example.createCriteria().andStartTimeNotBetween(new Date(), new Date(curTime + time));
		return paperMapper.selectByExample(example);
	}

	@Autowired
	private CandidatePaperMapper candidatePaperMapper;
	
	@Autowired
	private PaperQstMapper paperQstMapper;
	
	@Autowired
	private QuestionMapper questionMapper;
	
	@Override
	public void insertQstAnswer(Integer pid, String cid, List<PaperQst> pqsts) throws Exception {
		if(pid == null || cid==null || pqsts==null || pqsts.size()==0) {
			//考试失败
			throw new GeneralException("输入数据错误！");
		}
		CandidatePaper cp = new CandidatePaper();
		cp.setPid(pid);
		cp.setCid(cid);
		cp.setMarking((byte)2);
		//添加考试试卷
		int i = candidatePaperMapper.insert(cp);
		if(i != 1) {
			//考试失败
			throw new GeneralException("添加数据错误！");
		}
		Integer cpid = cp.getId();
		
		for (PaperQst paperQst : pqsts) {
			paperQst.setCpId(cpid);
			paperQst.setMarking((byte)1);
			paperQst.setCandidateId(cid);
			Question question = questionMapper.selectByPrimaryKey(paperQst.getQstId());
			if(question.getQsttype() != 4) {//不是主观题
				paperQst.setMarking((byte)3);
				if(question.getAnswer().equals(paperQst.getAnswer())) {
					//题目正确
					paperQst.setScore(question.getScore());
				}else {
					//题目错误
					paperQst.setScore((byte)0);
				}
			}else {//非主观题
				paperQst.setMarking((byte)1);
			}
			paperQstMapper.insertSelective(paperQst);
		}
		
	}

}
