package cn.lwy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.mapper.AssessmentMapper;
import cn.lwy.mapper.CandidatePaperMapper;
import cn.lwy.mapper.PaperMapper;
import cn.lwy.mapper.PaperQstMapper;
import cn.lwy.mapper.QuestionMapper;
import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.AssessmentExample;
import cn.lwy.pojo.CandidatePaper;
import cn.lwy.pojo.CandidatePaperExample;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.PaperQst;
import cn.lwy.pojo.PaperQstExample;
import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.StatisticService;

@Service
public class StatisticServiceImpl implements StatisticService {

	@Autowired
	private PaperQstMapper paperQstMapper;
	
	@Autowired
	private QuestionMapper questionMapper;
	
	@Autowired
	private AssessmentMapper assessmentMapper;
	
	@Override
	public void insertOrUpdateQuestion() {
		QuestionExample qexample = new QuestionExample();
		qexample.createCriteria().andTitleIsNotNull();
		//查询所有的题目
		List<Question> questions = questionMapper.selectByExample(qexample);
		if(questions != null) {
			//遍历所有的题目
			for (Question question : questions) {
				Integer qid = question.getId();
				Byte qsttype = question.getQsttype();
				PaperQstExample pqexample = new PaperQstExample();
				pqexample.createCriteria().andQstIdEqualTo(qid);
				//候选人做的题目信息
				List<PaperQst> paperQsts = paperQstMapper.selectByExample(pqexample);
				if(paperQsts != null && paperQsts.size() != 0) {
					int sum = 0;
					int count = 0;
					int size = paperQsts.size();
					Assessment assessment = new Assessment();
					String answer = question.getAnswer();
					if(qsttype != null && qsttype != 4) {//不是主观题 
						for (PaperQst paperQst : paperQsts) {
							sum += paperQst.getScore();
							String canswer = paperQst.getAnswer();
							//答案相同，则正确
							if(canswer!=null && answer!=null && canswer.trim().equals(answer.trim())) {
								count++;
							}
						}
						assessment.setAccuracy((float) (1.0 * count /  size / 100));//正确率
					}else {
						for (PaperQst paperQst : paperQsts) {
							sum += paperQst.getScore();
						}
						assessment.setAccuracy(null);//正确率
					}
					//算出正确率和平均分，并封装到Assessment中
					assessment.setQid(qid);
					assessment.setPid(null);
					assessment.setQuery(question.getTitle());
					assessment.setAvgerage((float) (1.0 * sum / size));//平均数
					AssessmentExample aexample = new AssessmentExample();
					aexample.createCriteria().andQidEqualTo(qid).andPidIsNull();
					//查询是否存在
					count = assessmentMapper.countByExample(aexample);
					if(count == 0) {//插入
						assessmentMapper.insertSelective(assessment);
					}else {//更新
						assessmentMapper.updateByExampleSelective(assessment, aexample);
					}
				}
			}
		}
	}
	
	@Autowired
	private PaperMapper paperMapper;
	
	@Autowired
	private CandidatePaperMapper CandidatePaperMapper;
	
	@Override
	public void insertOrUpdatePaper() {
		PaperExample pexample = new PaperExample();
		pexample.createCriteria().andIdIsNotNull();
		//查询所有试卷
		List<Paper> papers = paperMapper.selectByExample(pexample);
		if(papers != null) {
			for (Paper paper : papers) {
				//分析试卷
				Integer pid = paper.getId();
				CandidatePaperExample cpexample = new CandidatePaperExample();
				cpexample.createCriteria().andPidEqualTo(pid);
				List<CandidatePaper> cpapers = CandidatePaperMapper.selectByExample(cpexample);
				//所有候选人的试卷
				if(cpapers != null && cpapers.size() != 0) {
					int sum = 0;
					for (CandidatePaper cpaper : cpapers) {
						sum += cpaper.getScore();
					}
					int size = cpapers.size();
					//算出平均分，并封装到Assessment中
					Assessment assessment = new Assessment();
					assessment.setPid(pid);
					assessment.setQid(null);
					assessment.setQuery(paper.getType());
					assessment.setAvgerage((float) (1.0 * sum / size));//平均数
					assessment.setAccuracy(null);//正确率
					AssessmentExample aexample = new AssessmentExample();
					aexample.createCriteria().andPidEqualTo(pid).andQidIsNull();
					//查询是否存在
					int count = assessmentMapper.countByExample(aexample);
					if(count == 0) {//插入
						assessmentMapper.insertSelective(assessment);
					}else {//更新
						assessmentMapper.updateByExampleSelective(assessment, aexample);
					}
				}
					
			}
		}
	}

}
