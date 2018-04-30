package cn.lwy.service;

import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.vo.PageVo;

public interface AssessmentService {

	Page<Assessment> getPaper(PaperExample example, PageVo vo);
	
	Page<Assessment> getQuestion(QuestionExample example, PageVo vo);
	
}
