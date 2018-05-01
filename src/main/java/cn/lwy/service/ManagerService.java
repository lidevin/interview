package cn.lwy.service;

import cn.lwy.pojo.Manager;

/**
 * HR管理员的业务类
 */
public interface ManagerService extends BaseService<Manager>{
	
	/**
	 * 根据用户名获取HR管理员(登录业务)
	 * @param manager  封装的HR管理员
	 * @return  数据库中查询到的HR管理员
	 * @throws Exception  登录错误则出现异常
	 */
	Manager getByName(Manager manager) throws Exception;
	
}
