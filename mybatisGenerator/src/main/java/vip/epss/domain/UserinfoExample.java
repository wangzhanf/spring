package vip.epss.domain;

import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUiidIsNull() {
            addCriterion("uiid is null");
            return (Criteria) this;
        }

        public Criteria andUiidIsNotNull() {
            addCriterion("uiid is not null");
            return (Criteria) this;
        }

        public Criteria andUiidEqualTo(Integer value) {
            addCriterion("uiid =", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotEqualTo(Integer value) {
            addCriterion("uiid <>", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidGreaterThan(Integer value) {
            addCriterion("uiid >", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uiid >=", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidLessThan(Integer value) {
            addCriterion("uiid <", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidLessThanOrEqualTo(Integer value) {
            addCriterion("uiid <=", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidIn(List<Integer> values) {
            addCriterion("uiid in", values, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotIn(List<Integer> values) {
            addCriterion("uiid not in", values, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidBetween(Integer value1, Integer value2) {
            addCriterion("uiid between", value1, value2, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotBetween(Integer value1, Integer value2) {
            addCriterion("uiid not between", value1, value2, "uiid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFuidIsNull() {
            addCriterion("fuid is null");
            return (Criteria) this;
        }

        public Criteria andFuidIsNotNull() {
            addCriterion("fuid is not null");
            return (Criteria) this;
        }

        public Criteria andFuidEqualTo(Integer value) {
            addCriterion("fuid =", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidNotEqualTo(Integer value) {
            addCriterion("fuid <>", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidGreaterThan(Integer value) {
            addCriterion("fuid >", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuid >=", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidLessThan(Integer value) {
            addCriterion("fuid <", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidLessThanOrEqualTo(Integer value) {
            addCriterion("fuid <=", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidIn(List<Integer> values) {
            addCriterion("fuid in", values, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidNotIn(List<Integer> values) {
            addCriterion("fuid not in", values, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidBetween(Integer value1, Integer value2) {
            addCriterion("fuid between", value1, value2, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidNotBetween(Integer value1, Integer value2) {
            addCriterion("fuid not between", value1, value2, "fuid");
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