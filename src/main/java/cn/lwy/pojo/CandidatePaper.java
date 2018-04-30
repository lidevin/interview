package cn.lwy.pojo;

public class CandidatePaper {
    private Integer id;

    private String cid;

    private Integer pid;

    private Short score;

    private Byte marking;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public Byte getMarking() {
        return marking;
    }

    public void setMarking(Byte marking) {
        this.marking = marking;
    }
}