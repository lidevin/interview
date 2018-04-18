package cn.lwy.web.hr;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Manager;
import cn.lwy.service.ManagerService;

@Controller
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	@Value("${SESSION.USERNAME}")
	private String sessionUserName;
	
	/**
	 * 登录处理
	 * @param flag  是否记住密码  true为记住密码
	 */
	@RequestMapping("/web/login.do")
	public String login(HttpServletRequest request,HttpServletResponse response, Manager manager, String flag) {
		flag = "true";
		boolean loginFlag = managerService.getByName(manager);
		HttpSession session = request.getSession();
		if(loginFlag) {//登录成功
			if(flag != null && "true".equals(flag)) {
				//用户名
				Cookie name = new Cookie("HRNAME", manager.getName());
				name.setMaxAge(Integer.MAX_VALUE);
				//密码
				Cookie pwd = new Cookie("PWD", manager.getName());
				pwd.setMaxAge(Integer.MAX_VALUE);
				//添加到cookies
				response.addCookie(name);
				response.addCookie(pwd);
			}
			//添加到session
			session.setAttribute(sessionUserName, manager.getName());
			return "redirect:/web/admin";
		}else {
			return "redirect:/web";
		}
	}
	/**
	 * 处理页面，跳转到后台主页
	 */
	@RequestMapping("/web/admin")
	public String toAdmin() {
		return "web/admin";
	}
	/**
	 * 把多个web路径重定向到/web
	 */
	@RequestMapping({"/", "/web/", "/web/login"})
	public String toLoginPage() {
		return "redirect:/web";
	}
	/**
	 * 显示登录界面
	 */
	@RequestMapping("/web")
	public String toLogin() {
		return "web/login";
	}
}
