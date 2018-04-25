package cn.lwy.web.hr;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.druid.filter.AutoLoad;

import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.Manager;
import cn.lwy.service.InterviewerService;

@Controller
public class InterviewController {
	@Autowired
	private InterviewerService interviewerService;
	
	@Value("${COOKIE.HRNAME}")
	private String cookieUserName;
	
	@Value("${COOKIE.PWD}")
	private String cookiePwd;
	
	@Value("${SESSION.USERNAME}")
	private String sessionUserName;
	
	
	/*
	 * 面试官登陆校验
	 * */
	@RequestMapping("/wx/boss_login.do")
	public String login(HttpServletRequest request,HttpServletResponse response, 
			Interviewer interviewer, RedirectAttributes attr) throws Exception{
		
		return "redirect:/wx/boss_login";
	}
	
	
	/**
	 * 退出功能
	 */
	@RequestMapping("/wx/quit")
	public String quit(HttpServletRequest request,HttpServletResponse response) {
		//清除session
		request.getSession().removeAttribute(sessionUserName);
		//清除cookie
		Cookie name = new Cookie(cookieUserName, null);
		name.setMaxAge(0);
		name.setPath("/wx/boss_login.do");
		response.addCookie(name);
		
		return "redirect:/wx/login";
	}

	
	
	
	
	@RequestMapping("/web/interview")
	public String list() {
		return "web/interview";
	}
	
	@RequestMapping("/web/interview/add")
	public String add() {
		return "web/interview/add";
	}
	@RequestMapping("/web/interview/edit")
	public String edit() {
		return "web/interview/edit";
	}
	
	@RequestMapping("/web/interview/del")
	public String del() {
		return "web/interview";
	}
}
