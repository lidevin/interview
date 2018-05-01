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
	 * @return  查询结果封装到Page对象中
	 */
	Page<Paper> getByExampleAndVo(PaperExample example, PageVo vo);

	/**
	 * 根据条件查询
	 * @param example 基本条件
	 * @return  从数据库中查询到的结果，并封装到Paper中
	 */
	List<Paper> getByExample(PaperExample example);

	/**
	 * 查询题目集合
	 * @param pid  题目的id
	 * @return  
	 */
	List<Question> getQstList(Integer pid);
	
	/**
	 * 插入试卷信息包括题目集
	 * @param paper  试卷
	 * @throws Exception  抛异常，则表示插入失败
	 */
	void insertWithQstSelective(Paper paper) throws Exception;
}
