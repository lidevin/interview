package cn.lwy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.exception.GeneralException;
import cn.lwy.mapper.ChoiceMapper;
import cn.lwy.mapper.KindMapper;
import cn.lwy.mapper.QuestionMapper;
import cn.lwy.pojo.Choice;
import cn.lwy.pojo.ChoiceExample;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.QuestionService;
import cn.lwy.utils.CommonUtils;
import cn.lwy.vo.PageVo;
import cn.lwy.vo.QuestionVo;

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
	public void updateFullByIdSelective(Question question, QuestionVo vo) throws GeneralException{
		Integer id = question.getId();
		if(question == null || id == null) {
			throw new GeneralException("question或id为null");
		}
		List<Choice> choices = new ArrayList<Choice>();
		String[] choiceArr = null;
		//设置answer, 从vo中提取选项
		switch (question.getQsttype()) {
			case 1://单选
				question.setAnswer(vo.getAnswers1());
				choiceArr = vo.getChoices1();
				break;
			case 2://多选
				question.setAnswer(CommonUtils.arrToString(vo.getAnswers2()));
				choiceArr = vo.getChoices2();
				break;
			case 3://判断
				question.setAnswer(vo.getAnswers3());
				choiceArr = vo.getChoices3();
				break;
			case 4://主观
				question.setAnswer(vo.getAnswers4());
				break;
			default:
				throw new GeneralException("题目类型有误");
		}
		int count = questionMapper.updateByPrimaryKeySelective(question);//更新数据
		if(count != 1)	throw new GeneralException("更新question对象有误");
		if(choiceArr != null) {//非主观题
			//获取所有选项
			for(int i = 0; i < choiceArr.length; i++) {
				Choice choice = new Choice();
				choice.setContent(choiceArr[i]);
				choice.setQid(id);
				choice.setNum((byte)i);
				choices.add(choice);
			}
			
			//更新所有选项
			count = 0;
			for (Choice choice : choices) {
				ChoiceExample example = new ChoiceExample();
				example.createCriteria().andQidEqualTo(id).andNumEqualTo(choice.getNum());
				int i = choiceMapper.updateByExampleSelective(choice, example);
				count += i;
			}
			if(count != choices.size()) {
				throw new GeneralException("更新选项有误");
			}
		}
	}

	@Override
	public void insertFullByIdSelective(Question question, QuestionVo vo) throws GeneralException{
		if(question == null || vo == null) {
			throw new GeneralException("question或vo为null");
		}
		//更具difficult和qsttype计算分数
		question.setScore();
		Integer id = -1;
		List<Choice> choices = new ArrayList<Choice>();
		switch (question.getQsttype()) {
			case 1://单选
				{
					question.setAnswer(vo.getAnswers1());
					int count = questionMapper.insertSelective(question);
					if(count != 1)	throw new GeneralException("添加question对象有误");
					id = question.getId();
					String[] choiceArr = vo.getChoices1();
					for(int i = 0; i < choiceArr.length; i++) {
						Choice choice = new Choice();
						choice.setContent(choiceArr[i]);
						choice.setQid(id);
						choice.setNum((byte)i);
						choices.add(choice);
					}
				}
				break;
			case 2://多选
				{
					question.setAnswer(CommonUtils.arrToString(vo.getAnswers2()));
					int count = questionMapper.insertSelective(question);
					if(count != 1)	throw new GeneralException("添加question对象有误");
					id = question.getId();
					String[] choiceArr = vo.getChoices2();
					for(int i = 0; i < choiceArr.length; i++) {
						Choice choice = new Choice();
						choice.setContent(choiceArr[i]);
						choice.setQid(id);
						choice.setNum((byte)i);
						choices.add(choice);
					}
				}
				break;
			case 3://判断
				{
					question.setAnswer(vo.getAnswers3());
					int count = questionMapper.insertSelective(question);
					if(count != 1)	throw new GeneralException("添加question对象有误");
					id = question.getId();
					String[] choiceArr = vo.getChoices3();
					for(int i = 0; i < choiceArr.length; i++) {
						Choice choice = new Choice();
						choice.setContent(choiceArr[i]);
						choice.setQid(id);
						choice.setNum((byte)i);
						choices.add(choice);
					}
				}
				break;
			case 4://主观
				{
					question.setAnswer(vo.getAnswers4());
					int count = questionMapper.insertSelective(question);
					if(count != 1)	throw new GeneralException("添加question对象有误");
				}
				break;
			default:
				throw new GeneralException("题目类型有误");
			}
		
		int count = 0;
		int size = choices.size();
		//添加选项
		if(size != 0) {
			for (Choice choice : choices) {
				count += choiceMapper.insertSelective(choice);
			}
			if(count != choices.size()) {
				throw new GeneralException("添加选项有误");
			}
		}
	}
	
	@Override
	public Page<Question> getWithKindByExampleAndVo(QuestionExample example, PageVo vo) {
		Page<Question> page = new Page<Question>();
		//每页显示行数
		page.setSize(vo.getSize());
		//设置当前页数
		page.setPage(vo.getPage());
		//计算当前的记录数
		vo.setStartRow((vo.getPage()-1)*vo.getSize());
		//设置所有记录数
		page.setTotal(questionMapper.countByExample(example));
		//设置查出的记录
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
}
