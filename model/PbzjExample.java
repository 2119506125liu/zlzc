package com.zlzc.model;
import java.util.ArrayList;
import java.util.List;
public class PbzjExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public PbzjExample() {
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
		public Criteria andZjNameIsNull() {
			addCriterion("zj_name is null");
			return (Criteria) this;
		}
		public Criteria andZjNameIsNotNull(){
			addCriterion("zj_name is not null");
			return (Criteria) this;
		}
		public Criteria andZjNameEqualTo(String value) {
			addCriterion("zj_name =", value, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameNotEqualTo(String value) {
			addCriterion("zj_name <>", value, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameGreaterThan(String value) {
			addCriterion("zj_name >", value, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameGreaterThanOrEqualTo(String value) {
			addCriterion("zj_name >=", value, "ZjName");
			return (Criteria) this;
		}
		public Criteria andZjNameLessThan(String value) {
			addCriterion("zj_name <", value, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameLessThanOrEqualTo(String value) {
			addCriterion("zj_name <=", value, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameIn(List<String> values) {
			addCriterion("zj_name in", values, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameNotIn(List<String> values) {
			addCriterion("zj_name not in", values, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameBetween(String value1, String value2) {
			addCriterion("zj_name between", value1, value2, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameNotBetween(String value1, String value2) {
			addCriterion("zj_name not between", value1, value2, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameLike(String value) {
			addCriterion("zj_name like", value, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjNameNotLike(String value) {
			addCriterion("zj_name not like", value, "zjName");
			return (Criteria) this;
		}
		public Criteria andZjCelIsNull() {
			addCriterion("zj_cel is null");
			return (Criteria) this;
		}
		public Criteria andZjCelIsNotNull(){
			addCriterion("zj_cel is not null");
			return (Criteria) this;
		}
		public Criteria andZjCelEqualTo(String value) {
			addCriterion("zj_cel =", value, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelNotEqualTo(String value) {
			addCriterion("zj_cel <>", value, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelGreaterThan(String value) {
			addCriterion("zj_cel >", value, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelGreaterThanOrEqualTo(String value) {
			addCriterion("zj_cel >=", value, "ZjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelLessThan(String value) {
			addCriterion("zj_cel <", value, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelLessThanOrEqualTo(String value) {
			addCriterion("zj_cel <=", value, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelIn(List<String> values) {
			addCriterion("zj_cel in", values, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelNotIn(List<String> values) {
			addCriterion("zj_cel not in", values, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelBetween(String value1, String value2) {
			addCriterion("zj_cel between", value1, value2, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelNotBetween(String value1, String value2) {
			addCriterion("zj_cel not between", value1, value2, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelLike(String value) {
			addCriterion("zj_cel like", value, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjCelNotLike(String value) {
			addCriterion("zj_cel not like", value, "zjCel");
			return (Criteria) this;
		}
		public Criteria andZjIntroIsNull() {
			addCriterion("zj_intro is null");
			return (Criteria) this;
		}
		public Criteria andZjIntroIsNotNull(){
			addCriterion("zj_intro is not null");
			return (Criteria) this;
		}
		public Criteria andZjIntroEqualTo(String value) {
			addCriterion("zj_intro =", value, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroNotEqualTo(String value) {
			addCriterion("zj_intro <>", value, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroGreaterThan(String value) {
			addCriterion("zj_intro >", value, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroGreaterThanOrEqualTo(String value) {
			addCriterion("zj_intro >=", value, "ZjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroLessThan(String value) {
			addCriterion("zj_intro <", value, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroLessThanOrEqualTo(String value) {
			addCriterion("zj_intro <=", value, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroIn(List<String> values) {
			addCriterion("zj_intro in", values, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroNotIn(List<String> values) {
			addCriterion("zj_intro not in", values, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroBetween(String value1, String value2) {
			addCriterion("zj_intro between", value1, value2, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroNotBetween(String value1, String value2) {
			addCriterion("zj_intro not between", value1, value2, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroLike(String value) {
			addCriterion("zj_intro like", value, "zjIntro");
			return (Criteria) this;
		}
		public Criteria andZjIntroNotLike(String value) {
			addCriterion("zj_intro not like", value, "zjIntro");
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
