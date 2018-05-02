package cn.lwy.service;

import cn.lwy.pojo.Candidate;

/**
 * 候选人的业务类
 */
public interface CandidateService extends BaseService<Candidate>{
	
	/**
	 * 根据用户名获取候选人(登录业务)
	 * @param candidate
	 * @return
	 */
	boolean getByName(Candidate candidate);
	
}
