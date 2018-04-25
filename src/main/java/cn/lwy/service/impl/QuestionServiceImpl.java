package cn.lwy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.mapper.ChoiceMapper;
import cn.lwy.mapper.KindMapper;
import cn.lwy.mapper.QuestionMapper;
import cn.lwy.pojo.Choice;
import cn.lwy.pojo.ChoiceExample;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.QuestionService;
import cn.lwy.vo.PageVo;

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
	public Question getWithChoiceById(Integer id) {
		ChoiceExample example = new ChoiceExample();
		example.createCriteria().andQidEqualTo(id);
		List<Choice> choices = choiceMapper.selectByExample(example);
		Question question = this.getById(id);
		question.setChoices(choices);
		return question;
	}

	@Override
	public Question getFullById(Integer id) {
		Question question = getWithChoiceById(id);
		question.setKind(kindMapper.selectByPrimaryKey(question.getKid()).getKind());
		return question;
	}
	
	@Override
	public List<Question> getWithChoiceByExample(QuestionExample example) {
		List<Question> questions = questionMapper.selectByExample(example);
		for (Question question : questions) {
			ChoiceExample e = new ChoiceExample();
			e.createCriteria().andQidEqualTo(question.getId());
			List<Choice> choices = choiceMapper.selectByExample(e);
			question.setChoices(choices);
			
		}
		return questions;
	}


	@Override
	public List<Question> getFullByExample(QuestionExample example) {
		List<Question> questions = this.getWithChoiceByExample(example);
		for (Question question : questions) {
			question.setKind(kindMapper.selectByPrimaryKey(question.getKid()).getKind());
		}
		return questions;
	}

	@Autowired
	private ChoiceMapper choiceMapper;
	
	@Override
	public boolean updateFullByIdSelective(Question question) {
		if(question == null || question.getId() == null) {
			return false;
		}
		int count = 0;
		List<Choice> choices = question.getChoices();
		if(choices != null) {
			for (Choice choice : choices) {
				ChoiceExample example = new ChoiceExample();
				example.createCriteria().andQidEqualTo(question.getId());
				count += choiceMapper.updateByExampleSelective(choice, example);
			}
		}
		if(count != choices.size()) {
			return false;
		}
		return true;
	}

	@Override
	public boolean insertFullByIdSelective(Question question) {
		if(question == null || question.getId() == null) {
			return false;
		}
		int count = 0;
		List<Choice> choices = question.getChoices();
		if(choices != null) {
			for (Choice choice : choices) {
				count += choiceMapper.insertSelective(choice);
			}
		}
		if(count != choices.size()) {
			return false;
		}
		return false;
	}
	
	@Override
	public Page<Question> getWithKindByExampleAndVo(QuestionExample example, PageVo vo) {
		Page<Question> page = new Page<Question>();
		if(vo == null) {
			vo = new PageVo();
		}
		//每页显示行数
		page.setSize(vo.getSize());
		vo.setStartRow((vo.getPage()-1)*vo.getSize());
		page.setTotal(questionMapper.countByExample(example));
		
		page.setRows(questionMapper.selectWithKindByExampleAndVo(example,vo));
		return page;
	}
	
	@Autowired
	private KindMapper kindMapper;
	@Override
	public Question getWithKindById(Integer id) {
		Question question = this.getById(id);
		question.setKind(kindMapper.selectByPrimaryKey(question.getKid()).getKind());
		return question;
	}

	@Override
	public List<Question> getWithKindByExample(QuestionExample example) {
		List<Question> questions = this.getByExample(example);
		for (Question question : questions) {
			question.setKind(kindMapper.selectByPrimaryKey(question.getKid()).getKind());
		}
		return questions;
	}

	@Override
	public Question getById(Integer id) {
		return questionMapper.selectByPrimaryKey(id);
	}
}
