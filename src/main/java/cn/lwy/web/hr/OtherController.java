package cn.lwy.web.hr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lwy.mapper.KindMapper;
import cn.lwy.pojo.Kind;
import cn.lwy.pojo.KindExample;

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
	
	@Autowired
	private KindMapper kindMapper;
	
	@RequestMapping("/web/kind")
	public @ResponseBody List<Kind> list() {
		KindExample example = new KindExample();
		example.createCriteria().andIdIsNotNull();
		return kindMapper.selectByExample(example);
	}
	
}
