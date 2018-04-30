package cn.lwy.pojo;

public class PaperQst {
    private Integer cpId;

    private String candidateId;

    private Integer qstId;

    private String answer;

    private Byte score;

    private Byte marking;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId == null ? null : candidateId.trim();
    }

    public Integer getQstId() {
        return qstId;
    }

    public void setQstId(Integer qstId) {
        this.qstId = qstId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public Byte getMarking() {
        return marking;
    }

    public void setMarking(Byte marking) {
        this.marking = marking;
    }
}