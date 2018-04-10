package cn.lwy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSingleCountIsNull() {
            addCriterion("single_count is null");
            return (Criteria) this;
        }

        public Criteria andSingleCountIsNotNull() {
            addCriterion("single_count is not null");
            return (Criteria) this;
        }

        public Criteria andSingleCountEqualTo(Byte value) {
            addCriterion("single_count =", value, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountNotEqualTo(Byte value) {
            addCriterion("single_count <>", value, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountGreaterThan(Byte value) {
            addCriterion("single_count >", value, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("single_count >=", value, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountLessThan(Byte value) {
            addCriterion("single_count <", value, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountLessThanOrEqualTo(Byte value) {
            addCriterion("single_count <=", value, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountIn(List<Byte> values) {
            addCriterion("single_count in", values, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountNotIn(List<Byte> values) {
            addCriterion("single_count not in", values, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountBetween(Byte value1, Byte value2) {
            addCriterion("single_count between", value1, value2, "singleCount");
            return (Criteria) this;
        }

        public Criteria andSingleCountNotBetween(Byte value1, Byte value2) {
            addCriterion("single_count not between", value1, value2, "singleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountIsNull() {
            addCriterion("multiple_count is null");
            return (Criteria) this;
        }

        public Criteria andMultipleCountIsNotNull() {
            addCriterion("multiple_count is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleCountEqualTo(Byte value) {
            addCriterion("multiple_count =", value, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountNotEqualTo(Byte value) {
            addCriterion("multiple_count <>", value, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountGreaterThan(Byte value) {
            addCriterion("multiple_count >", value, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("multiple_count >=", value, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountLessThan(Byte value) {
            addCriterion("multiple_count <", value, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountLessThanOrEqualTo(Byte value) {
            addCriterion("multiple_count <=", value, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountIn(List<Byte> values) {
            addCriterion("multiple_count in", values, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountNotIn(List<Byte> values) {
            addCriterion("multiple_count not in", values, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountBetween(Byte value1, Byte value2) {
            addCriterion("multiple_count between", value1, value2, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andMultipleCountNotBetween(Byte value1, Byte value2) {
            addCriterion("multiple_count not between", value1, value2, "multipleCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountIsNull() {
            addCriterion("judge_count is null");
            return (Criteria) this;
        }

        public Criteria andJudgeCountIsNotNull() {
            addCriterion("judge_count is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeCountEqualTo(Byte value) {
            addCriterion("judge_count =", value, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountNotEqualTo(Byte value) {
            addCriterion("judge_count <>", value, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountGreaterThan(Byte value) {
            addCriterion("judge_count >", value, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("judge_count >=", value, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountLessThan(Byte value) {
            addCriterion("judge_count <", value, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountLessThanOrEqualTo(Byte value) {
            addCriterion("judge_count <=", value, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountIn(List<Byte> values) {
            addCriterion("judge_count in", values, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountNotIn(List<Byte> values) {
            addCriterion("judge_count not in", values, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountBetween(Byte value1, Byte value2) {
            addCriterion("judge_count between", value1, value2, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andJudgeCountNotBetween(Byte value1, Byte value2) {
            addCriterion("judge_count not between", value1, value2, "judgeCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountIsNull() {
            addCriterion("subject_count is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCountIsNotNull() {
            addCriterion("subject_count is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCountEqualTo(Byte value) {
            addCriterion("subject_count =", value, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountNotEqualTo(Byte value) {
            addCriterion("subject_count <>", value, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountGreaterThan(Byte value) {
            addCriterion("subject_count >", value, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("subject_count >=", value, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountLessThan(Byte value) {
            addCriterion("subject_count <", value, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountLessThanOrEqualTo(Byte value) {
            addCriterion("subject_count <=", value, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountIn(List<Byte> values) {
            addCriterion("subject_count in", values, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountNotIn(List<Byte> values) {
            addCriterion("subject_count not in", values, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountBetween(Byte value1, Byte value2) {
            addCriterion("subject_count between", value1, value2, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andSubjectCountNotBetween(Byte value1, Byte value2) {
            addCriterion("subject_count not between", value1, value2, "subjectCount");
            return (Criteria) this;
        }

        public Criteria andDifficultIsNull() {
            addCriterion("difficult is null");
            return (Criteria) this;
        }

        public Criteria andDifficultIsNotNull() {
            addCriterion("difficult is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultEqualTo(Byte value) {
            addCriterion("difficult =", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultNotEqualTo(Byte value) {
            addCriterion("difficult <>", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultGreaterThan(Byte value) {
            addCriterion("difficult >", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultGreaterThanOrEqualTo(Byte value) {
            addCriterion("difficult >=", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultLessThan(Byte value) {
            addCriterion("difficult <", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultLessThanOrEqualTo(Byte value) {
            addCriterion("difficult <=", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultIn(List<Byte> values) {
            addCriterion("difficult in", values, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultNotIn(List<Byte> values) {
            addCriterion("difficult not in", values, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultBetween(Byte value1, Byte value2) {
            addCriterion("difficult between", value1, value2, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultNotBetween(Byte value1, Byte value2) {
            addCriterion("difficult not between", value1, value2, "difficult");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Byte value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Byte value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Byte value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Byte value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Byte value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Byte> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Byte> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Byte value1, Byte value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreIsNull() {
            addCriterion("candidate_score is null");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreIsNotNull() {
            addCriterion("candidate_score is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreEqualTo(Byte value) {
            addCriterion("candidate_score =", value, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreNotEqualTo(Byte value) {
            addCriterion("candidate_score <>", value, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreGreaterThan(Byte value) {
            addCriterion("candidate_score >", value, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("candidate_score >=", value, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreLessThan(Byte value) {
            addCriterion("candidate_score <", value, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreLessThanOrEqualTo(Byte value) {
            addCriterion("candidate_score <=", value, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreIn(List<Byte> values) {
            addCriterion("candidate_score in", values, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreNotIn(List<Byte> values) {
            addCriterion("candidate_score not in", values, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreBetween(Byte value1, Byte value2) {
            addCriterion("candidate_score between", value1, value2, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andCandidateScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("candidate_score not between", value1, value2, "candidateScore");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNull() {
            addCriterion("marking is null");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNotNull() {
            addCriterion("marking is not null");
            return (Criteria) this;
        }

        public Criteria andMarkingEqualTo(Byte value) {
            addCriterion("marking =", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotEqualTo(Byte value) {
            addCriterion("marking <>", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThan(Byte value) {
            addCriterion("marking >", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThanOrEqualTo(Byte value) {
            addCriterion("marking >=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThan(Byte value) {
            addCriterion("marking <", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThanOrEqualTo(Byte value) {
            addCriterion("marking <=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingIn(List<Byte> values) {
            addCriterion("marking in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotIn(List<Byte> values) {
            addCriterion("marking not in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingBetween(Byte value1, Byte value2) {
            addCriterion("marking between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotBetween(Byte value1, Byte value2) {
            addCriterion("marking not between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Byte value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Byte value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Byte value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Byte value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Byte value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Byte> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Byte> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Byte value1, Byte value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Byte value1, Byte value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}