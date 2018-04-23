package cn.lwy.web.hr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherController {
	
	@RequestMapping("/web/statistic/paper")
	public String paper() {
		return "web/statistic/paper";
	}
	@RequestMapping("/web/statistic/question")
	public String question() {
		return "web/statistic/question";
	}
}
