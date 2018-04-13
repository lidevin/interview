package cn.lwy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.mapper.PaperMapper;
import cn.lwy.pojo.Paper;
import cn.lwy.service.PaperService;

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

	@Override
	public boolean insertSelective(Paper entity) {
		if(paperMapper.insertSelective(entity) == 1) {
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

}
