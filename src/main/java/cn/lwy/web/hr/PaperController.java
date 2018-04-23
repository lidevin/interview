package cn.lwy.web.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.service.PaperService;

@Controller
public class PaperController {
	
	@Autowired
	private PaperService paperService;
	
	/**
	 * 显示试卷信息
	 */
	@RequestMapping("/web/paper")
	public String list() {
		
		return "web/paper";
	}
	
	/**
	 * 编辑试卷
	 */
	@RequestMapping("/web/paper/edit")
	public String edit() {
		
		return "web/paper/edit";
	}
	/**
	 * 添加试卷
	 */
	@RequestMapping("/web/paper/add")
	public String add() {
		
		return "web/paper/add";
	}
	
	/**
	 * 试卷题目
	 * @return
	 */
	@RequestMapping("/web/paper/qst")
	public String qst() {
		
		return "web/paper/qst";
	}
	/**
	 * 添加题目
	 * @return
	 */
	@RequestMapping("/web/paper/addqst")
	public String addqst() {
		
		return "web/paper/addqst";
	}
	/**
	 * 删除试卷
	 * @return
	 */
	@RequestMapping("/web/paper/del")
	public String del() {
		
		return "web/paper";
	}
}
