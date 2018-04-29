package cn.lwy.web.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lwy.exception.GeneralException;
import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.InterviewerExample;
import cn.lwy.pojo.Page;
import cn.lwy.service.InterviewerService;
import cn.lwy.vo.PageVo;

@Controller
public class InterviewerController {
	
	@Autowired
	private InterviewerService interviewerService;
	
	@Value("${HR.INTERVIEW.PAGESIZE}")
	private String pageSizeStr;
	
	/**
	 * 显示面试官信息列表
	 * @param model
	 * @param vo
	 * @param name
	 * @return
	 */
	@RequestMapping("/web/interview")
	public String list(Model model,PageVo vo, String name) {
		if(vo == null)	vo = new PageVo();
		vo.setSize(Integer.valueOf(pageSizeStr));
		InterviewerExample example = new InterviewerExample();
		if(name == null || "".equals(name.trim())) {
			example.createCriteria().andNameIsNotNull();//查询所有
		}else {
			example.createCriteria().andNameLike("%" + name + "%");
			model.addAttribute("name", name);
		}
		Page<Interviewer> page = interviewerService.getByExampleAndVo(example, vo);
		model.addAttribute("page", page);
		return "web/interview";
	}
	
	/**
	 * 跳转到添加面试官页面
	 * @return
	 */
	@RequestMapping("/web/interview/add")
	public String toAdd() {
		return "web/interview/add";
	}
	
	/**
	 * 添加面试官信息
	 */
	@RequestMapping("/web/interview/add.do")
	public String add(Model model,Interviewer interviewer) {
		boolean flag = interviewerService.insertSelective(interviewer);
		if(flag) {
			model.addAttribute("add", 1);
		}else {
			model.addAttribute("add", 0);
		}
		return "web/interview/add";
	}
	
	/**
	 * 跳转到编辑面试官页面
	 * @param model
	 * @param id  面试官id
	 * @return
	 */
	@RequestMapping("/web/interview/edit")
	public String toEdit(Model model, Number id) {
		Interviewer interviewer = interviewerService.getById(id);
		interviewer.setId(id.toString());
		model.addAttribute("interviewer", interviewer);
		return "web/interview/edit";
	}
	
	/**
	 * 修改面试官信息
	 */
	@RequestMapping("/web/interview/edit.do")
	public String edit(Model model, Interviewer interviewer) {
		boolean flag = interviewerService.updateByIdSelective(interviewer);
		if(flag) {
			model.addAttribute("edit", 1);
		}else {
			model.addAttribute("edit", 0);
			model.addAttribute("interviewer", interviewer);
		}
		return "web/interview/edit";
	}
	
	/**
	 * 根据id删除面试官
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/web/interview/del.do")
	public String del(Model model,Number id) {
		boolean flag = interviewerService.deleteById(id);
		list(model,new PageVo(), null);
		if(flag) {
			model.addAttribute("del", 1);
		}else {
			model.addAttribute("del", 0);
		}
		return "web/interview";
	}
	
	@RequestMapping("/web/interview/check")
	public @ResponseBody GeneralException checkName(Model model,String name) {
		int count = interviewerService.countByNickname(name);
		if(count == 0) {
			return new GeneralException(0,"此用户名可用！");
		}else {
			return new GeneralException(1,"已有人使用该用户名，请尝试其他用户名");
		}
	}
}
