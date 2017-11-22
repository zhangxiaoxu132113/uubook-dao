package com.water.uubook.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUbVedioCourseShopCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUbVedioCourseShopCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
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
            addCriterion("id >=", value, "id");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andVisitedCountIsNull() {
            addCriterion("visited_count is null");
            return (Criteria) this;
        }

        public Criteria andVisitedCountIsNotNull() {
            addCriterion("visited_count is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedCountEqualTo(Integer value) {
            addCriterion("visited_count =", value, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountNotEqualTo(Integer value) {
            addCriterion("visited_count <>", value, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountGreaterThan(Integer value) {
            addCriterion("visited_count >", value, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("visited_count >=", value, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountLessThan(Integer value) {
            addCriterion("visited_count <", value, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountLessThanOrEqualTo(Integer value) {
            addCriterion("visited_count <=", value, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountIn(List<Integer> values) {
            addCriterion("visited_count in", values, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountNotIn(List<Integer> values) {
            addCriterion("visited_count not in", values, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountBetween(Integer value1, Integer value2) {
            addCriterion("visited_count between", value1, value2, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andVisitedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("visited_count not between", value1, value2, "visitedCount");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andBuyCountIsNull() {
            addCriterion("buy_count is null");
            return (Criteria) this;
        }

        public Criteria andBuyCountIsNotNull() {
            addCriterion("buy_count is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCountEqualTo(Integer value) {
            addCriterion("buy_count =", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotEqualTo(Integer value) {
            addCriterion("buy_count <>", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountGreaterThan(Integer value) {
            addCriterion("buy_count >", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_count >=", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLessThan(Integer value) {
            addCriterion("buy_count <", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLessThanOrEqualTo(Integer value) {
            addCriterion("buy_count <=", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountIn(List<Integer> values) {
            addCriterion("buy_count in", values, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotIn(List<Integer> values) {
            addCriterion("buy_count not in", values, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountBetween(Integer value1, Integer value2) {
            addCriterion("buy_count between", value1, value2, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_count not between", value1, value2, "buyCount");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlIsNull() {
            addCriterion("taobao_url is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlIsNotNull() {
            addCriterion("taobao_url is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlEqualTo(String value) {
            addCriterion("taobao_url =", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlNotEqualTo(String value) {
            addCriterion("taobao_url <>", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlGreaterThan(String value) {
            addCriterion("taobao_url >", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_url >=", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlLessThan(String value) {
            addCriterion("taobao_url <", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlLessThanOrEqualTo(String value) {
            addCriterion("taobao_url <=", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlLike(String value) {
            addCriterion("taobao_url like", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlNotLike(String value) {
            addCriterion("taobao_url not like", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlIn(List<String> values) {
            addCriterion("taobao_url in", values, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlNotIn(List<String> values) {
            addCriterion("taobao_url not in", values, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlBetween(String value1, String value2) {
            addCriterion("taobao_url between", value1, value2, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlNotBetween(String value1, String value2) {
            addCriterion("taobao_url not between", value1, value2, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlIsNull() {
            addCriterion("taobao_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlIsNotNull() {
            addCriterion("taobao_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlEqualTo(String value) {
            addCriterion("taobao_pic_url =", value, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlNotEqualTo(String value) {
            addCriterion("taobao_pic_url <>", value, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlGreaterThan(String value) {
            addCriterion("taobao_pic_url >", value, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_pic_url >=", value, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlLessThan(String value) {
            addCriterion("taobao_pic_url <", value, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlLessThanOrEqualTo(String value) {
            addCriterion("taobao_pic_url <=", value, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlLike(String value) {
            addCriterion("taobao_pic_url like", value, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlNotLike(String value) {
            addCriterion("taobao_pic_url not like", value, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlIn(List<String> values) {
            addCriterion("taobao_pic_url in", values, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlNotIn(List<String> values) {
            addCriterion("taobao_pic_url not in", values, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlBetween(String value1, String value2) {
            addCriterion("taobao_pic_url between", value1, value2, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoPicUrlNotBetween(String value1, String value2) {
            addCriterion("taobao_pic_url not between", value1, value2, "taobaoPicUrl");
            return (Criteria) this;
        }

        public Criteria andCreateOnIsNull() {
            addCriterion("create_on is null");
            return (Criteria) this;
        }

        public Criteria andCreateOnIsNotNull() {
            addCriterion("create_on is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOnEqualTo(Date value) {
            addCriterion("create_on =", value, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnNotEqualTo(Date value) {
            addCriterion("create_on <>", value, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnGreaterThan(Date value) {
            addCriterion("create_on >", value, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnGreaterThanOrEqualTo(Date value) {
            addCriterion("create_on >=", value, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnLessThan(Date value) {
            addCriterion("create_on <", value, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnLessThanOrEqualTo(Date value) {
            addCriterion("create_on <=", value, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnIn(List<Date> values) {
            addCriterion("create_on in", values, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnNotIn(List<Date> values) {
            addCriterion("create_on not in", values, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnBetween(Date value1, Date value2) {
            addCriterion("create_on between", value1, value2, "createOn");
            return (Criteria) this;
        }

        public Criteria andCreateOnNotBetween(Date value1, Date value2) {
            addCriterion("create_on not between", value1, value2, "createOn");
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