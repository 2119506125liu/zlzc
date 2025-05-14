package com.zlzc.model;
import java.util.ArrayList;
import java.util.List;
public class CompanyStaffExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public CompanyStaffExample() {
		oredCriteria = new ArrayList<>();
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
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setPageRows(int pageRows) {
		this.pageRows = pageRows;
	}
	public int getPageRows() {
		return pageRows;
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
			criteria = new ArrayList<>();
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
		public Criteria andIdIsNotNull(){
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
			addCriterion("id >=", value, "Id");
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
		public Criteria andIdLike(Integer value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotLike(Integer value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}
		public Criteria andStaffNameIsNull() {
			addCriterion("staff_name is null");
			return (Criteria) this;
		}
		public Criteria andStaffNameIsNotNull(){
			addCriterion("staff_name is not null");
			return (Criteria) this;
		}
		public Criteria andStaffNameEqualTo(String value) {
			addCriterion("staff_name =", value, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameNotEqualTo(String value) {
			addCriterion("staff_name <>", value, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameGreaterThan(String value) {
			addCriterion("staff_name >", value, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
			addCriterion("staff_name >=", value, "StaffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameLessThan(String value) {
			addCriterion("staff_name <", value, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameLessThanOrEqualTo(String value) {
			addCriterion("staff_name <=", value, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameIn(List<String> values) {
			addCriterion("staff_name in", values, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameNotIn(List<String> values) {
			addCriterion("staff_name not in", values, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameBetween(String value1, String value2) {
			addCriterion("staff_name between", value1, value2, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameNotBetween(String value1, String value2) {
			addCriterion("staff_name not between", value1, value2, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameLike(String value) {
			addCriterion("staff_name like", value, "staffName");
			return (Criteria) this;
		}
		public Criteria andStaffNameNotLike(String value) {
			addCriterion("staff_name not like", value, "staffName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameIsNull() {
			addCriterion("company_name is null");
			return (Criteria) this;
		}
		public Criteria andCompanyNameIsNotNull(){
			addCriterion("company_name is not null");
			return (Criteria) this;
		}
		public Criteria andCompanyNameEqualTo(String value) {
			addCriterion("company_name =", value, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameNotEqualTo(String value) {
			addCriterion("company_name <>", value, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameGreaterThan(String value) {
			addCriterion("company_name >", value, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
			addCriterion("company_name >=", value, "CompanyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameLessThan(String value) {
			addCriterion("company_name <", value, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameLessThanOrEqualTo(String value) {
			addCriterion("company_name <=", value, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameIn(List<String> values) {
			addCriterion("company_name in", values, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameNotIn(List<String> values) {
			addCriterion("company_name not in", values, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameBetween(String value1, String value2) {
			addCriterion("company_name between", value1, value2, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameNotBetween(String value1, String value2) {
			addCriterion("company_name not between", value1, value2, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameLike(String value) {
			addCriterion("company_name like", value, "companyName");
			return (Criteria) this;
		}
		public Criteria andCompanyNameNotLike(String value) {
			addCriterion("company_name not like", value, "companyName");
			return (Criteria) this;
		}
		public Criteria andCelphoneIsNull() {
			addCriterion("celphone is null");
			return (Criteria) this;
		}
		public Criteria andCelphoneIsNotNull(){
			addCriterion("celphone is not null");
			return (Criteria) this;
		}
		public Criteria andCelphoneEqualTo(String value) {
			addCriterion("celphone =", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneNotEqualTo(String value) {
			addCriterion("celphone <>", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneGreaterThan(String value) {
			addCriterion("celphone >", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneGreaterThanOrEqualTo(String value) {
			addCriterion("celphone >=", value, "Celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneLessThan(String value) {
			addCriterion("celphone <", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneLessThanOrEqualTo(String value) {
			addCriterion("celphone <=", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneIn(List<String> values) {
			addCriterion("celphone in", values, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneNotIn(List<String> values) {
			addCriterion("celphone not in", values, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneBetween(String value1, String value2) {
			addCriterion("celphone between", value1, value2, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneNotBetween(String value1, String value2) {
			addCriterion("celphone not between", value1, value2, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneLike(String value) {
			addCriterion("celphone like", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneNotLike(String value) {
			addCriterion("celphone not like", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}
		public Criteria andCreateDateIsNotNull(){
			addCriterion("create_date is not null");
			return (Criteria) this;
		}
		public Criteria andCreateDateEqualTo(String value) {
			addCriterion("create_date =", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateNotEqualTo(String value) {
			addCriterion("create_date <>", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateGreaterThan(String value) {
			addCriterion("create_date >", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
			addCriterion("create_date >=", value, "CreateDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateLessThan(String value) {
			addCriterion("create_date <", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateLessThanOrEqualTo(String value) {
			addCriterion("create_date <=", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateIn(List<String> values) {
			addCriterion("create_date in", values, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateNotIn(List<String> values) {
			addCriterion("create_date not in", values, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateBetween(String value1, String value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateNotBetween(String value1, String value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateLike(String value) {
			addCriterion("create_date like", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateNotLike(String value) {
			addCriterion("create_date not like", value, "createDate");
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
