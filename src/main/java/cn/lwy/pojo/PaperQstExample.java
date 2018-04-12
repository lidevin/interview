package cn.lwy.pojo;

import java.util.ArrayList;
import java.util.List;

public class PaperQstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperQstExample() {
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

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdIsNull() {
            addCriterion("candidate_id is null");
            return (Criteria) this;
        }

        public Criteria andCandidateIdIsNotNull() {
            addCriterion("candidate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateIdEqualTo(String value) {
            addCriterion("candidate_id =", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdNotEqualTo(String value) {
            addCriterion("candidate_id <>", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdGreaterThan(String value) {
            addCriterion("candidate_id >", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_id >=", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdLessThan(String value) {
            addCriterion("candidate_id <", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdLessThanOrEqualTo(String value) {
            addCriterion("candidate_id <=", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdLike(String value) {
            addCriterion("candidate_id like", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdNotLike(String value) {
            addCriterion("candidate_id not like", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdIn(List<String> values) {
            addCriterion("candidate_id in", values, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdNotIn(List<String> values) {
            addCriterion("candidate_id not in", values, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdBetween(String value1, String value2) {
            addCriterion("candidate_id between", value1, value2, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdNotBetween(String value1, String value2) {
            addCriterion("candidate_id not between", value1, value2, "candidateId");
            return (Criteria) this;
        }

        public Criteria andQstIdIsNull() {
            addCriterion("qst_id is null");
            return (Criteria) this;
        }

        public Criteria andQstIdIsNotNull() {
            addCriterion("qst_id is not null");
            return (Criteria) this;
        }

        public Criteria andQstIdEqualTo(Integer value) {
            addCriterion("qst_id =", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdNotEqualTo(Integer value) {
            addCriterion("qst_id <>", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdGreaterThan(Integer value) {
            addCriterion("qst_id >", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qst_id >=", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdLessThan(Integer value) {
            addCriterion("qst_id <", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdLessThanOrEqualTo(Integer value) {
            addCriterion("qst_id <=", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdIn(List<Integer> values) {
            addCriterion("qst_id in", values, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdNotIn(List<Integer> values) {
            addCriterion("qst_id not in", values, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdBetween(Integer value1, Integer value2) {
            addCriterion("qst_id between", value1, value2, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qst_id not between", value1, value2, "qstId");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerIsNull() {
            addCriterion("candidate_answer is null");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerIsNotNull() {
            addCriterion("candidate_answer is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerEqualTo(String value) {
            addCriterion("candidate_answer =", value, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerNotEqualTo(String value) {
            addCriterion("candidate_answer <>", value, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerGreaterThan(String value) {
            addCriterion("candidate_answer >", value, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_answer >=", value, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerLessThan(String value) {
            addCriterion("candidate_answer <", value, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerLessThanOrEqualTo(String value) {
            addCriterion("candidate_answer <=", value, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerLike(String value) {
            addCriterion("candidate_answer like", value, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerNotLike(String value) {
            addCriterion("candidate_answer not like", value, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerIn(List<String> values) {
            addCriterion("candidate_answer in", values, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerNotIn(List<String> values) {
            addCriterion("candidate_answer not in", values, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerBetween(String value1, String value2) {
            addCriterion("candidate_answer between", value1, value2, "candidateAnswer");
            return (Criteria) this;
        }

        public Criteria andCandidateAnswerNotBetween(String value1, String value2) {
            addCriterion("candidate_answer not between", value1, value2, "candidateAnswer");
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