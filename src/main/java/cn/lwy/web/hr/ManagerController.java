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

import cn.lwy.pojo.Manager;
import cn.lwy.service.ManagerService;

@Controller
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	
	@Value("${COOKIE.HRNAME}")
	private String cookieUserName;
	
	@Value("${COOKIE.PWD}")
	private String cookiePwd;
	
	@Value("${SESSION.USERNAME}")
	private String sessionUserName;

	/**
	 * 登录处理
	 * @param isRem  是否记住密码  login为记住密码
	 */
	@RequestMapping("/web/login.do")
	public String login(HttpServletRequest request,HttpServletResponse response, 
			Manager manager, String isRem, RedirectAttributes attr) throws Exception{
		boolean isLogin = managerService.getByName(manager);
		HttpSession session = request.getSession();
		if(isLogin) {
			if(isRem != null && "login".equals(isRem)) {
				//用户名
				Cookie name = new Cookie(cookieUserName, manager.getName());
				name.setMaxAge(Integer.MAX_VALUE);
				name.setPath("/web");
				//密码
				Cookie pwd = new Cookie(cookiePwd, manager.getPwd());
				pwd.setMaxAge(Integer.MAX_VALUE);
				pwd.setPath("/web");
				//添加到cookies
				response.addCookie(name);
				response.addCookie(pwd);
			}
			//添加到session
			session.setAttribute(sessionUserName, manager.getName());
			return "redirect:/web/index.html";
		}else {
			attr.addFlashAttribute("errMsg", "用户名或密码错误");
			return "redirect:/web/login";
		}
	}

	/**
	 * 处理页面，跳转到后台主页
	 */
	@RequestMapping({"/", "/index.html", "/web", "/web/", "/web/index", "/web/index.html"})
	public String toIndex() {
		return "web/index";
	}

	/**
	 * 显示登录界面
	 */
	@RequestMapping("/web/login")
	public String toLogin(HttpServletRequest request,HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			Cookie name = null;
			Cookie pwd = null;
			for (Cookie cookie : cookies) {
				if(cookieUserName.equals(cookie.getName())) {
					name = cookie;
				}else if(cookiePwd.equals(cookie.getName())) {
					pwd = cookie;
				}
			}
			if(name!=null && pwd!=null) {//cookie中存在name和pwd
				return "redirect:/web/login.do?name="+name.getValue()+"&pwd="+pwd.getValue()+"&flag=true";
			}
		}
		return "web/login";
	}
	
	/**
	 * 退出功能
	 */
	@RequestMapping("/web/quit")
	public String quit(HttpServletRequest request,HttpServletResponse response) {
		//清除session
		request.getSession().removeAttribute(sessionUserName);
		//清除cookie
		Cookie name = new Cookie(cookieUserName, null);
		name.setMaxAge(0);
		name.setPath("/web");
		response.addCookie(name);
		
		return "redirect:/web/login";
	}

}
