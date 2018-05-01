package cn.lwy.web.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.AssessmentExample;
import cn.lwy.pojo.AssessmentExample.Criteria;
import cn.lwy.pojo.Page;
import cn.lwy.service.AssessmentService;
import cn.lwy.vo.PageVo;

@Controller
public class AssessmentController {
	
	@Autowired
	private AssessmentService assessmenService;
	
	@Value("${HR.ASSESSMENT.PAGESIZE}")
	private String pageSizeStr;
	
	@RequestMapping("/web/statistic/question")
	public String question(Model model, String query, PageVo vo) {
		if(vo == null)	vo = new PageVo();
		vo.setSize(Integer.valueOf(pageSizeStr));
		AssessmentExample example = new AssessmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andQidIsNotNull();
		if(query != null && !"".equals(query.trim())) {
			criteria.andQueryLike("%" + query + "%");
			model.addAttribute("title", query);
		}
		Page<Assessment> page = assessmenService.getByExampleAndVo(example, vo, 1);
		model.addAttribute("page", page);
		return "web/statistic/question";
	}
	
	@RequestMapping("/web/statistic/paper")
	public String paper(Model model, String query, PageVo vo) {
		if(vo == null)	vo = new PageVo();
		vo.setSize(Integer.valueOf(pageSizeStr));
		AssessmentExample example = new AssessmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidIsNotNull();
		if(query != null && !"".equals(query.trim())) {
			criteria.andQueryLike("%" + query + "%");
			model.addAttribute("name", query);
		}
		Page<Assessment> page = assessmenService.getByExampleAndVo(example, vo,2);
		model.addAttribute("page", page);
		return "web/statistic/paper";
	}
}
