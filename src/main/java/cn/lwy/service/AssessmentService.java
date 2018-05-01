package cn.lwy.service;

import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.AssessmentExample;
import cn.lwy.pojo.Page;
import cn.lwy.vo.PageVo;

public interface AssessmentService {

	/**
	 * 分页查询
	 * @param example  基础条件
	 * @param vo  分页条件
	 * @param type  1：题目查询   2 ：试卷查询
	 * @return  查询结果封装到了<T>Page对象中
	 */
	Page<Assessment> getByExampleAndVo(AssessmentExample example, PageVo vo,int type);
	
}
