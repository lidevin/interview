package cn.lwy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.exception.GeneralException;
import cn.lwy.mapper.ManagerMapper;
import cn.lwy.pojo.Manager;
import cn.lwy.pojo.ManagerExample;
import cn.lwy.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerMapper managerMapper;
	
	@Override
	public boolean getByName(Manager manager) throws GeneralException{
		if(manager == null)
			return false;
		String name = manager.getName();
		if(name == null || "".equals(name))
			return false;
		ManagerExample example = new ManagerExample();
		example.createCriteria().andNameEqualTo(name);
		List<Manager> list = managerMapper.selectByExample(example);
		if(list == null || list.size() == 0)
			return false;
		Manager real = list.get(0);
		if(real == null || !manager.getPwd().equals(real.getPwd()))
			return false;
		return true;
	}

	@Override
	public Manager getById(Number id) {
		return managerMapper.selectByPrimaryKey(String.valueOf(id));
	}

	@Override
	public boolean deleteById(Number id) {
		if(managerMapper.deleteByPrimaryKey(id) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(Manager entity) {
		if(managerMapper.insert(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertSelective(Manager entity) {
		if(managerMapper.insertSelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateByIdSelective(Manager entity) {
		if(managerMapper.updateByPrimaryKeySelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateById(Manager entity) {
		if(managerMapper.updateByPrimaryKey(entity) == 1) {
			return true;
		}
		return false;
	}
}
