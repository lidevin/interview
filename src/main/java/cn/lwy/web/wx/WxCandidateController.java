package cn.lwy.web.wx;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.mapper.CandidatePaperMapper;
import cn.lwy.pojo.Candidate;
import cn.lwy.pojo.CandidatePaper;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperQst;
import cn.lwy.service.CandidateService;
import cn.lwy.service.PaperService;

@Controller
public class WxCandidateController {

	@Autowired
	private CandidateService candidateService;
	
	@Value("${SESSION.USER}")
	private String sessionUser;
	
	/**
	 * 跳转到登录页面,并处理登录信息
	 */
	@RequestMapping("/wx/login")
	public String login(HttpServletRequest request, Candidate candidate) {
		try {
			candidate = candidateService.getByOpenid(candidate);
		}catch (Exception e) {
			return "redirect:/wx/regist";
		}
		request.getSession().setAttribute(sessionUser, candidate);
		return "redirect:/wx/choose";
	}
	/**
	 * 跳转到注册页面
	 */
	@RequestMapping("/wx/regist")
	public String toRegist() {
		return "/wx/regist";
	}
	
	/**
	 * 处理注册信息
	 */
	@RequestMapping("/wx/regist.do")
	public String regist(Model model,Candidate candidate) {
		boolean flag = candidateService.insertSelective(candidate);
		if(flag) {
			return "redirect:/wx/login";
		}
		model.addAttribute("errMsg", "注册失败！");
		return "/wx/regist";
	}
	
	/**
	 * 显示最近试卷
	 */
	@RequestMapping("/wx/choose")
	public String toChoose(Model model) {
		//60000ms = 1 m
		Long time = 120 * 60000L;//2个小时
		List<Paper> papers = candidateService.getRecentPaper(time);
		model.addAttribute("papers", papers);
		return "/wx/regist";//候选人的登录页面，请填写
	}
	private PaperService paperService;
	
	/**
	 * 查询试卷信息，并开始考试
	 * @return
	 */
	@RequestMapping("/wx/choosed.do")
	public String choose(Model model, Integer id) {
		Paper paper = paperService.getById(id);
		if(System.currentTimeMillis() >= paper.getStartTime().getTime()) {//考试时间到
			paper.setQuestions(paperService.getQstList(id));
			model.addAttribute("paper", paper);
			return "/wx/exam";
		}
		return "/wx/choose";
	}
	
	@RequestMapping("/wx/exam")
	public String toExam() {
		return "wx/exam";
	}
	
	/**
	 * 试卷提交
	 * @return
	 */
	@RequestMapping("/wx/exam.do")
	public String exam(HttpServletRequest request, Integer pid, List<PaperQst> pqsts) {
		// TODO Auto-generated method stub
		Candidate candidate = (Candidate)request.getSession().getAttribute(sessionUser);
		try {
			candidateService.insertQstAnswer(pid, candidate.getId(), pqsts);
		} catch (Exception e) {
			//提交失败
			// TODO Auto-generated catch block
			return "";//提交失败，跳转网页
		}
		return "wx/exam";//提交成功
	}
}
