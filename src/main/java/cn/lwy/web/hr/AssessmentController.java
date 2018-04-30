package cn.lwy.web.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.AssessmentService;
import cn.lwy.vo.PageVo;

@Controller
public class AssessmentController {
	
	@Autowired
	private AssessmentService assessmenService;
	
	@Value("${HR.ASSESSMENT.PAGESIZE}")
	private String pageSizeStr;
	
	@RequestMapping("/web/statistic/paper")
	public String paper(Model model, String name, PageVo vo) {
		if(vo == null)	vo = new PageVo();
		vo.setSize(Integer.valueOf(pageSizeStr));
		PaperExample example = new PaperExample();
		if(name == null || "".equals(name.trim())) {//查询所有
			example.createCriteria().andDifficultIsNotNull();//永真
		}else {
			example.createCriteria().andTypeLike("%" + name + "%");
			model.addAttribute("title", name);
		}
		Page<Assessment> page = assessmenService.getPaper(example, vo);
		model.addAttribute("page", page);
		return "web/statistic/paper";
	}
	
	
	@RequestMapping("/web/statistic/question")
	public String question(Model model, String name, PageVo vo) {
		if(vo == null)	vo = new PageVo();
		vo.setSize(Integer.valueOf(pageSizeStr));
		QuestionExample example = new QuestionExample();
		if(name == null || "".equals(name.trim())) {//查询所有
			example.createCriteria().andDifficultIsNotNull();//永真
		}else {
			example.createCriteria().andTitleLike("%" + name + "%");
			model.addAttribute("title", name);
		}
		Page<Assessment> page = assessmenService.getQuestion(example, vo);
		model.addAttribute("page", page);
		return "web/statistic/question";
	}

}
