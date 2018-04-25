package cn.lwy.pojo;

import java.util.List;

public class Question {
    private Integer id;

    private String title;

    private Byte qsttype;

    private String answer;

    private Integer kid;

    private String kind;
    
    private String tags;

    private Byte score;

    private Byte difficult;

    private List<Choice> choices;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getQsttype() {
        return qsttype;
    }

    public void setQsttype(Byte qsttype) {
        this.qsttype = qsttype;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public Byte getDifficult() {
        return difficult;
    }

    public void setDifficult(Byte difficult) {
        this.difficult = difficult;
    }

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", qsttype=" + qsttype + ", answer=" + answer + ", kid="
				+ kid + ", kind=" + kind + ", tags=" + tags + ", score=" + score + ", difficult=" + difficult
				+ ", choices=" + choices + "]";
	}
	
	
}