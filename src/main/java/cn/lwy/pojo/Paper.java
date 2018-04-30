package cn.lwy.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import cn.lwy.utils.CommonUtils;

public class Paper {
    private Integer id;

    private String type;

    private Byte singleCount;

    private Byte multipleCount;

    private Byte judgeCount;

    private Byte subjectCount;

    private Byte difficult;

    private Short score;

    private Integer kid;

    @DateTimeFormat(pattern= "yyyy-MM-dd HH:mm")
    private Date startTime;

    private String startTimeStr;
    
    private Short time;

    public String getStartTimeStr() {
    	startTimeStr = CommonUtils.toDatetimeStr(startTime);
		return startTimeStr;
	}

	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getSingleCount() {
        return singleCount;
    }

    public void setSingleCount(Byte singleCount) {
        this.singleCount = singleCount;
    }

    public Byte getMultipleCount() {
        return multipleCount;
    }

    public void setMultipleCount(Byte multipleCount) {
        this.multipleCount = multipleCount;
    }

    public Byte getJudgeCount() {
        return judgeCount;
    }

    public void setJudgeCount(Byte judgeCount) {
        this.judgeCount = judgeCount;
    }

    public Byte getSubjectCount() {
        return subjectCount;
    }

    public void setSubjectCount(Byte subjectCount) {
        this.subjectCount = subjectCount;
    }

    public Byte getDifficult() {
    	return difficult == null ? 1 : difficult;
    }

    public void setDifficult(Byte difficult) {
    	if(difficult < 1) {
    		this.difficult = 1;
    	}else if(difficult > 5) {
    		this.difficult = 5;
    	}else {
    		this.difficult = difficult;
    	}
    }

    public Short getScore() {
    	score = 0;
    	score = (short) (score + this.getSingleCount() * CommonUtils.score[0][this.getDifficult()]);
    	score = (short) (score + this.getMultipleCount() * CommonUtils.score[1][this.getDifficult()]);
    	score = (short) (score + this.getJudgeCount() * CommonUtils.score[2][this.getDifficult()]);
    	score = (short) (score + this.getSubjectCount() * CommonUtils.score[3][this.getDifficult()]);
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Short getTime() {
        return time;
    }

    public void setTime(Short time) {
        this.time = time;
    }
    
	@Override
	public String toString() {
		return "Paper [id=" + id + ", type=" + type + ", singleCount=" + singleCount + ", multipleCount="
				+ multipleCount + ", judgeCount=" + judgeCount + ", subjectCount=" + subjectCount + ", difficult="
				+ difficult + ", score=" + score + ", kid=" + kid + ", startTime=" + startTime + ", startTimeStr="
				+ startTimeStr + ", time=" + time + "]";
	}
}