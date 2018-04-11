package cn.lwy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComController {

	@RequestMapping("index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("admin")
	public String admin() {
		return "admin/login";
	}
}
