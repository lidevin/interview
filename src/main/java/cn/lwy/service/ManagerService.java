package cn.lwy.service;

import cn.lwy.pojo.Manager;

/**
 * HR管理员的业务类
 */
public interface ManagerService {
	
	/**
	 * 根据用户名获取HR管理员(登录业务)
	 * @param manager
	 * @return
	 */
	boolean getManagerByName(Manager manager);
	
}
