package cn.lwy.web.wx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MappingController {

	@RequestMapping("/wx/ilogin")
	public String interviewLogin() {
		return "wx/boss_login";
	}
	
	@RequestMapping("/wx/clogin")
	public String candicadeLogin() {
		return "wx/candicade_login";
	}
}
