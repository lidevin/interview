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

import cn.lwy.pojo.Candidate;
import cn.lwy.pojo.Manager;
import cn.lwy.service.CandidateService;
import cn.lwy.service.ManagerService;

@Controller
public class CandidateController {
	@Autowired
	private CandidateService canditateService;
	
	@Value("${COOKIE.HRNAME}")
	private String cookieUserName;
	
	@Value("${COOKIE.PWD}")
	private String cookiePwd;
	
	@Value("${SESSION.USERNAME}")
	private String sessionUserName;
	
	/**
	 * 
	 * 候选人登陆验证
	 * */
	@RequestMapping("/wx/login.do")
	public String login(HttpServletRequest request,HttpServletResponse response, 
			Candidate canditate, RedirectAttributes attr) throws Exception{
		
			return "redirect:/wx/login";
		}
	}

