package cn.lwy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.mapper.InterviewerMapper;
import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.InterviewerExample;
import cn.lwy.pojo.Manager;
import cn.lwy.pojo.ManagerExample;
import cn.lwy.service.InterviewerService;

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
		if(interviewerMapper.insert(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertSelective(Interviewer entity) {
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
	public boolean getByName(Interviewer interviewer) throws Exception {
		if(interviewer == null)
			return false;
		String name = interviewer.getName();
		if(name == null || "".equals(name))
			return false;
		InterviewerExample example = new InterviewerExample();
		example.createCriteria().andNameEqualTo(name);
		List<Interviewer> list = interviewerMapper.selectByExample(example);
		if(list == null || list.size() == 0)
			return false;
		Interviewer real = list.get(0);
		if(real == null || !interviewer.getPwd().equals(real.getPwd()))
			return false;
		return true;
	}

	@Override
	public List<Interviewer> getByExample(InterviewerExample example) {
		return interviewerMapper.selectByExample(example);
	}
}
