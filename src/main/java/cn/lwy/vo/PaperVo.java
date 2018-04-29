package cn.lwy.vo;

import java.util.List;

import cn.lwy.pojo.Question;

public class PaperVo {

	/**
	 * 单选题题目集
	 */
	private List<Question> single;
	/**
	 * 多选题题目集
	 */
	private List<Question> mutil;
	/**
	 * 判断题题目集
	 */
	private List<Question> judge;
	/**
	 * 主观题题目集
	 */
	private List<Question> subject;
	/**
	 * 总分数
	 */
	private int score = 0;
	public List<Question> getSingle() {
		return single;
	}
	public void setSingle(List<Question> single) {
		this.single = single;
	}
	public List<Question> getMutil() {
		return mutil;
	}
	public void setMutil(List<Question> mutil) {
		this.mutil = mutil;
	}
	public List<Question> getJudge() {
		return judge;
	}
	public void setJudge(List<Question> judge) {
		this.judge = judge;
	}
	public List<Question> getSubject() {
		return subject;
	}
	public void setSubject(List<Question> subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
