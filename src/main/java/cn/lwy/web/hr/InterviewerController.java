package cn.lwy.web.hr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.InterviewerExample;
import cn.lwy.pojo.Page;
import cn.lwy.service.InterviewerService;

@Controller
public class InterviewerController {
	
	@Autowired
	private InterviewerService interviewerService;
	
	@RequestMapping("/web/interview")
	public String list(Model model) {
		
		InterviewerExample example = new InterviewerExample();
		example.createCriteria().andNameIsNotNull();
		System.out.println();
		List<Interviewer> list = interviewerService.getByExample(example);
		Page<Interviewer> page = new Page<Interviewer>();
		page.setRows(list);
		page.setSize(5);
		page.setPage(1);
		page.setTotal(6);
		model.addAttribute("page", page);
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
