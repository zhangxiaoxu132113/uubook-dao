package com.water.uubook.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUbAccessLogInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUbAccessLogInfoCriteria() {
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

        public Criteria andRequestUrlIsNull() {
            addCriterion("request_url is null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNotNull() {
            addCriterion("request_url is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlEqualTo(String value) {
            addCriterion("request_url =", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotEqualTo(String value) {
            addCriterion("request_url <>", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThan(String value) {
            addCriterion("request_url >", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("request_url >=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThan(String value) {
            addCriterion("request_url <", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("request_url <=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLike(String value) {
            addCriterion("request_url like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotLike(String value) {
            addCriterion("request_url not like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIn(List<String> values) {
            addCriterion("request_url in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotIn(List<String> values) {
            addCriterion("request_url not in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlBetween(String value1, String value2) {
            addCriterion("request_url between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotBetween(String value1, String value2) {
            addCriterion("request_url not between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNull() {
            addCriterion("request_ip is null");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNotNull() {
            addCriterion("request_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIpEqualTo(String value) {
            addCriterion("request_ip =", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotEqualTo(String value) {
            addCriterion("request_ip <>", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThan(String value) {
            addCriterion("request_ip >", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThanOrEqualTo(String value) {
            addCriterion("request_ip >=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThan(String value) {
            addCriterion("request_ip <", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThanOrEqualTo(String value) {
            addCriterion("request_ip <=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLike(String value) {
            addCriterion("request_ip like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotLike(String value) {
            addCriterion("request_ip not like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpIn(List<String> values) {
            addCriterion("request_ip in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotIn(List<String> values) {
            addCriterion("request_ip not in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpBetween(String value1, String value2) {
            addCriterion("request_ip between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotBetween(String value1, String value2) {
            addCriterion("request_ip not between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIsNull() {
            addCriterion("request_method is null");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIsNotNull() {
            addCriterion("request_method is not null");
            return (Criteria) this;
        }

        public Criteria andRequestMethodEqualTo(String value) {
            addCriterion("request_method =", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotEqualTo(String value) {
            addCriterion("request_method <>", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodGreaterThan(String value) {
            addCriterion("request_method >", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodGreaterThanOrEqualTo(String value) {
            addCriterion("request_method >=", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLessThan(String value) {
            addCriterion("request_method <", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLessThanOrEqualTo(String value) {
            addCriterion("request_method <=", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLike(String value) {
            addCriterion("request_method like", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotLike(String value) {
            addCriterion("request_method not like", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIn(List<String> values) {
            addCriterion("request_method in", values, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotIn(List<String> values) {
            addCriterion("request_method not in", values, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodBetween(String value1, String value2) {
            addCriterion("request_method between", value1, value2, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotBetween(String value1, String value2) {
            addCriterion("request_method not between", value1, value2, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andAccessDateIsNull() {
            addCriterion("access_date is null");
            return (Criteria) this;
        }

        public Criteria andAccessDateIsNotNull() {
            addCriterion("access_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccessDateEqualTo(Date value) {
            addCriterion("access_date =", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateNotEqualTo(Date value) {
            addCriterion("access_date <>", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateGreaterThan(Date value) {
            addCriterion("access_date >", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("access_date >=", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateLessThan(Date value) {
            addCriterion("access_date <", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateLessThanOrEqualTo(Date value) {
            addCriterion("access_date <=", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateIn(List<Date> values) {
            addCriterion("access_date in", values, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateNotIn(List<Date> values) {
            addCriterion("access_date not in", values, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateBetween(Date value1, Date value2) {
            addCriterion("access_date between", value1, value2, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateNotBetween(Date value1, Date value2) {
            addCriterion("access_date not between", value1, value2, "accessDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSendBytesIsNull() {
            addCriterion("send_bytes is null");
            return (Criteria) this;
        }

        public Criteria andSendBytesIsNotNull() {
            addCriterion("send_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andSendBytesEqualTo(Integer value) {
            addCriterion("send_bytes =", value, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesNotEqualTo(Integer value) {
            addCriterion("send_bytes <>", value, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesGreaterThan(Integer value) {
            addCriterion("send_bytes >", value, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_bytes >=", value, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesLessThan(Integer value) {
            addCriterion("send_bytes <", value, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesLessThanOrEqualTo(Integer value) {
            addCriterion("send_bytes <=", value, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesIn(List<Integer> values) {
            addCriterion("send_bytes in", values, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesNotIn(List<Integer> values) {
            addCriterion("send_bytes not in", values, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesBetween(Integer value1, Integer value2) {
            addCriterion("send_bytes between", value1, value2, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andSendBytesNotBetween(Integer value1, Integer value2) {
            addCriterion("send_bytes not between", value1, value2, "sendBytes");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeIsNull() {
            addCriterion("process_request_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeIsNotNull() {
            addCriterion("process_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeEqualTo(Integer value) {
            addCriterion("process_request_time =", value, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeNotEqualTo(Integer value) {
            addCriterion("process_request_time <>", value, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeGreaterThan(Integer value) {
            addCriterion("process_request_time >", value, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_request_time >=", value, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeLessThan(Integer value) {
            addCriterion("process_request_time <", value, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeLessThanOrEqualTo(Integer value) {
            addCriterion("process_request_time <=", value, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeIn(List<Integer> values) {
            addCriterion("process_request_time in", values, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeNotIn(List<Integer> values) {
            addCriterion("process_request_time not in", values, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeBetween(Integer value1, Integer value2) {
            addCriterion("process_request_time between", value1, value2, "processRequestTime");
            return (Criteria) this;
        }

        public Criteria andProcessRequestTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("process_request_time not between", value1, value2, "processRequestTime");
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