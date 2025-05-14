package com.zlzc.model;
import java.util.ArrayList;
import java.util.List;
public class YcWarningExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public YcWarningExample() {
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
		public Criteria andYcIntroIsNull() {
			addCriterion("yc_intro is null");
			return (Criteria) this;
		}
		public Criteria andYcIntroIsNotNull(){
			addCriterion("yc_intro is not null");
			return (Criteria) this;
		}
		public Criteria andYcIntroEqualTo(String value) {
			addCriterion("yc_intro =", value, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroNotEqualTo(String value) {
			addCriterion("yc_intro <>", value, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroGreaterThan(String value) {
			addCriterion("yc_intro >", value, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroGreaterThanOrEqualTo(String value) {
			addCriterion("yc_intro >=", value, "YcIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroLessThan(String value) {
			addCriterion("yc_intro <", value, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroLessThanOrEqualTo(String value) {
			addCriterion("yc_intro <=", value, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroIn(List<String> values) {
			addCriterion("yc_intro in", values, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroNotIn(List<String> values) {
			addCriterion("yc_intro not in", values, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroBetween(String value1, String value2) {
			addCriterion("yc_intro between", value1, value2, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroNotBetween(String value1, String value2) {
			addCriterion("yc_intro not between", value1, value2, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroLike(String value) {
			addCriterion("yc_intro like", value, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcIntroNotLike(String value) {
			addCriterion("yc_intro not like", value, "ycIntro");
			return (Criteria) this;
		}
		public Criteria andYcTypeIsNull() {
			addCriterion("yc_type is null");
			return (Criteria) this;
		}
		public Criteria andYcTypeIsNotNull(){
			addCriterion("yc_type is not null");
			return (Criteria) this;
		}
		public Criteria andYcTypeEqualTo(Integer value) {
			addCriterion("yc_type =", value, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeNotEqualTo(Integer value) {
			addCriterion("yc_type <>", value, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeGreaterThan(Integer value) {
			addCriterion("yc_type >", value, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("yc_type >=", value, "YcType");
			return (Criteria) this;
		}
		public Criteria andYcTypeLessThan(Integer value) {
			addCriterion("yc_type <", value, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeLessThanOrEqualTo(Integer value) {
			addCriterion("yc_type <=", value, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeIn(List<Integer> values) {
			addCriterion("yc_type in", values, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeNotIn(List<Integer> values) {
			addCriterion("yc_type not in", values, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeBetween(Integer value1, Integer value2) {
			addCriterion("yc_type between", value1, value2, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("yc_type not between", value1, value2, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeLike(Integer value) {
			addCriterion("yc_type like", value, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcTypeNotLike(Integer value) {
			addCriterion("yc_type not like", value, "ycType");
			return (Criteria) this;
		}
		public Criteria andYcImgIsNull() {
			addCriterion("yc_img is null");
			return (Criteria) this;
		}
		public Criteria andYcImgIsNotNull(){
			addCriterion("yc_img is not null");
			return (Criteria) this;
		}
		public Criteria andYcImgEqualTo(String value) {
			addCriterion("yc_img =", value, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgNotEqualTo(String value) {
			addCriterion("yc_img <>", value, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgGreaterThan(String value) {
			addCriterion("yc_img >", value, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgGreaterThanOrEqualTo(String value) {
			addCriterion("yc_img >=", value, "YcImg");
			return (Criteria) this;
		}
		public Criteria andYcImgLessThan(String value) {
			addCriterion("yc_img <", value, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgLessThanOrEqualTo(String value) {
			addCriterion("yc_img <=", value, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgIn(List<String> values) {
			addCriterion("yc_img in", values, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgNotIn(List<String> values) {
			addCriterion("yc_img not in", values, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgBetween(String value1, String value2) {
			addCriterion("yc_img between", value1, value2, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgNotBetween(String value1, String value2) {
			addCriterion("yc_img not between", value1, value2, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgLike(String value) {
			addCriterion("yc_img like", value, "ycImg");
			return (Criteria) this;
		}
		public Criteria andYcImgNotLike(String value) {
			addCriterion("yc_img not like", value, "ycImg");
			return (Criteria) this;
		}
		public Criteria andZrrIsNull() {
			addCriterion("zrr is null");
			return (Criteria) this;
		}
		public Criteria andZrrIsNotNull(){
			addCriterion("zrr is not null");
			return (Criteria) this;
		}
		public Criteria andZrrEqualTo(String value) {
			addCriterion("zrr =", value, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrNotEqualTo(String value) {
			addCriterion("zrr <>", value, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrGreaterThan(String value) {
			addCriterion("zrr >", value, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrGreaterThanOrEqualTo(String value) {
			addCriterion("zrr >=", value, "Zrr");
			return (Criteria) this;
		}
		public Criteria andZrrLessThan(String value) {
			addCriterion("zrr <", value, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrLessThanOrEqualTo(String value) {
			addCriterion("zrr <=", value, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrIn(List<String> values) {
			addCriterion("zrr in", values, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrNotIn(List<String> values) {
			addCriterion("zrr not in", values, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrBetween(String value1, String value2) {
			addCriterion("zrr between", value1, value2, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrNotBetween(String value1, String value2) {
			addCriterion("zrr not between", value1, value2, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrLike(String value) {
			addCriterion("zrr like", value, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrNotLike(String value) {
			addCriterion("zrr not like", value, "zrr");
			return (Criteria) this;
		}
		public Criteria andZrrCelIsNull() {
			addCriterion("zrr_cel is null");
			return (Criteria) this;
		}
		public Criteria andZrrCelIsNotNull(){
			addCriterion("zrr_cel is not null");
			return (Criteria) this;
		}
		public Criteria andZrrCelEqualTo(String value) {
			addCriterion("zrr_cel =", value, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelNotEqualTo(String value) {
			addCriterion("zrr_cel <>", value, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelGreaterThan(String value) {
			addCriterion("zrr_cel >", value, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelGreaterThanOrEqualTo(String value) {
			addCriterion("zrr_cel >=", value, "ZrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelLessThan(String value) {
			addCriterion("zrr_cel <", value, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelLessThanOrEqualTo(String value) {
			addCriterion("zrr_cel <=", value, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelIn(List<String> values) {
			addCriterion("zrr_cel in", values, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelNotIn(List<String> values) {
			addCriterion("zrr_cel not in", values, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelBetween(String value1, String value2) {
			addCriterion("zrr_cel between", value1, value2, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelNotBetween(String value1, String value2) {
			addCriterion("zrr_cel not between", value1, value2, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelLike(String value) {
			addCriterion("zrr_cel like", value, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andZrrCelNotLike(String value) {
			addCriterion("zrr_cel not like", value, "zrrCel");
			return (Criteria) this;
		}
		public Criteria andDwIsNull() {
			addCriterion("dw is null");
			return (Criteria) this;
		}
		public Criteria andDwIsNotNull(){
			addCriterion("dw is not null");
			return (Criteria) this;
		}
		public Criteria andDwEqualTo(String value) {
			addCriterion("dw =", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwNotEqualTo(String value) {
			addCriterion("dw <>", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwGreaterThan(String value) {
			addCriterion("dw >", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwGreaterThanOrEqualTo(String value) {
			addCriterion("dw >=", value, "Dw");
			return (Criteria) this;
		}
		public Criteria andDwLessThan(String value) {
			addCriterion("dw <", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwLessThanOrEqualTo(String value) {
			addCriterion("dw <=", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwIn(List<String> values) {
			addCriterion("dw in", values, "dw");
			return (Criteria) this;
		}
		public Criteria andDwNotIn(List<String> values) {
			addCriterion("dw not in", values, "dw");
			return (Criteria) this;
		}
		public Criteria andDwBetween(String value1, String value2) {
			addCriterion("dw between", value1, value2, "dw");
			return (Criteria) this;
		}
		public Criteria andDwNotBetween(String value1, String value2) {
			addCriterion("dw not between", value1, value2, "dw");
			return (Criteria) this;
		}
		public Criteria andDwLike(String value) {
			addCriterion("dw like", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwNotLike(String value) {
			addCriterion("dw not like", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDepartIsNull() {
			addCriterion("depart is null");
			return (Criteria) this;
		}
		public Criteria andDepartIsNotNull(){
			addCriterion("depart is not null");
			return (Criteria) this;
		}
		public Criteria andDepartEqualTo(String value) {
			addCriterion("depart =", value, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartNotEqualTo(String value) {
			addCriterion("depart <>", value, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartGreaterThan(String value) {
			addCriterion("depart >", value, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartGreaterThanOrEqualTo(String value) {
			addCriterion("depart >=", value, "Depart");
			return (Criteria) this;
		}
		public Criteria andDepartLessThan(String value) {
			addCriterion("depart <", value, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartLessThanOrEqualTo(String value) {
			addCriterion("depart <=", value, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartIn(List<String> values) {
			addCriterion("depart in", values, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartNotIn(List<String> values) {
			addCriterion("depart not in", values, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartBetween(String value1, String value2) {
			addCriterion("depart between", value1, value2, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartNotBetween(String value1, String value2) {
			addCriterion("depart not between", value1, value2, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartLike(String value) {
			addCriterion("depart like", value, "depart");
			return (Criteria) this;
		}
		public Criteria andDepartNotLike(String value) {
			addCriterion("depart not like", value, "depart");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeIsNull() {
			addCriterion("ycfx_time is null");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeIsNotNull(){
			addCriterion("ycfx_time is not null");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeEqualTo(String value) {
			addCriterion("ycfx_time =", value, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeNotEqualTo(String value) {
			addCriterion("ycfx_time <>", value, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeGreaterThan(String value) {
			addCriterion("ycfx_time >", value, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeGreaterThanOrEqualTo(String value) {
			addCriterion("ycfx_time >=", value, "YcfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeLessThan(String value) {
			addCriterion("ycfx_time <", value, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeLessThanOrEqualTo(String value) {
			addCriterion("ycfx_time <=", value, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeIn(List<String> values) {
			addCriterion("ycfx_time in", values, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeNotIn(List<String> values) {
			addCriterion("ycfx_time not in", values, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeBetween(String value1, String value2) {
			addCriterion("ycfx_time between", value1, value2, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeNotBetween(String value1, String value2) {
			addCriterion("ycfx_time not between", value1, value2, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeLike(String value) {
			addCriterion("ycfx_time like", value, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andYcfxTimeNotLike(String value) {
			addCriterion("ycfx_time not like", value, "ycfxTime");
			return (Criteria) this;
		}
		public Criteria andDealStatusIsNull() {
			addCriterion("deal_status is null");
			return (Criteria) this;
		}
		public Criteria andDealStatusIsNotNull(){
			addCriterion("deal_status is not null");
			return (Criteria) this;
		}
		public Criteria andDealStatusEqualTo(Integer value) {
			addCriterion("deal_status =", value, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusNotEqualTo(Integer value) {
			addCriterion("deal_status <>", value, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusGreaterThan(Integer value) {
			addCriterion("deal_status >", value, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("deal_status >=", value, "DealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusLessThan(Integer value) {
			addCriterion("deal_status <", value, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusLessThanOrEqualTo(Integer value) {
			addCriterion("deal_status <=", value, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusIn(List<Integer> values) {
			addCriterion("deal_status in", values, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusNotIn(List<Integer> values) {
			addCriterion("deal_status not in", values, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusBetween(Integer value1, Integer value2) {
			addCriterion("deal_status between", value1, value2, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("deal_status not between", value1, value2, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusLike(Integer value) {
			addCriterion("deal_status like", value, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealStatusNotLike(Integer value) {
			addCriterion("deal_status not like", value, "dealStatus");
			return (Criteria) this;
		}
		public Criteria andDealIntroIsNull() {
			addCriterion("deal_intro is null");
			return (Criteria) this;
		}
		public Criteria andDealIntroIsNotNull(){
			addCriterion("deal_intro is not null");
			return (Criteria) this;
		}
		public Criteria andDealIntroEqualTo(String value) {
			addCriterion("deal_intro =", value, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroNotEqualTo(String value) {
			addCriterion("deal_intro <>", value, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroGreaterThan(String value) {
			addCriterion("deal_intro >", value, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroGreaterThanOrEqualTo(String value) {
			addCriterion("deal_intro >=", value, "DealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroLessThan(String value) {
			addCriterion("deal_intro <", value, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroLessThanOrEqualTo(String value) {
			addCriterion("deal_intro <=", value, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroIn(List<String> values) {
			addCriterion("deal_intro in", values, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroNotIn(List<String> values) {
			addCriterion("deal_intro not in", values, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroBetween(String value1, String value2) {
			addCriterion("deal_intro between", value1, value2, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroNotBetween(String value1, String value2) {
			addCriterion("deal_intro not between", value1, value2, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroLike(String value) {
			addCriterion("deal_intro like", value, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealIntroNotLike(String value) {
			addCriterion("deal_intro not like", value, "dealIntro");
			return (Criteria) this;
		}
		public Criteria andDealFileIsNull() {
			addCriterion("deal_file is null");
			return (Criteria) this;
		}
		public Criteria andDealFileIsNotNull(){
			addCriterion("deal_file is not null");
			return (Criteria) this;
		}
		public Criteria andDealFileEqualTo(String value) {
			addCriterion("deal_file =", value, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileNotEqualTo(String value) {
			addCriterion("deal_file <>", value, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileGreaterThan(String value) {
			addCriterion("deal_file >", value, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileGreaterThanOrEqualTo(String value) {
			addCriterion("deal_file >=", value, "DealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileLessThan(String value) {
			addCriterion("deal_file <", value, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileLessThanOrEqualTo(String value) {
			addCriterion("deal_file <=", value, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileIn(List<String> values) {
			addCriterion("deal_file in", values, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileNotIn(List<String> values) {
			addCriterion("deal_file not in", values, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileBetween(String value1, String value2) {
			addCriterion("deal_file between", value1, value2, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileNotBetween(String value1, String value2) {
			addCriterion("deal_file not between", value1, value2, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileLike(String value) {
			addCriterion("deal_file like", value, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealFileNotLike(String value) {
			addCriterion("deal_file not like", value, "dealFile");
			return (Criteria) this;
		}
		public Criteria andDealTimeIsNull() {
			addCriterion("deal_time is null");
			return (Criteria) this;
		}
		public Criteria andDealTimeIsNotNull(){
			addCriterion("deal_time is not null");
			return (Criteria) this;
		}
		public Criteria andDealTimeEqualTo(String value) {
			addCriterion("deal_time =", value, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeNotEqualTo(String value) {
			addCriterion("deal_time <>", value, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeGreaterThan(String value) {
			addCriterion("deal_time >", value, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeGreaterThanOrEqualTo(String value) {
			addCriterion("deal_time >=", value, "DealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeLessThan(String value) {
			addCriterion("deal_time <", value, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeLessThanOrEqualTo(String value) {
			addCriterion("deal_time <=", value, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeIn(List<String> values) {
			addCriterion("deal_time in", values, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeNotIn(List<String> values) {
			addCriterion("deal_time not in", values, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeBetween(String value1, String value2) {
			addCriterion("deal_time between", value1, value2, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeNotBetween(String value1, String value2) {
			addCriterion("deal_time not between", value1, value2, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeLike(String value) {
			addCriterion("deal_time like", value, "dealTime");
			return (Criteria) this;
		}
		public Criteria andDealTimeNotLike(String value) {
			addCriterion("deal_time not like", value, "dealTime");
			return (Criteria) this;
		}
		public Criteria andJwBookIsNull() {
			addCriterion("jw_book is null");
			return (Criteria) this;
		}
		public Criteria andJwBookIsNotNull(){
			addCriterion("jw_book is not null");
			return (Criteria) this;
		}
		public Criteria andJwBookEqualTo(Integer value) {
			addCriterion("jw_book =", value, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookNotEqualTo(Integer value) {
			addCriterion("jw_book <>", value, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookGreaterThan(Integer value) {
			addCriterion("jw_book >", value, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookGreaterThanOrEqualTo(Integer value) {
			addCriterion("jw_book >=", value, "JwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookLessThan(Integer value) {
			addCriterion("jw_book <", value, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookLessThanOrEqualTo(Integer value) {
			addCriterion("jw_book <=", value, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookIn(List<Integer> values) {
			addCriterion("jw_book in", values, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookNotIn(List<Integer> values) {
			addCriterion("jw_book not in", values, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookBetween(Integer value1, Integer value2) {
			addCriterion("jw_book between", value1, value2, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookNotBetween(Integer value1, Integer value2) {
			addCriterion("jw_book not between", value1, value2, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookLike(Integer value) {
			addCriterion("jw_book like", value, "jwBook");
			return (Criteria) this;
		}
		public Criteria andJwBookNotLike(Integer value) {
			addCriterion("jw_book not like", value, "jwBook");
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
