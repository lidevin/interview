package cn.lwy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.mapper.ManagerMapper;
import cn.lwy.pojo.Manager;
import cn.lwy.pojo.ManagerExample;
import cn.lwy.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerMapper managerMapper;
	
	public boolean getManagerByName(Manager manager){
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
	
	

}
