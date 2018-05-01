package cn.lwy.service;

import java.util.List;

import cn.lwy.exception.GeneralException;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.vo.PageVo;
import cn.lwy.vo.QuestionVo;

public interface QuestionService extends BaseService<Question>{

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
	/**
	 * 根据条件 获取题目信息
	 */
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
	 * 根据条件查询  分页查询
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
     * @param question 基本数据
     * @param vo  传过来的数据（选项和答案）
     * @throws GeneralException 抛异常则表示更新失败
     */
    void insertFullByIdSelective(Question question, QuestionVo vo) throws GeneralException;
    
    /**
     * 更新所有数据
     * @param question 基本数据
     * @param vo  传过来的数据（选项和答案）
     * @throws GeneralException  抛异常则表示更新失败
     */
    void updateFullByIdSelective(Question question, QuestionVo vo) throws GeneralException;
}
