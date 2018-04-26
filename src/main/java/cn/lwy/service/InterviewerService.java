package cn.lwy.service;

import java.util.List;

import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.InterviewerExample;

/**
 * 面试官的业务类
 */
public interface InterviewerService extends BaseService<Interviewer>{
	
	/**
	 * 根据用户名获取面试官(登录业务)
	 * @param interviewer
	 * @return
	 */
	boolean getByName(Interviewer interviewer) throws Exception;
	
	List<Interviewer> getByExample(InterviewerExample example);
	
}
