package cn.lwy.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import cn.lwy.utils.CommonUtils;

public class Interviewer {
    private String id;

    private String name;

    private String nickname;

    private String pwd;

    private String sex;

    private String department;

    private String position;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date time;

    private String timeStr;
    
    public String getTimeStr() {
    	this.timeStr = CommonUtils.toDateStr(time);
		return timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

	@Override
	public String toString() {
		return "Interviewer [id=" + id + ", name=" + name + ", nickname=" + nickname + ", pwd=" + pwd + ", sex=" + sex
				+ ", department=" + department + ", position=" + position + ", time=" + time + "]";
	}
}