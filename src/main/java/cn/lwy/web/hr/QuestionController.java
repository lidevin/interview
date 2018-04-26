package cn.lwy.web.hr;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Page;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.QuestionService;
import cn.lwy.vo.PageVo;

@Controller
public class QuestionController {
	
	private static Logger logger = Logger.getLogger(QuestionController.class);
	
	@Autowired
	private QuestionService questionService;
	
	@Value("${HR.QUESTION.PAGESIZE}")
	private String pageSizeStr;
	/**
	 * 显示题目
	 */
	@RequestMapping("/web/question")
	public String list(Model model,PageVo vo, String title) {
		vo.setSize(Integer.valueOf(pageSizeStr));
		QuestionExample example = new QuestionExample();
		if(title == null || "".equals(title.trim())) {
			example.createCriteria().andDifficultIsNotNull();//永真
		}else {
			example.createCriteria().andTitleLike("%"+ title +"%");
			model.addAttribute("title", title);
			System.out.println("查询");
		}
		Page<Question> page = questionService.getWithKindByExampleAndVo(example, vo);
		model.addAttribute("page", page);
		return "web/question";
	}
	
	/**
	 * 添加题目
	 */
	@RequestMapping("/web/question/add")
	public String add(Model model, Question question) {
		logger.debug("==>" + question);
		if(question != null) {
			model.addAttribute("add", true);
		}
		return "web/question/add";
	}
	
	/**
	 * 编辑题目
	 */
	@RequestMapping("/web/question/edit")
	public String edit() {
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
