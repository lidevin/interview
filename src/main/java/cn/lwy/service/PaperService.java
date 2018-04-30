package cn.lwy.service;

import java.util.List;

import cn.lwy.pojo.Page;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.Question;
import cn.lwy.vo.PageVo;

public interface PaperService extends BaseService<Paper> {

	/**
	 * 分页查询
	 * @param example  基本条件
	 * @param vo  分页条件
	 * @return
	 */
	Page<Paper> getByExampleAndVo(PaperExample example, PageVo vo);

	List<Paper> getByExample(PaperExample example);

	/**
	 * 查询题目集合
	 */
	List<Question> getQstList(Integer pid);
	
	/**
	 * 插入试卷信息包括题目集
	 */
	void insertWithQstSelective(Paper paper) throws Exception;
}
