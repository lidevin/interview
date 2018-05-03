package cn.lwy.service;

import java.util.List;

import cn.lwy.pojo.Candidate;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperQst;

/**
 * 候选人的业务类
 */
public interface CandidateService extends BaseService<Candidate>{
	
	/**
	 * 根据用户名获取候选人(登录业务)
	 * @param candidate  
	 * @return
	 */
	Candidate getByOpenid(Candidate candidate) throws Exception;
	
	/**
	 * 获取未来time时间内的所有试卷
	 * @param candidate  单位秒
	 */
	List<Paper> getRecentPaper(Long time);
	
	/**
	 * 插入题目答案
	 * @param pid  试卷id
	 * @param cid  候选人id
	 * @param pqsts  试卷题目集
	 */
	void insertQstAnswer(Integer pid, String cid, List<PaperQst> pqsts) throws Exception ;
}
