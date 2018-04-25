package cn.lwy.web.hr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.service.InterviewerService;

@Controller
public class InterviewerController {
	
	private InterviewerService interviewerService;
	
	@RequestMapping("/web/interview")
	public String list() {
		return "web/interview";
	}
	
	@RequestMapping("/web/interview/add")
	public String add() {
		return "web/interview/add";
	}
	@RequestMapping("/web/interview/edit")
	public String edit() {
		return "web/interview/edit";
	}
	
	@RequestMapping("/web/interview/del")
	public String del() {
		return "web/interview";
	}
}
