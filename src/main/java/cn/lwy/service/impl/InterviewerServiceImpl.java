package cn.lwy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.exception.GeneralException;
import cn.lwy.mapper.InterviewerMapper;
import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.InterviewerExample;
import cn.lwy.pojo.Page;
import cn.lwy.service.InterviewerService;
import cn.lwy.utils.CommonUtils;
import cn.lwy.vo.PageVo;

/**
 * 面试官的业务类
 */
@Service
public class InterviewerServiceImpl implements InterviewerService {

	@Autowired
	private InterviewerMapper interviewerMapper;
	
	@Override
	public Interviewer getById(Number id) {
		return interviewerMapper.selectByPrimaryKey(id.toString());
	}

	@Override
	public boolean deleteById(Number id) {
		if(interviewerMapper.deleteByPrimaryKey(id.toString()) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(Interviewer entity) {
		entity.setId(CommonUtils.getId10());
		if(interviewerMapper.insert(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertSelective(Interviewer entity) {
		entity.setId(CommonUtils.getId10());
		if(interviewerMapper.insertSelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateByIdSelective(Interviewer entity) {
		if(interviewerMapper.updateByPrimaryKeySelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateById(Interviewer entity) {
		if(interviewerMapper.updateByPrimaryKey(entity) == 1) {
			return true;
		}
		return false;
	}
	@Override
	public Interviewer getByNickname(Interviewer interviewer) throws Exception{
		if(interviewer == null)
			throw new GeneralException("传入数据错误！");
		String nickname = interviewer.getNickname();
		if(nickname == null || "".equals(nickname))
			throw new GeneralException("传入数据错误！");
		InterviewerExample example = new InterviewerExample();
		example.createCriteria().andNicknameEqualTo(nickname);
		List<Interviewer> list = interviewerMapper.selectByExample(example);
		if(list == null || list.size() == 0)
			throw new GeneralException("查询数据错误！");
		Interviewer real = list.get(0);
		if(real == null || !interviewer.getPwd().equals(real.getPwd()))
			throw new GeneralException("查询数据错误！");
		return real;
	}

	@Override
	public List<Interviewer> getByExample(InterviewerExample example) {
		return interviewerMapper.selectByExample(example);
	}

	@Override
	public Page<Interviewer> getByExampleAndVo(InterviewerExample example, PageVo vo) {
		Page<Interviewer> page = new Page<Interviewer>();
		//每页显示行数
		page.setSize(vo.getSize());
		//设置当前页数
		page.setPage(vo.getPage());
		//计算当前的记录数
		vo.setStartRow((vo.getPage()-1)*vo.getSize());
		//设置所有记录数
		page.setTotal(interviewerMapper.countByExample(example));
		//设置查出的记录
		page.setRows(interviewerMapper.selectByExampleAndVo(example, vo));
		return page;
	}

	@Override
	public int countByNickname(String nickName) {
		if(nickName == null || "null".equals(nickName.trim()) || "".equals(nickName.trim())) {
			return 1;
		}
		InterviewerExample example = new InterviewerExample();
		example.createCriteria().andNicknameEqualTo(nickName);
		return interviewerMapper.countByExample(example);
	}

/*	@Override
	public Interviewer getByName(Interviewer interviewer) throws Exception {
		if(interviewer == null)
			throw new GeneralException("传入数据为空");
		String name = interviewer.getNickname();
		if(name == null || "".equals(name))
			throw new GeneralException("传入数据为空");
		InterviewerExample example = new InterviewerExample();
		example.createCriteria().andNameEqualTo(name);
		List<Interviewer> list = interviewerMapper.selectByExample(example);
		if(list == null || list.size() == 0)
			throw new GeneralException("用户名错误");
		Interviewer real = list.get(0);
		if(real == null || !interviewer.getPwd().equals(real.getPwd()))
			throw new GeneralException("密码错误");
		return real;
	}*/
}
