package cn.lwy.pojo;

import java.util.List;

public class Question {
    private Integer id;

    private String title;

    private Byte type;

    private String answer;

    private Byte score;

    private Byte difficult;

    private List<Choice> choices;
    
    private List<TagType> tags;
    
    
    public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	public List<TagType> getTags() {
		return tags;
	}

	public void setTags(List<TagType> tags) {
		this.tags = tags;
	}

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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public Byte getDifficult() {
        return difficult;
    }

    public void setDifficult(Byte difficult) {
        this.difficult = difficult;
    }

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", type=" + type + ", answer=" + answer + ", score=" + score
				+ ", difficult=" + difficult + ", choices=" + choices + ", tags=" + tags + "]";
	}
}