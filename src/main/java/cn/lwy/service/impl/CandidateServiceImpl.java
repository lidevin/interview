package cn.lwy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lwy.mapper.CandidateMapper;
import cn.lwy.mapper.PaperMapper;
import cn.lwy.pojo.Candidate;
import cn.lwy.pojo.CandidateExample;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
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
	public boolean getByOpenid(Candidate candidate) {
		if(candidate == null)
			return false;
		String openid = candidate.getWid();
		if(openid == null)
			return false;
		CandidateExample example = new CandidateExample();
		example.createCriteria().andWidEqualTo(openid);
		int count = candidateMapper.countByExample(example);
		if(count == 0)
			return false;
		return true;
	}

	@Autowired
	private PaperMapper paperMapper;
	
	@Override
	public List<Paper> getRecentPaper(Long time) {
		long curTime = System.currentTimeMillis();
		PaperExample example = new PaperExample();
		example.createCriteria().andStartTimeNotBetween(new Date(curTime - time), new Date());
		return paperMapper.selectByExample(example);
	}

}
