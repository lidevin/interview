package cn.lwy.service;

import java.util.List;

import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;

public interface QuestionService extends BaseService<Question>{

	Question getWithTagById(Integer id);
	Question getWithChoiceById(Integer id);
	Question getFullById(Integer id);
	
	List<Question> getByExample(QuestionExample example);
	List<Question> getWithChoiceByExample(QuestionExample example);
    List<Question> getWithTagByExample(QuestionExample example);
    List<Question> getFullByExample(QuestionExample example);
	
    boolean insertFullByIdSelective(Question question);
    
    boolean updateFullByIdSelective(Question question);
}
