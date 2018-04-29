package cn.lwy.web.hr;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.exception.GeneralException;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.QuestionService;
import cn.lwy.vo.PageVo;
import cn.lwy.vo.QuestionVo;

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
		}
		Page<Question> page = questionService.getWithKindByExampleAndVo(example, vo);
		model.addAttribute("page", page);
		return "web/question";
	}
	
	/**
	 * 跳转到添加页面
	 */
	@RequestMapping("/web/question/add")
	public String toAdd() {
		return "web/question/add";
	}
	/**
	 * 添加题目
	 */
	@RequestMapping("/web/question/add.do")
	public String add(Model model, Question question, QuestionVo vo) {
		try {
			questionService.insertFullByIdSelective(question, vo);
		} catch (GeneralException e) {
			//添加失败
			model.addAttribute("add", 0);
			return "web/question/add";
		}
		//添加成功
		model.addAttribute("add", 1);
		return "web/question/add";
	}
	/**
	 * 跳转到编辑网页
	 */
	@RequestMapping("/web/question/edit")
	public String toEdit(Model model, int id) {
		Question question = questionService.getFullById(id);
		question.setId(id);
		model.addAttribute("question", question);
		return "web/question/edit";
	}
	/**
	 * 编辑题目
	 */
	@RequestMapping("/web/question/edit.do")
	public String edit(Model model, Question question, QuestionVo vo) {
		logger.error(question);
		try {
			questionService.updateFullByIdSelective(question, vo);
		} catch (GeneralException e) {
			//编辑失败
			model.addAttribute("edit", 0);
			model.addAttribute("question", question);
			return "web/question/edit";
		}
		//编辑成功
		model.addAttribute("edit", 1);
		return "web/question/edit";
	}
	/**
	 * 删除题目
	 */
	@RequestMapping("/web/question/del.do")
	public String del(Model model, int id) {
		boolean flag = questionService.deleteById(id);
		list(model,new PageVo(),"");
		if(flag) {//删除成功
			model.addAttribute("del", 1);
		}else {//删除失败
			model.addAttribute("del", 0);
		}
		return "web/question";
	}
}
