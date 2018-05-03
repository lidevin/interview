package cn.lwy.web.wx;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.lwy.pojo.Interviewer;
import cn.lwy.service.InterviewerService;

public class WxInterviewerController {

	private InterviewerService interviewerService;
	
	@Value("${COOKIE.HRNAME}")
	private String cookieUserName;
	
	@Value("${COOKIE.PWD}")
	private String cookiePwd;
	
	@Value("${SESSION.USER}")
	private String sessionUser;
	
	/**
	 * 跳转到面试官登录页面
	 */
	@RequestMapping("/wx/ilogin")
	public String toInterviewLogin() {
		return "wx/boss_login";
	}
	
	@RequestMapping("/wx/ilogin.do")
	public String interviewlogin(HttpServletRequest request,HttpServletResponse response, 
		Interviewer interviewer, String isRem, RedirectAttributes attr) {
		boolean flag = interviewerService.getByNickname(interviewer);
		if(flag) {//登录成功
			HttpSession session = request.getSession();
			if(isRem != null && "login".equals(isRem)) {
				//用户名
				Cookie name = new Cookie(cookieUserName, interviewer.getNickname());
				name.setMaxAge(Integer.MAX_VALUE);
				name.setPath("/");
				//密码
				Cookie pwd = new Cookie(cookiePwd, interviewer.getPwd());
				pwd.setMaxAge(Integer.MAX_VALUE);
				pwd.setPath("/");
				//添加到cookies
				response.addCookie(name);
				response.addCookie(pwd);
			}
			//将manager对象存入到session
			session.setAttribute(sessionUser, interviewer);
			return "redirect:/wx/iindex";
		}else {//重新登录
			attr.addFlashAttribute("errMsg", "用户名或密码错误");
			return "redirect:/wx/ilogin";
		}
	}
	/**
	 * 面试官主页
	 * @return
	 */
	@RequestMapping("/wx/iindex")
	public String toInterviewIndex() {//面试官主页
		return "wx/boss_index";
	}
}
