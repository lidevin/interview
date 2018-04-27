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
	public String add(Model model, Question question, QuestionVo vo) {
		if(question==null || question.getTitle()==null) {//首次加载页面
			logger.debug("null==>" + question);
			model.addAttribute("add", 0);
		}else {
			logger.debug("123==>" + question);
			logger.debug("1 == > " + vo.getAnswers1());
			logger.debug("1 == > " + vo.getChoices1().length);
			logger.debug("2 == > " + vo.getAnswers2().length);
			logger.debug("2 == > " + vo.getChoices2().length);
			logger.debug("3 == > " + vo.getAnswers3());
			logger.debug("3 == > " + vo.getChoices3().length);
			logger.debug("4 == > " + vo.getAnswers4());
//			question.setKid(1);
//			question.setQsttype((byte)1);
//			question.setScore((byte)10);
//			question.setTags("test t abc");
//			question.setAnswer("A");
//			List<Choice> choices = new ArrayList<Choice>();
//			Choice choice = new Choice();
//			choice.setQid(1);
//			choice.setContent("123");
//			choices.add(choice);
//			question.setChoices(choices);
			boolean flag = questionService.insertFullByIdSelective(question, vo);
			if(flag) {//插入成功
				model.addAttribute("add", 1);
			}else {//插入失败
				model.addAttribute("add", 2);
			}
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
