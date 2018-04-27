package cn.lwy.vo;

public class QuestionVo {

	private String answers1;//单选题答案
	private String[] choices1;//单选题选项
	
	private String[] answers2;//多选题答案
	private String[] choices2;//多选题选项
	
	private String answers3;//判断题答案
	private String[] choices3;//判断题答案
	
	private String answers4;//主观题答案

	public String getAnswers1() {
		return answers1;
	}

	public void setAnswers1(String answers1) {
		this.answers1 = answers1;
	}

	public String[] getChoices1() {
		return choices1;
	}

	public void setChoices1(String[] choices1) {
		this.choices1 = choices1;
	}

	public String[] getAnswers2() {
		return answers2;
	}

	public void setAnswers2(String[] answers2) {
		this.answers2 = answers2;
	}

	public String[] getChoices2() {
		return choices2;
	}

	public void setChoices2(String[] choices2) {
		this.choices2 = choices2;
	}

	public String getAnswers3() {
		return answers3;
	}

	public void setAnswers3(String answers3) {
		this.answers3 = answers3;
	}

	public String[] getChoices3() {
		return choices3;
	}

	public void setChoices3(String[] choices3) {
		this.choices3 = choices3;
	}

	public String getAnswers4() {
		return answers4;
	}

	public void setAnswers4(String answers4) {
		this.answers4 = answers4;
	}
	
	
}
