package com.xxx.mall.bean.po;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNull() {
            addCriterion("product_title is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNotNull() {
            addCriterion("product_title is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEqualTo(String value) {
            addCriterion("product_title =", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotEqualTo(String value) {
            addCriterion("product_title <>", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThan(String value) {
            addCriterion("product_title >", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThanOrEqualTo(String value) {
            addCriterion("product_title >=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThan(String value) {
            addCriterion("product_title <", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThanOrEqualTo(String value) {
            addCriterion("product_title <=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLike(String value) {
            addCriterion("product_title like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotLike(String value) {
            addCriterion("product_title not like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleIn(List<String> values) {
            addCriterion("product_title in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotIn(List<String> values) {
            addCriterion("product_title not in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleBetween(String value1, String value2) {
            addCriterion("product_title between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotBetween(String value1, String value2) {
            addCriterion("product_title not between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNull() {
            addCriterion("product_info is null");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNotNull() {
            addCriterion("product_info is not null");
            return (Criteria) this;
        }

        public Criteria andProductInfoEqualTo(String value) {
            addCriterion("product_info =", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotEqualTo(String value) {
            addCriterion("product_info <>", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThan(String value) {
            addCriterion("product_info >", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThanOrEqualTo(String value) {
            addCriterion("product_info >=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThan(String value) {
            addCriterion("product_info <", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThanOrEqualTo(String value) {
            addCriterion("product_info <=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLike(String value) {
            addCriterion("product_info like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotLike(String value) {
            addCriterion("product_info not like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoIn(List<String> values) {
            addCriterion("product_info in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotIn(List<String> values) {
            addCriterion("product_info not in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoBetween(String value1, String value2) {
            addCriterion("product_info between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotBetween(String value1, String value2) {
            addCriterion("product_info not between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNull() {
            addCriterion("product_stock is null");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNotNull() {
            addCriterion("product_stock is not null");
            return (Criteria) this;
        }

        public Criteria andProductStockEqualTo(Integer value) {
            addCriterion("product_stock =", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotEqualTo(Integer value) {
            addCriterion("product_stock <>", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThan(Integer value) {
            addCriterion("product_stock >", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_stock >=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThan(Integer value) {
            addCriterion("product_stock <", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThanOrEqualTo(Integer value) {
            addCriterion("product_stock <=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockIn(List<Integer> values) {
            addCriterion("product_stock in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotIn(List<Integer> values) {
            addCriterion("product_stock not in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockBetween(Integer value1, Integer value2) {
            addCriterion("product_stock between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotBetween(Integer value1, Integer value2) {
            addCriterion("product_stock not between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductImg1IsNull() {
            addCriterion("product_img1 is null");
            return (Criteria) this;
        }

        public Criteria andProductImg1IsNotNull() {
            addCriterion("product_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andProductImg1EqualTo(String value) {
            addCriterion("product_img1 =", value, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1NotEqualTo(String value) {
            addCriterion("product_img1 <>", value, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1GreaterThan(String value) {
            addCriterion("product_img1 >", value, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1GreaterThanOrEqualTo(String value) {
            addCriterion("product_img1 >=", value, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1LessThan(String value) {
            addCriterion("product_img1 <", value, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1LessThanOrEqualTo(String value) {
            addCriterion("product_img1 <=", value, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1Like(String value) {
            addCriterion("product_img1 like", value, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1NotLike(String value) {
            addCriterion("product_img1 not like", value, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1In(List<String> values) {
            addCriterion("product_img1 in", values, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1NotIn(List<String> values) {
            addCriterion("product_img1 not in", values, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1Between(String value1, String value2) {
            addCriterion("product_img1 between", value1, value2, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg1NotBetween(String value1, String value2) {
            addCriterion("product_img1 not between", value1, value2, "productImg1");
            return (Criteria) this;
        }

        public Criteria andProductImg2IsNull() {
            addCriterion("product_img2 is null");
            return (Criteria) this;
        }

        public Criteria andProductImg2IsNotNull() {
            addCriterion("product_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andProductImg2EqualTo(String value) {
            addCriterion("product_img2 =", value, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2NotEqualTo(String value) {
            addCriterion("product_img2 <>", value, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2GreaterThan(String value) {
            addCriterion("product_img2 >", value, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2GreaterThanOrEqualTo(String value) {
            addCriterion("product_img2 >=", value, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2LessThan(String value) {
            addCriterion("product_img2 <", value, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2LessThanOrEqualTo(String value) {
            addCriterion("product_img2 <=", value, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2Like(String value) {
            addCriterion("product_img2 like", value, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2NotLike(String value) {
            addCriterion("product_img2 not like", value, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2In(List<String> values) {
            addCriterion("product_img2 in", values, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2NotIn(List<String> values) {
            addCriterion("product_img2 not in", values, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2Between(String value1, String value2) {
            addCriterion("product_img2 between", value1, value2, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg2NotBetween(String value1, String value2) {
            addCriterion("product_img2 not between", value1, value2, "productImg2");
            return (Criteria) this;
        }

        public Criteria andProductImg3IsNull() {
            addCriterion("product_img3 is null");
            return (Criteria) this;
        }

        public Criteria andProductImg3IsNotNull() {
            addCriterion("product_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andProductImg3EqualTo(String value) {
            addCriterion("product_img3 =", value, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3NotEqualTo(String value) {
            addCriterion("product_img3 <>", value, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3GreaterThan(String value) {
            addCriterion("product_img3 >", value, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3GreaterThanOrEqualTo(String value) {
            addCriterion("product_img3 >=", value, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3LessThan(String value) {
            addCriterion("product_img3 <", value, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3LessThanOrEqualTo(String value) {
            addCriterion("product_img3 <=", value, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3Like(String value) {
            addCriterion("product_img3 like", value, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3NotLike(String value) {
            addCriterion("product_img3 not like", value, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3In(List<String> values) {
            addCriterion("product_img3 in", values, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3NotIn(List<String> values) {
            addCriterion("product_img3 not in", values, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3Between(String value1, String value2) {
            addCriterion("product_img3 between", value1, value2, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductImg3NotBetween(String value1, String value2) {
            addCriterion("product_img3 not between", value1, value2, "productImg3");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(Integer value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(Integer value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(Integer value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(Integer value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(Integer value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<Integer> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<Integer> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(Integer value1, Integer value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
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