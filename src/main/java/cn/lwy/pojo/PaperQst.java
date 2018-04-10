package cn.lwy.pojo;

public class PaperQst {
    private Integer paperId;

    private String candidateId;

    private Integer qstId;

    private String candidateAnswer;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
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

    public String getCandidateAnswer() {
        return candidateAnswer;
    }

    public void setCandidateAnswer(String candidateAnswer) {
        this.candidateAnswer = candidateAnswer == null ? null : candidateAnswer.trim();
    }
}