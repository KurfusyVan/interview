package com.kurfusy.interview.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class WageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andSalaryIdIsNull() {
            addCriterion("salary_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNotNull() {
            addCriterion("salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdEqualTo(String value) {
            addCriterion("salary_id =", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotEqualTo(String value) {
            addCriterion("salary_id <>", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThan(String value) {
            addCriterion("salary_id >", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("salary_id >=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThan(String value) {
            addCriterion("salary_id <", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThanOrEqualTo(String value) {
            addCriterion("salary_id <=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLike(String value) {
            addCriterion("salary_id like", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotLike(String value) {
            addCriterion("salary_id not like", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIn(List<String> values) {
            addCriterion("salary_id in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotIn(List<String> values) {
            addCriterion("salary_id not in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdBetween(String value1, String value2) {
            addCriterion("salary_id between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotBetween(String value1, String value2) {
            addCriterion("salary_id not between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andPayYearIsNull() {
            addCriterion("pay_year is null");
            return (Criteria) this;
        }

        public Criteria andPayYearIsNotNull() {
            addCriterion("pay_year is not null");
            return (Criteria) this;
        }

        public Criteria andPayYearEqualTo(String value) {
            addCriterion("pay_year =", value, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearNotEqualTo(String value) {
            addCriterion("pay_year <>", value, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearGreaterThan(String value) {
            addCriterion("pay_year >", value, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearGreaterThanOrEqualTo(String value) {
            addCriterion("pay_year >=", value, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearLessThan(String value) {
            addCriterion("pay_year <", value, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearLessThanOrEqualTo(String value) {
            addCriterion("pay_year <=", value, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearLike(String value) {
            addCriterion("pay_year like", value, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearNotLike(String value) {
            addCriterion("pay_year not like", value, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearIn(List<String> values) {
            addCriterion("pay_year in", values, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearNotIn(List<String> values) {
            addCriterion("pay_year not in", values, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearBetween(String value1, String value2) {
            addCriterion("pay_year between", value1, value2, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayYearNotBetween(String value1, String value2) {
            addCriterion("pay_year not between", value1, value2, "payYear");
            return (Criteria) this;
        }

        public Criteria andPayMonthIsNull() {
            addCriterion("pay_month is null");
            return (Criteria) this;
        }

        public Criteria andPayMonthIsNotNull() {
            addCriterion("pay_month is not null");
            return (Criteria) this;
        }

        public Criteria andPayMonthEqualTo(String value) {
            addCriterion("pay_month =", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthNotEqualTo(String value) {
            addCriterion("pay_month <>", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthGreaterThan(String value) {
            addCriterion("pay_month >", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthGreaterThanOrEqualTo(String value) {
            addCriterion("pay_month >=", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthLessThan(String value) {
            addCriterion("pay_month <", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthLessThanOrEqualTo(String value) {
            addCriterion("pay_month <=", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthLike(String value) {
            addCriterion("pay_month like", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthNotLike(String value) {
            addCriterion("pay_month not like", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthIn(List<String> values) {
            addCriterion("pay_month in", values, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthNotIn(List<String> values) {
            addCriterion("pay_month not in", values, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthBetween(String value1, String value2) {
            addCriterion("pay_month between", value1, value2, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthNotBetween(String value1, String value2) {
            addCriterion("pay_month not between", value1, value2, "payMonth");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;
        private final String typeHandler;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;

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
    }
}