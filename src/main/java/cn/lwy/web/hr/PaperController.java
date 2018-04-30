package cn.lwy.web.hr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Page;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.Question;
import cn.lwy.service.PaperService;
import cn.lwy.vo.PageVo;

@Controller
public class PaperController {
	
	@Autowired
	private PaperService paperService;
	
	@Value("${HR.PAPER.PAGESIZE}")
	private String pageSizeStr;
	/**
	 * 显示试卷信息
	 */
	@RequestMapping("/web/paper")
	public String list(Model model, String name, PageVo vo) {
		vo.setSize(Integer.valueOf(pageSizeStr));
		PaperExample example = new PaperExample();
		if(name == null || "".equals(name.trim())) {
			example.createCriteria().andIdIsNotNull();
		}else {
			example.createCriteria().andTypeLike("%" + name + "%");
		}
		Page<Paper> page = paperService.getByExampleAndVo(example, vo);
		model.addAttribute("page", page);
		return "web/paper";
	}
	
	/**
	 * 编辑试卷
	 */
	@RequestMapping("/web/paper/edit")
	public String edit() {
		
		return "web/paper/edit";
	}
	/**
	 * 跳转到添加试卷信息页面
	 */
	@RequestMapping("/web/paper/add")
	public String toAdd() {
		return "web/paper/add";
	}
	
	/**
	 * 添加试卷
	 */
	@RequestMapping("/web/paper/add.do")
	public String add(Model model, Paper paper) {
		try {
			paperService.insertWithQstSelective(paper);
		} catch (Exception e) {
			model.addAttribute("add", 0);
			return "web/paper/add";
		}
		model.addAttribute("add", 1);
		model.addAttribute("id", paper.getId());
		return "web/paper/add";
		
	}
	/**
	 * 显示试卷题目
	 * @return
	 */
	@RequestMapping("/web/paper/qst")
	public String qst(Model model,Integer pid) {
		List<Question> questions = paperService.getQstList(pid);
		model.addAttribute("questions", questions);
		return "web/paper/qst";
	}
	
	/**
	 * 删除试卷
	 * @return
	 */
	@RequestMapping("/web/paper/del")
	public String del(Model model, Integer id) {
		boolean flag = paperService.deleteById(id);
		if(flag) {
			model.addAttribute("del", 1);
		}else {
			model.addAttribute("del", 0);
		}
		return "web/paper";
	}
}
