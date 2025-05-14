package com.zlzc.model;
import java.util.ArrayList;
import java.util.List;
public class CgMsgExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public CgMsgExample() {
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
		public Criteria andCpNameIsNull() {
			addCriterion("cp_name is null");
			return (Criteria) this;
		}
		public Criteria andCpNameIsNotNull(){
			addCriterion("cp_name is not null");
			return (Criteria) this;
		}
		public Criteria andCpNameEqualTo(String value) {
			addCriterion("cp_name =", value, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameNotEqualTo(String value) {
			addCriterion("cp_name <>", value, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameGreaterThan(String value) {
			addCriterion("cp_name >", value, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameGreaterThanOrEqualTo(String value) {
			addCriterion("cp_name >=", value, "CpName");
			return (Criteria) this;
		}
		public Criteria andCpNameLessThan(String value) {
			addCriterion("cp_name <", value, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameLessThanOrEqualTo(String value) {
			addCriterion("cp_name <=", value, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameIn(List<String> values) {
			addCriterion("cp_name in", values, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameNotIn(List<String> values) {
			addCriterion("cp_name not in", values, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameBetween(String value1, String value2) {
			addCriterion("cp_name between", value1, value2, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameNotBetween(String value1, String value2) {
			addCriterion("cp_name not between", value1, value2, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameLike(String value) {
			addCriterion("cp_name like", value, "cpName");
			return (Criteria) this;
		}
		public Criteria andCpNameNotLike(String value) {
			addCriterion("cp_name not like", value, "cpName");
			return (Criteria) this;
		}
		public Criteria andCgPriceIsNull() {
			addCriterion("cg_price is null");
			return (Criteria) this;
		}
		public Criteria andCgPriceIsNotNull(){
			addCriterion("cg_price is not null");
			return (Criteria) this;
		}
		public Criteria andCgPriceEqualTo(Double value) {
			addCriterion("cg_price =", value, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceNotEqualTo(Double value) {
			addCriterion("cg_price <>", value, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceGreaterThan(Double value) {
			addCriterion("cg_price >", value, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceGreaterThanOrEqualTo(Double value) {
			addCriterion("cg_price >=", value, "CgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceLessThan(Double value) {
			addCriterion("cg_price <", value, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceLessThanOrEqualTo(Double value) {
			addCriterion("cg_price <=", value, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceIn(List<Double> values) {
			addCriterion("cg_price in", values, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceNotIn(List<Double> values) {
			addCriterion("cg_price not in", values, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceBetween(Double value1, Double value2) {
			addCriterion("cg_price between", value1, value2, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceNotBetween(Double value1, Double value2) {
			addCriterion("cg_price not between", value1, value2, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceLike(Double value) {
			addCriterion("cg_price like", value, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgPriceNotLike(Double value) {
			addCriterion("cg_price not like", value, "cgPrice");
			return (Criteria) this;
		}
		public Criteria andCgNumIsNull() {
			addCriterion("cg_num is null");
			return (Criteria) this;
		}
		public Criteria andCgNumIsNotNull(){
			addCriterion("cg_num is not null");
			return (Criteria) this;
		}
		public Criteria andCgNumEqualTo(Integer value) {
			addCriterion("cg_num =", value, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumNotEqualTo(Integer value) {
			addCriterion("cg_num <>", value, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumGreaterThan(Integer value) {
			addCriterion("cg_num >", value, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("cg_num >=", value, "CgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumLessThan(Integer value) {
			addCriterion("cg_num <", value, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumLessThanOrEqualTo(Integer value) {
			addCriterion("cg_num <=", value, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumIn(List<Integer> values) {
			addCriterion("cg_num in", values, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumNotIn(List<Integer> values) {
			addCriterion("cg_num not in", values, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumBetween(Integer value1, Integer value2) {
			addCriterion("cg_num between", value1, value2, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumNotBetween(Integer value1, Integer value2) {
			addCriterion("cg_num not between", value1, value2, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumLike(Integer value) {
			addCriterion("cg_num like", value, "cgNum");
			return (Criteria) this;
		}
		public Criteria andCgNumNotLike(Integer value) {
			addCriterion("cg_num not like", value, "cgNum");
			return (Criteria) this;
		}
		public Criteria andTotalAmountIsNull() {
			addCriterion("total_amount is null");
			return (Criteria) this;
		}
		public Criteria andTotalAmountIsNotNull(){
			addCriterion("total_amount is not null");
			return (Criteria) this;
		}
		public Criteria andTotalAmountEqualTo(Double value) {
			addCriterion("total_amount =", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotEqualTo(Double value) {
			addCriterion("total_amount <>", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountGreaterThan(Double value) {
			addCriterion("total_amount >", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountGreaterThanOrEqualTo(Double value) {
			addCriterion("total_amount >=", value, "TotalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLessThan(Double value) {
			addCriterion("total_amount <", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLessThanOrEqualTo(Double value) {
			addCriterion("total_amount <=", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountIn(List<Double> values) {
			addCriterion("total_amount in", values, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotIn(List<Double> values) {
			addCriterion("total_amount not in", values, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountBetween(Double value1, Double value2) {
			addCriterion("total_amount between", value1, value2, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotBetween(Double value1, Double value2) {
			addCriterion("total_amount not between", value1, value2, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLike(Double value) {
			addCriterion("total_amount like", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotLike(Double value) {
			addCriterion("total_amount not like", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andCgsIsNull() {
			addCriterion("cgs is null");
			return (Criteria) this;
		}
		public Criteria andCgsIsNotNull(){
			addCriterion("cgs is not null");
			return (Criteria) this;
		}
		public Criteria andCgsEqualTo(String value) {
			addCriterion("cgs =", value, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsNotEqualTo(String value) {
			addCriterion("cgs <>", value, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsGreaterThan(String value) {
			addCriterion("cgs >", value, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsGreaterThanOrEqualTo(String value) {
			addCriterion("cgs >=", value, "Cgs");
			return (Criteria) this;
		}
		public Criteria andCgsLessThan(String value) {
			addCriterion("cgs <", value, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsLessThanOrEqualTo(String value) {
			addCriterion("cgs <=", value, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsIn(List<String> values) {
			addCriterion("cgs in", values, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsNotIn(List<String> values) {
			addCriterion("cgs not in", values, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsBetween(String value1, String value2) {
			addCriterion("cgs between", value1, value2, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsNotBetween(String value1, String value2) {
			addCriterion("cgs not between", value1, value2, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsLike(String value) {
			addCriterion("cgs like", value, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgsNotLike(String value) {
			addCriterion("cgs not like", value, "cgs");
			return (Criteria) this;
		}
		public Criteria andCgIntroIsNull() {
			addCriterion("cg_intro is null");
			return (Criteria) this;
		}
		public Criteria andCgIntroIsNotNull(){
			addCriterion("cg_intro is not null");
			return (Criteria) this;
		}
		public Criteria andCgIntroEqualTo(String value) {
			addCriterion("cg_intro =", value, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroNotEqualTo(String value) {
			addCriterion("cg_intro <>", value, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroGreaterThan(String value) {
			addCriterion("cg_intro >", value, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroGreaterThanOrEqualTo(String value) {
			addCriterion("cg_intro >=", value, "CgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroLessThan(String value) {
			addCriterion("cg_intro <", value, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroLessThanOrEqualTo(String value) {
			addCriterion("cg_intro <=", value, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroIn(List<String> values) {
			addCriterion("cg_intro in", values, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroNotIn(List<String> values) {
			addCriterion("cg_intro not in", values, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroBetween(String value1, String value2) {
			addCriterion("cg_intro between", value1, value2, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroNotBetween(String value1, String value2) {
			addCriterion("cg_intro not between", value1, value2, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroLike(String value) {
			addCriterion("cg_intro like", value, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andCgIntroNotLike(String value) {
			addCriterion("cg_intro not like", value, "cgIntro");
			return (Criteria) this;
		}
		public Criteria andAppFileIsNull() {
			addCriterion("app_file is null");
			return (Criteria) this;
		}
		public Criteria andAppFileIsNotNull(){
			addCriterion("app_file is not null");
			return (Criteria) this;
		}
		public Criteria andAppFileEqualTo(String value) {
			addCriterion("app_file =", value, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileNotEqualTo(String value) {
			addCriterion("app_file <>", value, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileGreaterThan(String value) {
			addCriterion("app_file >", value, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileGreaterThanOrEqualTo(String value) {
			addCriterion("app_file >=", value, "AppFile");
			return (Criteria) this;
		}
		public Criteria andAppFileLessThan(String value) {
			addCriterion("app_file <", value, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileLessThanOrEqualTo(String value) {
			addCriterion("app_file <=", value, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileIn(List<String> values) {
			addCriterion("app_file in", values, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileNotIn(List<String> values) {
			addCriterion("app_file not in", values, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileBetween(String value1, String value2) {
			addCriterion("app_file between", value1, value2, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileNotBetween(String value1, String value2) {
			addCriterion("app_file not between", value1, value2, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileLike(String value) {
			addCriterion("app_file like", value, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppFileNotLike(String value) {
			addCriterion("app_file not like", value, "appFile");
			return (Criteria) this;
		}
		public Criteria andAppDateIsNull() {
			addCriterion("app_date is null");
			return (Criteria) this;
		}
		public Criteria andAppDateIsNotNull(){
			addCriterion("app_date is not null");
			return (Criteria) this;
		}
		public Criteria andAppDateEqualTo(String value) {
			addCriterion("app_date =", value, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateNotEqualTo(String value) {
			addCriterion("app_date <>", value, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateGreaterThan(String value) {
			addCriterion("app_date >", value, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateGreaterThanOrEqualTo(String value) {
			addCriterion("app_date >=", value, "AppDate");
			return (Criteria) this;
		}
		public Criteria andAppDateLessThan(String value) {
			addCriterion("app_date <", value, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateLessThanOrEqualTo(String value) {
			addCriterion("app_date <=", value, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateIn(List<String> values) {
			addCriterion("app_date in", values, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateNotIn(List<String> values) {
			addCriterion("app_date not in", values, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateBetween(String value1, String value2) {
			addCriterion("app_date between", value1, value2, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateNotBetween(String value1, String value2) {
			addCriterion("app_date not between", value1, value2, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateLike(String value) {
			addCriterion("app_date like", value, "appDate");
			return (Criteria) this;
		}
		public Criteria andAppDateNotLike(String value) {
			addCriterion("app_date not like", value, "appDate");
			return (Criteria) this;
		}
		public Criteria andCgStatusIsNull() {
			addCriterion("cg_status is null");
			return (Criteria) this;
		}
		public Criteria andCgStatusIsNotNull(){
			addCriterion("cg_status is not null");
			return (Criteria) this;
		}
		public Criteria andCgStatusEqualTo(Integer value) {
			addCriterion("cg_status =", value, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusNotEqualTo(Integer value) {
			addCriterion("cg_status <>", value, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusGreaterThan(Integer value) {
			addCriterion("cg_status >", value, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("cg_status >=", value, "CgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusLessThan(Integer value) {
			addCriterion("cg_status <", value, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusLessThanOrEqualTo(Integer value) {
			addCriterion("cg_status <=", value, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusIn(List<Integer> values) {
			addCriterion("cg_status in", values, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusNotIn(List<Integer> values) {
			addCriterion("cg_status not in", values, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusBetween(Integer value1, Integer value2) {
			addCriterion("cg_status between", value1, value2, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("cg_status not between", value1, value2, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusLike(Integer value) {
			addCriterion("cg_status like", value, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCgStatusNotLike(Integer value) {
			addCriterion("cg_status not like", value, "cgStatus");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkIsNull() {
			addCriterion("check_remark is null");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkIsNotNull(){
			addCriterion("check_remark is not null");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkEqualTo(String value) {
			addCriterion("check_remark =", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkNotEqualTo(String value) {
			addCriterion("check_remark <>", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkGreaterThan(String value) {
			addCriterion("check_remark >", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("check_remark >=", value, "CheckRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkLessThan(String value) {
			addCriterion("check_remark <", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
			addCriterion("check_remark <=", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkIn(List<String> values) {
			addCriterion("check_remark in", values, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkNotIn(List<String> values) {
			addCriterion("check_remark not in", values, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkBetween(String value1, String value2) {
			addCriterion("check_remark between", value1, value2, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkNotBetween(String value1, String value2) {
			addCriterion("check_remark not between", value1, value2, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkLike(String value) {
			addCriterion("check_remark like", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkNotLike(String value) {
			addCriterion("check_remark not like", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andWcIntroIsNull() {
			addCriterion("wc_intro is null");
			return (Criteria) this;
		}
		public Criteria andWcIntroIsNotNull(){
			addCriterion("wc_intro is not null");
			return (Criteria) this;
		}
		public Criteria andWcIntroEqualTo(String value) {
			addCriterion("wc_intro =", value, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroNotEqualTo(String value) {
			addCriterion("wc_intro <>", value, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroGreaterThan(String value) {
			addCriterion("wc_intro >", value, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroGreaterThanOrEqualTo(String value) {
			addCriterion("wc_intro >=", value, "WcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroLessThan(String value) {
			addCriterion("wc_intro <", value, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroLessThanOrEqualTo(String value) {
			addCriterion("wc_intro <=", value, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroIn(List<String> values) {
			addCriterion("wc_intro in", values, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroNotIn(List<String> values) {
			addCriterion("wc_intro not in", values, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroBetween(String value1, String value2) {
			addCriterion("wc_intro between", value1, value2, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroNotBetween(String value1, String value2) {
			addCriterion("wc_intro not between", value1, value2, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroLike(String value) {
			addCriterion("wc_intro like", value, "wcIntro");
			return (Criteria) this;
		}
		public Criteria andWcIntroNotLike(String value) {
			addCriterion("wc_intro not like", value, "wcIntro");
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
