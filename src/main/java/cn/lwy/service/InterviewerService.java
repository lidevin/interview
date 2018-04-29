package cn.lwy.service;

import java.util.List;

import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.InterviewerExample;
import cn.lwy.pojo.Page;
import cn.lwy.vo.PageVo;

/**
 * 面试官的业务类
 */
public interface InterviewerService extends BaseService<Interviewer>{
	
	/**
	 * 根据用户名获取面试官(登录业务)
	 * @param interviewer
	 * @return
	 */
	boolean getByNickname(Interviewer interviewer);
	
	/**
	 * 根据条件查询
	 * @param example  条件
	 */
	List<Interviewer> getByExample(InterviewerExample example);
	
	/**
	 * 根据条件查询  分页查询
	 * @param example  基础条件
	 * @param vo   分页条件
	 */
	Page<Interviewer> getByExampleAndVo(InterviewerExample example, PageVo vo);
	
	int countByNickname(String nickName);
}
