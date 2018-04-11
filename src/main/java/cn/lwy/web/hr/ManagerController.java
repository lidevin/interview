package cn.lwy.web.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Manager;
import cn.lwy.service.ManagerService;

@Controller
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	@RequestMapping("/login")
	public String login() {
		Manager manager = new Manager();
		manager.setName("123");
		manager.setPwd("123");
		boolean loginFlag = managerService.getByName(manager);
		
		if(loginFlag) {
			return "index";
		}else {
			return "login";
		}
	}
	
}
