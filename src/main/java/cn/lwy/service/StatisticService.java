package cn.lwy.service;

public interface StatisticService {

	/**
	 * 分析题目并将结果插入或更新数据库
	 */
	void insertOrUpdateQuestion();
	
	/**
	 * 分析试卷并将结果插入或更新数据库
	 */
	void insertOrUpdatePaper();
}
