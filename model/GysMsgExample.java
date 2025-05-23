package com.zlzc.model;
import java.util.ArrayList;
import java.util.List;
public class GysMsgExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public GysMsgExample() {
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
		public Criteria andGysNameIsNull() {
			addCriterion("gys_name is null");
			return (Criteria) this;
		}
		public Criteria andGysNameIsNotNull(){
			addCriterion("gys_name is not null");
			return (Criteria) this;
		}
		public Criteria andGysNameEqualTo(String value) {
			addCriterion("gys_name =", value, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameNotEqualTo(String value) {
			addCriterion("gys_name <>", value, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameGreaterThan(String value) {
			addCriterion("gys_name >", value, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameGreaterThanOrEqualTo(String value) {
			addCriterion("gys_name >=", value, "GysName");
			return (Criteria) this;
		}
		public Criteria andGysNameLessThan(String value) {
			addCriterion("gys_name <", value, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameLessThanOrEqualTo(String value) {
			addCriterion("gys_name <=", value, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameIn(List<String> values) {
			addCriterion("gys_name in", values, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameNotIn(List<String> values) {
			addCriterion("gys_name not in", values, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameBetween(String value1, String value2) {
			addCriterion("gys_name between", value1, value2, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameNotBetween(String value1, String value2) {
			addCriterion("gys_name not between", value1, value2, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameLike(String value) {
			addCriterion("gys_name like", value, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysNameNotLike(String value) {
			addCriterion("gys_name not like", value, "gysName");
			return (Criteria) this;
		}
		public Criteria andGysCelIsNull() {
			addCriterion("gys_cel is null");
			return (Criteria) this;
		}
		public Criteria andGysCelIsNotNull(){
			addCriterion("gys_cel is not null");
			return (Criteria) this;
		}
		public Criteria andGysCelEqualTo(String value) {
			addCriterion("gys_cel =", value, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelNotEqualTo(String value) {
			addCriterion("gys_cel <>", value, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelGreaterThan(String value) {
			addCriterion("gys_cel >", value, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelGreaterThanOrEqualTo(String value) {
			addCriterion("gys_cel >=", value, "GysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelLessThan(String value) {
			addCriterion("gys_cel <", value, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelLessThanOrEqualTo(String value) {
			addCriterion("gys_cel <=", value, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelIn(List<String> values) {
			addCriterion("gys_cel in", values, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelNotIn(List<String> values) {
			addCriterion("gys_cel not in", values, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelBetween(String value1, String value2) {
			addCriterion("gys_cel between", value1, value2, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelNotBetween(String value1, String value2) {
			addCriterion("gys_cel not between", value1, value2, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelLike(String value) {
			addCriterion("gys_cel like", value, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysCelNotLike(String value) {
			addCriterion("gys_cel not like", value, "gysCel");
			return (Criteria) this;
		}
		public Criteria andGysAddressIsNull() {
			addCriterion("gys_address is null");
			return (Criteria) this;
		}
		public Criteria andGysAddressIsNotNull(){
			addCriterion("gys_address is not null");
			return (Criteria) this;
		}
		public Criteria andGysAddressEqualTo(String value) {
			addCriterion("gys_address =", value, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressNotEqualTo(String value) {
			addCriterion("gys_address <>", value, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressGreaterThan(String value) {
			addCriterion("gys_address >", value, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressGreaterThanOrEqualTo(String value) {
			addCriterion("gys_address >=", value, "GysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressLessThan(String value) {
			addCriterion("gys_address <", value, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressLessThanOrEqualTo(String value) {
			addCriterion("gys_address <=", value, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressIn(List<String> values) {
			addCriterion("gys_address in", values, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressNotIn(List<String> values) {
			addCriterion("gys_address not in", values, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressBetween(String value1, String value2) {
			addCriterion("gys_address between", value1, value2, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressNotBetween(String value1, String value2) {
			addCriterion("gys_address not between", value1, value2, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressLike(String value) {
			addCriterion("gys_address like", value, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andGysAddressNotLike(String value) {
			addCriterion("gys_address not like", value, "gysAddress");
			return (Criteria) this;
		}
		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}
		public Criteria andRemarkIsNotNull(){
			addCriterion("remark is not null");
			return (Criteria) this;
		}
		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "Remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIsNotNull(){
			addCriterion("create_time is not null");
			return (Criteria) this;
		}
		public Criteria andCreateTimeEqualTo(String value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotEqualTo(String value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeGreaterThan(String value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
			addCriterion("create_time >=", value, "CreateTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLessThan(String value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLessThanOrEqualTo(String value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIn(List<String> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotIn(List<String> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeBetween(String value1, String value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotBetween(String value1, String value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLike(String value) {
			addCriterion("create_time like", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotLike(String value) {
			addCriterion("create_time not like", value, "createTime");
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
