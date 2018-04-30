package cn.lwy.pojo;

public class Assessment {
    private Integer qid;

    private Integer pid;

    private String query;

    private Float avgerage;

    private Float accuracy;

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }

    public Float getAvgerage() {
        return avgerage;
    }

    public void setAvgerage(Float avgerage) {
        this.avgerage = avgerage;
    }

    public Float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Float accuracy) {
        this.accuracy = accuracy;
    }
}