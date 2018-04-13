package cn.lwy.pojo;

import java.util.Date;
import java.util.List;

public class Paper {
    private Integer id;

    private String type;

    private Byte singleCount;

    private Byte multipleCount;

    private Byte judgeCount;

    private Byte subjectCount;

    private Byte difficult;

    private Byte score;

    private Byte candidateScore;

    private Byte marking;

    private Date startTime;

    private Byte time;

    private List<PaperQst> paperQsts;
    
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
        return difficult;
    }

    public void setDifficult(Byte difficult) {
        this.difficult = difficult;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public Byte getCandidateScore() {
        return candidateScore;
    }

    public void setCandidateScore(Byte candidateScore) {
        this.candidateScore = candidateScore;
    }

    public Byte getMarking() {
        return marking;
    }

    public void setMarking(Byte marking) {
        this.marking = marking;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Byte getTime() {
        return time;
    }

    public void setTime(Byte time) {
        this.time = time;
    }
}