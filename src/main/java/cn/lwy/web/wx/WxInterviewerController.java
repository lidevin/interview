package cn.lwy.web.wx;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.Manager;
import cn.lwy.service.InterviewerService;

@Controller
public class WxInterviewerController {

	@Autowired
	private InterviewerService interviewerService;
	
	@Value("${COOKIE.HRNAME}")
	private String cookieUserName;
	
	@Value("${COOKIE.PWD}")
	private String cookiePwd;
	
	@Value("${SESSION.USER}")
	private String sessionUser;
	
	/**
	 * 跳转到登录界面
	 * @return
	 */
	@RequestMapping("/wx/interviewer/login")
	public String toLogin() {
		return "wx/interviewer/login";
	}

	/**
	 * 处理登录业务
	 */
	@RequestMapping("/wx/interviewer/login.do")
	public String login(HttpServletRequest request,HttpServletResponse response, 
			Interviewer interviewer, String isRem, RedirectAttributes attr) {
		try {
			interviewer = interviewerService.getByNickname(interviewer);
		} catch (Exception e) {
			attr.addFlashAttribute("errMsg", "用户名或密码错误");
			return "/wx/interviewer/login";
		}
		HttpSession session = request.getSession();
		if(isRem != null && "login".equals(isRem)) {
			//用户名
			Cookie name = new Cookie(cookieUserName, interviewer.getNickname());
			name.setMaxAge(Integer.MAX_VALUE);
			name.setPath("/web");
			//密码
			Cookie pwd = new Cookie(cookiePwd, interviewer.getPwd());
			pwd.setMaxAge(Integer.MAX_VALUE);
			pwd.setPath("/web");
			//添加到cookies
			response.addCookie(name);
			response.addCookie(pwd);
		}
		//将manager对象存入到session
		session.setAttribute(sessionUser, interviewer);
		return "/wx/interviewer/menu";
	}
	/**
	 * 处理退出业务
	 */
	@RequestMapping("/wx/interviewer/quit")
	public String quit(HttpServletRequest request,HttpServletResponse response) {
		//清除session
		request.getSession().removeAttribute(sessionUser);
		//清除cookie
		Cookie name = new Cookie(cookieUserName, null);
		name.setMaxAge(0);
		name.setPath("/");
		response.addCookie(name);
		return "/wx/interviewer/login";//返回登录界面
	}
	
	@RequestMapping("/wx/interviewer/menu")
	public String menu() {
		return "/wx/interviewer/menu";
	}
	
}
