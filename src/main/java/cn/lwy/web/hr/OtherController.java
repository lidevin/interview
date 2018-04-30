package cn.lwy.web.hr;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lwy.mapper.DepartPostionMapper;
import cn.lwy.mapper.KindMapper;
import cn.lwy.pojo.DepartPostion;
import cn.lwy.pojo.DepartPostionExample;
import cn.lwy.pojo.Kind;
import cn.lwy.pojo.KindExample;

@Controller
public class OtherController {
	@Autowired
	private KindMapper kindMapper;
	/**
	 * 查找问题类别
	 */
	@RequestMapping("/web/kind")
	public @ResponseBody List<Kind> kind() {
		KindExample example = new KindExample();
		example.createCriteria().andIdIsNotNull();
		return kindMapper.selectByExample(example);
	}
	
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private DepartPostionMapper departPostionMapper;
	/**
	 * 查询所有部门列表，并存放到application域中
	 * @param request
	 */
	@RequestMapping("/web/departments")
	public @ResponseBody List<DepartPostion> departments() {
		DepartPostionExample example = new DepartPostionExample();
		example.createCriteria().andTypeEqualTo("0");
		List<DepartPostion> list = departPostionMapper.selectByExample(example);
		servletContext.setAttribute("departments", list);
		return list;
	}
	/**
	 * 查询所有职位列表，并存放到application域中
	 * @param request
	 */
	@RequestMapping("/web/positions")
	public @ResponseBody List<DepartPostion> postions() {
		DepartPostionExample example = new DepartPostionExample();
		example.createCriteria().andTypeEqualTo("1");
		List<DepartPostion> list = departPostionMapper.selectByExample(example);
		servletContext.setAttribute("postions", list);
		return list;
	}
}
