package com.zlzc.model;
import java.util.ArrayList;
import java.util.List;
public class ZbMsgExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public ZbMsgExample() {
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
		public Criteria andCgidIsNull() {
			addCriterion("cgid is null");
			return (Criteria) this;
		}
		public Criteria andCgidIsNotNull(){
			addCriterion("cgid is not null");
			return (Criteria) this;
		}
		public Criteria andCgidEqualTo(Integer value) {
			addCriterion("cgid =", value, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidNotEqualTo(Integer value) {
			addCriterion("cgid <>", value, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidGreaterThan(Integer value) {
			addCriterion("cgid >", value, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidGreaterThanOrEqualTo(Integer value) {
			addCriterion("cgid >=", value, "Cgid");
			return (Criteria) this;
		}
		public Criteria andCgidLessThan(Integer value) {
			addCriterion("cgid <", value, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidLessThanOrEqualTo(Integer value) {
			addCriterion("cgid <=", value, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidIn(List<Integer> values) {
			addCriterion("cgid in", values, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidNotIn(List<Integer> values) {
			addCriterion("cgid not in", values, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidBetween(Integer value1, Integer value2) {
			addCriterion("cgid between", value1, value2, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidNotBetween(Integer value1, Integer value2) {
			addCriterion("cgid not between", value1, value2, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidLike(Integer value) {
			addCriterion("cgid like", value, "cgid");
			return (Criteria) this;
		}
		public Criteria andCgidNotLike(Integer value) {
			addCriterion("cgid not like", value, "cgid");
			return (Criteria) this;
		}
		public Criteria andZbsIsNull() {
			addCriterion("zbs is null");
			return (Criteria) this;
		}
		public Criteria andZbsIsNotNull(){
			addCriterion("zbs is not null");
			return (Criteria) this;
		}
		public Criteria andZbsEqualTo(String value) {
			addCriterion("zbs =", value, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsNotEqualTo(String value) {
			addCriterion("zbs <>", value, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsGreaterThan(String value) {
			addCriterion("zbs >", value, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsGreaterThanOrEqualTo(String value) {
			addCriterion("zbs >=", value, "Zbs");
			return (Criteria) this;
		}
		public Criteria andZbsLessThan(String value) {
			addCriterion("zbs <", value, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsLessThanOrEqualTo(String value) {
			addCriterion("zbs <=", value, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsIn(List<String> values) {
			addCriterion("zbs in", values, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsNotIn(List<String> values) {
			addCriterion("zbs not in", values, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsBetween(String value1, String value2) {
			addCriterion("zbs between", value1, value2, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsNotBetween(String value1, String value2) {
			addCriterion("zbs not between", value1, value2, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsLike(String value) {
			addCriterion("zbs like", value, "zbs");
			return (Criteria) this;
		}
		public Criteria andZbsNotLike(String value) {
			addCriterion("zbs not like", value, "zbs");
			return (Criteria) this;
		}
		public Criteria andLxfsIsNull() {
			addCriterion("lxfs is null");
			return (Criteria) this;
		}
		public Criteria andLxfsIsNotNull(){
			addCriterion("lxfs is not null");
			return (Criteria) this;
		}
		public Criteria andLxfsEqualTo(String value) {
			addCriterion("lxfs =", value, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsNotEqualTo(String value) {
			addCriterion("lxfs <>", value, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsGreaterThan(String value) {
			addCriterion("lxfs >", value, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsGreaterThanOrEqualTo(String value) {
			addCriterion("lxfs >=", value, "Lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsLessThan(String value) {
			addCriterion("lxfs <", value, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsLessThanOrEqualTo(String value) {
			addCriterion("lxfs <=", value, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsIn(List<String> values) {
			addCriterion("lxfs in", values, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsNotIn(List<String> values) {
			addCriterion("lxfs not in", values, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsBetween(String value1, String value2) {
			addCriterion("lxfs between", value1, value2, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsNotBetween(String value1, String value2) {
			addCriterion("lxfs not between", value1, value2, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsLike(String value) {
			addCriterion("lxfs like", value, "lxfs");
			return (Criteria) this;
		}
		public Criteria andLxfsNotLike(String value) {
			addCriterion("lxfs not like", value, "lxfs");
			return (Criteria) this;
		}
		public Criteria andZbFileIsNull() {
			addCriterion("zb_file is null");
			return (Criteria) this;
		}
		public Criteria andZbFileIsNotNull(){
			addCriterion("zb_file is not null");
			return (Criteria) this;
		}
		public Criteria andZbFileEqualTo(String value) {
			addCriterion("zb_file =", value, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileNotEqualTo(String value) {
			addCriterion("zb_file <>", value, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileGreaterThan(String value) {
			addCriterion("zb_file >", value, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileGreaterThanOrEqualTo(String value) {
			addCriterion("zb_file >=", value, "ZbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileLessThan(String value) {
			addCriterion("zb_file <", value, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileLessThanOrEqualTo(String value) {
			addCriterion("zb_file <=", value, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileIn(List<String> values) {
			addCriterion("zb_file in", values, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileNotIn(List<String> values) {
			addCriterion("zb_file not in", values, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileBetween(String value1, String value2) {
			addCriterion("zb_file between", value1, value2, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileNotBetween(String value1, String value2) {
			addCriterion("zb_file not between", value1, value2, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileLike(String value) {
			addCriterion("zb_file like", value, "zbFile");
			return (Criteria) this;
		}
		public Criteria andZbFileNotLike(String value) {
			addCriterion("zb_file not like", value, "zbFile");
			return (Criteria) this;
		}
		public Criteria andPbzjIsNull() {
			addCriterion("pbzj is null");
			return (Criteria) this;
		}
		public Criteria andPbzjIsNotNull(){
			addCriterion("pbzj is not null");
			return (Criteria) this;
		}
		public Criteria andPbzjEqualTo(Integer value) {
			addCriterion("pbzj =", value, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjNotEqualTo(Integer value) {
			addCriterion("pbzj <>", value, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjGreaterThan(Integer value) {
			addCriterion("pbzj >", value, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjGreaterThanOrEqualTo(Integer value) {
			addCriterion("pbzj >=", value, "Pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjLessThan(Integer value) {
			addCriterion("pbzj <", value, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjLessThanOrEqualTo(Integer value) {
			addCriterion("pbzj <=", value, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjIn(List<Integer> values) {
			addCriterion("pbzj in", values, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjNotIn(List<Integer> values) {
			addCriterion("pbzj not in", values, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjBetween(Integer value1, Integer value2) {
			addCriterion("pbzj between", value1, value2, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjNotBetween(Integer value1, Integer value2) {
			addCriterion("pbzj not between", value1, value2, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjLike(Integer value) {
			addCriterion("pbzj like", value, "pbzj");
			return (Criteria) this;
		}
		public Criteria andPbzjNotLike(Integer value) {
			addCriterion("pbzj not like", value, "pbzj");
			return (Criteria) this;
		}
		public Criteria andZbTimeIsNull() {
			addCriterion("zb_time is null");
			return (Criteria) this;
		}
		public Criteria andZbTimeIsNotNull(){
			addCriterion("zb_time is not null");
			return (Criteria) this;
		}
		public Criteria andZbTimeEqualTo(String value) {
			addCriterion("zb_time =", value, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeNotEqualTo(String value) {
			addCriterion("zb_time <>", value, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeGreaterThan(String value) {
			addCriterion("zb_time >", value, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeGreaterThanOrEqualTo(String value) {
			addCriterion("zb_time >=", value, "ZbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeLessThan(String value) {
			addCriterion("zb_time <", value, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeLessThanOrEqualTo(String value) {
			addCriterion("zb_time <=", value, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeIn(List<String> values) {
			addCriterion("zb_time in", values, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeNotIn(List<String> values) {
			addCriterion("zb_time not in", values, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeBetween(String value1, String value2) {
			addCriterion("zb_time between", value1, value2, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeNotBetween(String value1, String value2) {
			addCriterion("zb_time not between", value1, value2, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeLike(String value) {
			addCriterion("zb_time like", value, "zbTime");
			return (Criteria) this;
		}
		public Criteria andZbTimeNotLike(String value) {
			addCriterion("zb_time not like", value, "zbTime");
			return (Criteria) this;
		}
		public Criteria andLxrIsNull() {
			addCriterion("lxr is null");
			return (Criteria) this;
		}
		public Criteria andLxrIsNotNull(){
			addCriterion("lxr is not null");
			return (Criteria) this;
		}
		public Criteria andLxrEqualTo(String value) {
			addCriterion("lxr =", value, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrNotEqualTo(String value) {
			addCriterion("lxr <>", value, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrGreaterThan(String value) {
			addCriterion("lxr >", value, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrGreaterThanOrEqualTo(String value) {
			addCriterion("lxr >=", value, "Lxr");
			return (Criteria) this;
		}
		public Criteria andLxrLessThan(String value) {
			addCriterion("lxr <", value, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrLessThanOrEqualTo(String value) {
			addCriterion("lxr <=", value, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrIn(List<String> values) {
			addCriterion("lxr in", values, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrNotIn(List<String> values) {
			addCriterion("lxr not in", values, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrBetween(String value1, String value2) {
			addCriterion("lxr between", value1, value2, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrNotBetween(String value1, String value2) {
			addCriterion("lxr not between", value1, value2, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrLike(String value) {
			addCriterion("lxr like", value, "lxr");
			return (Criteria) this;
		}
		public Criteria andLxrNotLike(String value) {
			addCriterion("lxr not like", value, "lxr");
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
