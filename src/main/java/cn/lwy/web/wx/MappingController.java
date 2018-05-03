package cn.lwy.web.wx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MappingController {
	
	/**
	 * 候选人登陆逻辑
	 * */
	@RequestMapping("/wx/candicade/index")
	public String candicadeLogin() {
		return "wx/candicade/index";
	}
	/**
	 * 候选人注册页面
	 * */
	@RequestMapping("/wx/candicade/register")
	public String register() {
		return "wx/candicade/register";
	}
	
	/**
	 * 候选人考试页面
	 * */
	@RequestMapping("/wx/candicade/exam")
	public String exam() {
		return "wx/candicade/exam";
	}
	
	/**
	 * 
	 * 候选人提交页面
	 * */
	@RequestMapping("/wx/candicade/success")
	public String success(){
		
		return "wx/candicade/seccess";
	}
	
	
	
	/**
	 * 候选人登陆逻辑
	 * */
	@RequestMapping("/wx/interviewer/login")
	public String interviewLogin() {
		return "wx/interviewer/login";
	}
	

	
	/**
	 * 
	 * 更新微信菜单 
	 * */
	@RequestMapping("/wx/creatMenu")
	public void createMenu(){
		Menu menu = new Menu();
		menu.createMenu();		
	}
	
}
