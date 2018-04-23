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
	
	/**
	 * 显示题目
	 */
	@RequestMapping("/web/question")
	public String list() {
		/*Question question = questionService.getFullById(id);
		System.out.println(question);*/
		return "web/question";
	}
	
	/**
	 * 添加题目
	 */
	@RequestMapping("/web/question/add")
	public String add() {
		return "web/question/add";
	}
	
	/**
	 * 编辑题目
	 */
	@RequestMapping("/web/question/edit")
	public String edit() {
		/*Question question = questionService.getFullById(id);
		System.out.println(question);
		question.setTitle(question.getTitle() + "0123456789");
		questionService.updateFullByIdSelective(question);
		System.out.println(question);*/
		return "web/question/edit";
	}
	
	/**
	 * 删除题目
	 */
	@RequestMapping("/web/question/del")
	public String del() {
		return "web/question/del";
	}
}
