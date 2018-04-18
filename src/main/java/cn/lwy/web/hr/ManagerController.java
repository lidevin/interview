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
	 * @param flag  是否记住密码  true为记住密码
	 * @return
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
			return "redirect:/web/admin.do";
		}else {
			return "redirect:/web";
		}
	}
	
	@RequestMapping("/web/admin.do")
	public String toAdmin() {
		return "web/admin";
	}
	
	@RequestMapping({"/","/web"})
	public String toLogin() {
		return "web/login";
	}
}
