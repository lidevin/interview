package cn.lwy.service;

import java.util.List;

import cn.lwy.pojo.Page;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.vo.PageVo;

public interface QuestionService extends BaseService<Question>{

	Question getById(Integer id);
	/**
	 * 获取题目信息包含kind字段
	 */
	Question getWithKindById(Integer id);
	/**
	 * 获取题目信息包含选项
	 */
	Question getWithChoiceById(Integer id);
	/**
	 * 获取题目信息包含kind字段和选项
	 */
	Question getFullById(Integer id);
	
	List<Question> getByExample(QuestionExample example);
	/**
	 * 根据条件 获取题目信息包含kind字段
	 */
	List<Question> getWithKindByExample(QuestionExample example);
	/**
	 * 根据条件 获取题目信息包含选项
	 */
	List<Question> getWithChoiceByExample(QuestionExample example);
	/**
	 * 根据条件查询
	 * @param example   基本条件
	 * @param vo   分页条件
	 */
	Page<Question> getWithKindByExampleAndVo(QuestionExample example, PageVo vo);
	/**
	 * 根据条件 获取题目信息包含kind字段和选项
	 */
    List<Question> getFullByExample(QuestionExample example);
    /**
     * 插入所有数据
     */
    boolean insertFullByIdSelective(Question question);
    /**
     * 更新所有数据
     */
    boolean updateFullByIdSelective(Question question);
	
}
