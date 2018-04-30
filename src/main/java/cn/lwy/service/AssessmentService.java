package cn.lwy.service;

import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.AssessmentExample;
import cn.lwy.pojo.Page;
import cn.lwy.vo.PageVo;

public interface AssessmentService {

	Page<Assessment> getByExampleAndVo(AssessmentExample example, PageVo vo,int type);
	
}
