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
	
	@RequestMapping("alogin")
	public String toLoginPage() {
		return "admin-login";
	}
	
	@RequestMapping("adminlogin")
	public String login(Manager manager) {
		System.out.println("-------" + manager.getName());
		boolean loginFlag = managerService.getByName(manager);
		if(loginFlag) {
			return "redirect:toAdmin";
		}else {
			return "redirect:/alogin";
		}
	}
	
	@RequestMapping("toAdmin")
	public String toIndex() {
		return "admin";
	}
}
