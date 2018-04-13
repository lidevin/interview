package cn.lwy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.mapper.QuestionMapper;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionMapper questionMapper;
	
	@Override
	public Question getById(Number id) {
		return questionMapper.selectByPrimaryKey((Integer)id);
	}
	
	public List<Question> getByExample(QuestionExample example){
		return questionMapper.selectByExample(example);
	}
	@Override
	public boolean deleteById(Number id) {
		if(questionMapper.deleteByPrimaryKey((Integer)id) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(Question entity) {
		if(questionMapper.insert(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertSelective(Question entity) {
		if(questionMapper.insertSelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateByIdSelective(Question entity) {
		if(questionMapper.updateByPrimaryKeySelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateById(Question entity) {
		if(questionMapper.updateByPrimaryKey(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public Question getWithTagById(Integer id) {
		return questionMapper.selectWithTagByPrimaryKey(id);
	}

	@Override
	public Question getWithChoiceById(Integer id) {
		return questionMapper.selectWithChoiceByPrimaryKey(id);
	}

	@Override
	public Question getFullById(Integer id) {
		return questionMapper.selectFullByPrimaryKey(id);
	}
	
	@Override
	public List<Question> getWithChoiceByExample(QuestionExample example) {
		return questionMapper.selectWithChoiceByExample(example);
	}

	@Override
	public List<Question> getWithTagByExample(QuestionExample example) {
		return questionMapper.selectWithTagByExample(example);
	}

	@Override
	public List<Question> getFullByExample(QuestionExample example) {
		return questionMapper.selectFullByExample(example);
	}

}
