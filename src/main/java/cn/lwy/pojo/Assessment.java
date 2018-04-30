package cn.lwy.pojo;

public class Assessment {
    private Integer qid;

    private Integer pid;

    private String query;

    private Float avgerage;

    private Float accuracy;

    private Question qst;
    
    private Paper paper;
    
    public Question getQst() {
		return qst;
	}

	public void setQst(Question qst) {
		this.qst = qst;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

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

	@Override
	public String toString() {
		return "Assessment [qid=" + qid + ", pid=" + pid + ", query=" + query + ", avgerage=" + avgerage + ", accuracy="
				+ accuracy + ", qst=" + qst + ", paper=" + paper + "]";
	}
}