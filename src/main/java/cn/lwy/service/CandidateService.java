package cn.lwy.service;

import java.util.List;

import cn.lwy.pojo.Candidate;
import cn.lwy.pojo.Paper;

/**
 * 候选人的业务类
 */
public interface CandidateService extends BaseService<Candidate>{
	
	/**
	 * 根据用户名获取候选人(登录业务)
	 * @param candidate  
	 * @return
	 */
	boolean getByOpenid(Candidate candidate);
	
	/**
	 * 获取未来time时间内的所有试卷
	 * @param candidate  单位秒
	 */
	List<Paper> getRecentPaper(Long time);
}
