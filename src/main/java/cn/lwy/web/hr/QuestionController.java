package cn.lwy.web.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Question;
import cn.lwy.service.QuestionService;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping({"/web/question", "/web/question/list"})
	public String list(int id) {
		Question question = questionService.getFullById(id);
		System.out.println(question);
		return "";
	}
	
	@RequestMapping("/web/question/edit")
	public String edit(int id) {
		Question question = questionService.getFullById(id);
		System.out.println(question);
		question.setTitle(question.getTitle() + "0123456789");
		questionService.updateFullByIdSelective(question);
		System.out.println(question);
		return "";
	}
	
}
