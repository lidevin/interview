package cn.lwy.service.impl;

import org.springframework.stereotype.Service;

import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.AssessmentService;
import cn.lwy.vo.PageVo;

@Service
public class AssessmentServiceImpl implements AssessmentService{

	@Override
	public Page<Assessment> getPaper(PaperExample example, PageVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Assessment> getQuestion(QuestionExample example, PageVo vo) {
		// TODO Auto-generated method stub
		return null;
	}
//	@Autowired
//	private AssessmentMapper assessmentMapper;
//	@Autowired
//	private QuestionMapper questionMapper;
//	@Autowired
//	private PaperMapper paperMapper;
//	@Autowired
//	private CandidatePaperMapper candidatePaperMapper;
//	//在调用时直接搞定
//	//这些有系统自动算出
//	@Override
//	public Page<Assessment> getPaper(PaperExample pexample, PageVo vo) {
//		Page<Question> page = new Page<Question>();
//		//每页显示行数
//		page.setSize(vo.getSize());
//		//设置当前页数
//		page.setPage(vo.getPage());
//		//计算当前的记录数
//		vo.setStartRow((vo.getPage()-1)*vo.getSize());
////		//设置所有记录数
////		page.setTotal(questionMapper.countByExample(example));
////		//设置查出的记录
////		page.setRows(questionMapper.selectWithKindByExampleAndVo(example,vo));
//		//查询到所有符合记录的试卷
//		List<Assessment> list = new ArrayList<>();
//		List<Paper> papers = paperMapper.selectByExampleAndVo(pexample, vo);
//		
//		if(papers != null) {
//			List<Integer> papersid = new ArrayList<Integer>();
//			for (Paper paper : papers) {
////				//计算
////				CandidatePaperExample cpexample = new CandidatePaperExample();
////				cpexample.createCriteria().andPidEqualTo(paper.getId());
////				//所有人的试卷信息
////				List<CandidatePaper> cpapers = candidatePaperMapper.selectByExample(cpexample);
////				int sum = 0;
////				for (CandidatePaper cpaper : cpapers) {
////					sum += cpaper.getScore();
////				}
////				AssessmentExample aexample = new AssessmentExample();
////				aexample.createCriteria().andPidEqualTo(paper.getId());
////				List<Assessment> assessments = assessmentMapper.selectByExample(aexample);
////				for (Assessment assessment : assessments) {
//////					assessment
////				}
////				list.add(e);
//			}
//			
//		}
//		
//		return page;
//	}
//
//	@Override
//	public Page<Assessment> getQuestion(QuestionExample example, PageVo vo) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
