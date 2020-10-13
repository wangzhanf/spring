package vip.epss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockpoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockpoolExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSholdIsNull() {
            addCriterion("shold is null");
            return (Criteria) this;
        }

        public Criteria andSholdIsNotNull() {
            addCriterion("shold is not null");
            return (Criteria) this;
        }

        public Criteria andSholdEqualTo(Integer value) {
            addCriterion("shold =", value, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdNotEqualTo(Integer value) {
            addCriterion("shold <>", value, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdGreaterThan(Integer value) {
            addCriterion("shold >", value, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shold >=", value, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdLessThan(Integer value) {
            addCriterion("shold <", value, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdLessThanOrEqualTo(Integer value) {
            addCriterion("shold <=", value, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdIn(List<Integer> values) {
            addCriterion("shold in", values, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdNotIn(List<Integer> values) {
            addCriterion("shold not in", values, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdBetween(Integer value1, Integer value2) {
            addCriterion("shold between", value1, value2, "shold");
            return (Criteria) this;
        }

        public Criteria andSholdNotBetween(Integer value1, Integer value2) {
            addCriterion("shold not between", value1, value2, "shold");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("sprice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("sprice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Double value) {
            addCriterion("sprice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Double value) {
            addCriterion("sprice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Double value) {
            addCriterion("sprice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sprice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Double value) {
            addCriterion("sprice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Double value) {
            addCriterion("sprice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Double> values) {
            addCriterion("sprice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Double> values) {
            addCriterion("sprice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Double value1, Double value2) {
            addCriterion("sprice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Double value1, Double value2) {
            addCriterion("sprice not between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSintimeIsNull() {
            addCriterion("sintime is null");
            return (Criteria) this;
        }

        public Criteria andSintimeIsNotNull() {
            addCriterion("sintime is not null");
            return (Criteria) this;
        }

        public Criteria andSintimeEqualTo(Date value) {
            addCriterion("sintime =", value, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeNotEqualTo(Date value) {
            addCriterion("sintime <>", value, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeGreaterThan(Date value) {
            addCriterion("sintime >", value, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sintime >=", value, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeLessThan(Date value) {
            addCriterion("sintime <", value, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeLessThanOrEqualTo(Date value) {
            addCriterion("sintime <=", value, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeIn(List<Date> values) {
            addCriterion("sintime in", values, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeNotIn(List<Date> values) {
            addCriterion("sintime not in", values, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeBetween(Date value1, Date value2) {
            addCriterion("sintime between", value1, value2, "sintime");
            return (Criteria) this;
        }

        public Criteria andSintimeNotBetween(Date value1, Date value2) {
            addCriterion("sintime not between", value1, value2, "sintime");
            return (Criteria) this;
        }

        public Criteria andFaidIsNull() {
            addCriterion("faid is null");
            return (Criteria) this;
        }

        public Criteria andFaidIsNotNull() {
            addCriterion("faid is not null");
            return (Criteria) this;
        }

        public Criteria andFaidEqualTo(Integer value) {
            addCriterion("faid =", value, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidNotEqualTo(Integer value) {
            addCriterion("faid <>", value, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidGreaterThan(Integer value) {
            addCriterion("faid >", value, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("faid >=", value, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidLessThan(Integer value) {
            addCriterion("faid <", value, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidLessThanOrEqualTo(Integer value) {
            addCriterion("faid <=", value, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidIn(List<Integer> values) {
            addCriterion("faid in", values, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidNotIn(List<Integer> values) {
            addCriterion("faid not in", values, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidBetween(Integer value1, Integer value2) {
            addCriterion("faid between", value1, value2, "faid");
            return (Criteria) this;
        }

        public Criteria andFaidNotBetween(Integer value1, Integer value2) {
            addCriterion("faid not between", value1, value2, "faid");
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