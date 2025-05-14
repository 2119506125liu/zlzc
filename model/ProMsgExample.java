package com.zlzc.model;
import java.util.ArrayList;
import java.util.List;
public class ProMsgExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public ProMsgExample() {
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
		public Criteria andProNameIsNull() {
			addCriterion("pro_name is null");
			return (Criteria) this;
		}
		public Criteria andProNameIsNotNull(){
			addCriterion("pro_name is not null");
			return (Criteria) this;
		}
		public Criteria andProNameEqualTo(String value) {
			addCriterion("pro_name =", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotEqualTo(String value) {
			addCriterion("pro_name <>", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameGreaterThan(String value) {
			addCriterion("pro_name >", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameGreaterThanOrEqualTo(String value) {
			addCriterion("pro_name >=", value, "ProName");
			return (Criteria) this;
		}
		public Criteria andProNameLessThan(String value) {
			addCriterion("pro_name <", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameLessThanOrEqualTo(String value) {
			addCriterion("pro_name <=", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameIn(List<String> values) {
			addCriterion("pro_name in", values, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotIn(List<String> values) {
			addCriterion("pro_name not in", values, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameBetween(String value1, String value2) {
			addCriterion("pro_name between", value1, value2, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotBetween(String value1, String value2) {
			addCriterion("pro_name not between", value1, value2, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameLike(String value) {
			addCriterion("pro_name like", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotLike(String value) {
			addCriterion("pro_name not like", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProImgIsNull() {
			addCriterion("pro_img is null");
			return (Criteria) this;
		}
		public Criteria andProImgIsNotNull(){
			addCriterion("pro_img is not null");
			return (Criteria) this;
		}
		public Criteria andProImgEqualTo(String value) {
			addCriterion("pro_img =", value, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgNotEqualTo(String value) {
			addCriterion("pro_img <>", value, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgGreaterThan(String value) {
			addCriterion("pro_img >", value, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgGreaterThanOrEqualTo(String value) {
			addCriterion("pro_img >=", value, "ProImg");
			return (Criteria) this;
		}
		public Criteria andProImgLessThan(String value) {
			addCriterion("pro_img <", value, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgLessThanOrEqualTo(String value) {
			addCriterion("pro_img <=", value, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgIn(List<String> values) {
			addCriterion("pro_img in", values, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgNotIn(List<String> values) {
			addCriterion("pro_img not in", values, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgBetween(String value1, String value2) {
			addCriterion("pro_img between", value1, value2, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgNotBetween(String value1, String value2) {
			addCriterion("pro_img not between", value1, value2, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgLike(String value) {
			addCriterion("pro_img like", value, "proImg");
			return (Criteria) this;
		}
		public Criteria andProImgNotLike(String value) {
			addCriterion("pro_img not like", value, "proImg");
			return (Criteria) this;
		}
		public Criteria andProIntroIsNull() {
			addCriterion("pro_intro is null");
			return (Criteria) this;
		}
		public Criteria andProIntroIsNotNull(){
			addCriterion("pro_intro is not null");
			return (Criteria) this;
		}
		public Criteria andProIntroEqualTo(String value) {
			addCriterion("pro_intro =", value, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroNotEqualTo(String value) {
			addCriterion("pro_intro <>", value, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroGreaterThan(String value) {
			addCriterion("pro_intro >", value, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroGreaterThanOrEqualTo(String value) {
			addCriterion("pro_intro >=", value, "ProIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroLessThan(String value) {
			addCriterion("pro_intro <", value, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroLessThanOrEqualTo(String value) {
			addCriterion("pro_intro <=", value, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroIn(List<String> values) {
			addCriterion("pro_intro in", values, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroNotIn(List<String> values) {
			addCriterion("pro_intro not in", values, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroBetween(String value1, String value2) {
			addCriterion("pro_intro between", value1, value2, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroNotBetween(String value1, String value2) {
			addCriterion("pro_intro not between", value1, value2, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroLike(String value) {
			addCriterion("pro_intro like", value, "proIntro");
			return (Criteria) this;
		}
		public Criteria andProIntroNotLike(String value) {
			addCriterion("pro_intro not like", value, "proIntro");
			return (Criteria) this;
		}
		public Criteria andStockNumIsNull() {
			addCriterion("stock_num is null");
			return (Criteria) this;
		}
		public Criteria andStockNumIsNotNull(){
			addCriterion("stock_num is not null");
			return (Criteria) this;
		}
		public Criteria andStockNumEqualTo(Integer value) {
			addCriterion("stock_num =", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumNotEqualTo(Integer value) {
			addCriterion("stock_num <>", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumGreaterThan(Integer value) {
			addCriterion("stock_num >", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("stock_num >=", value, "StockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumLessThan(Integer value) {
			addCriterion("stock_num <", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumLessThanOrEqualTo(Integer value) {
			addCriterion("stock_num <=", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumIn(List<Integer> values) {
			addCriterion("stock_num in", values, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumNotIn(List<Integer> values) {
			addCriterion("stock_num not in", values, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumBetween(Integer value1, Integer value2) {
			addCriterion("stock_num between", value1, value2, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumNotBetween(Integer value1, Integer value2) {
			addCriterion("stock_num not between", value1, value2, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumLike(Integer value) {
			addCriterion("stock_num like", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumNotLike(Integer value) {
			addCriterion("stock_num not like", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andGysIsNull() {
			addCriterion("gys is null");
			return (Criteria) this;
		}
		public Criteria andGysIsNotNull(){
			addCriterion("gys is not null");
			return (Criteria) this;
		}
		public Criteria andGysEqualTo(Integer value) {
			addCriterion("gys =", value, "gys");
			return (Criteria) this;
		}
		public Criteria andGysNotEqualTo(Integer value) {
			addCriterion("gys <>", value, "gys");
			return (Criteria) this;
		}
		public Criteria andGysGreaterThan(Integer value) {
			addCriterion("gys >", value, "gys");
			return (Criteria) this;
		}
		public Criteria andGysGreaterThanOrEqualTo(Integer value) {
			addCriterion("gys >=", value, "Gys");
			return (Criteria) this;
		}
		public Criteria andGysLessThan(Integer value) {
			addCriterion("gys <", value, "gys");
			return (Criteria) this;
		}
		public Criteria andGysLessThanOrEqualTo(Integer value) {
			addCriterion("gys <=", value, "gys");
			return (Criteria) this;
		}
		public Criteria andGysIn(List<Integer> values) {
			addCriterion("gys in", values, "gys");
			return (Criteria) this;
		}
		public Criteria andGysNotIn(List<Integer> values) {
			addCriterion("gys not in", values, "gys");
			return (Criteria) this;
		}
		public Criteria andGysBetween(Integer value1, Integer value2) {
			addCriterion("gys between", value1, value2, "gys");
			return (Criteria) this;
		}
		public Criteria andGysNotBetween(Integer value1, Integer value2) {
			addCriterion("gys not between", value1, value2, "gys");
			return (Criteria) this;
		}
		public Criteria andGysLike(Integer value) {
			addCriterion("gys like", value, "gys");
			return (Criteria) this;
		}
		public Criteria andGysNotLike(Integer value) {
			addCriterion("gys not like", value, "gys");
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
