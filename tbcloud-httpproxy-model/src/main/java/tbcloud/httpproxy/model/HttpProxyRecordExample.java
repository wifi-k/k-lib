package tbcloud.httpproxy.model;

import java.util.ArrayList;
import java.util.List;

public class HttpProxyRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HttpProxyRecordExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReqMethodIsNull() {
            addCriterion("req_method is null");
            return (Criteria) this;
        }

        public Criteria andReqMethodIsNotNull() {
            addCriterion("req_method is not null");
            return (Criteria) this;
        }

        public Criteria andReqMethodEqualTo(String value) {
            addCriterion("req_method =", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotEqualTo(String value) {
            addCriterion("req_method <>", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodGreaterThan(String value) {
            addCriterion("req_method >", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodGreaterThanOrEqualTo(String value) {
            addCriterion("req_method >=", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodLessThan(String value) {
            addCriterion("req_method <", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodLessThanOrEqualTo(String value) {
            addCriterion("req_method <=", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodLike(String value) {
            addCriterion("req_method like", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotLike(String value) {
            addCriterion("req_method not like", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodIn(List<String> values) {
            addCriterion("req_method in", values, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotIn(List<String> values) {
            addCriterion("req_method not in", values, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodBetween(String value1, String value2) {
            addCriterion("req_method between", value1, value2, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotBetween(String value1, String value2) {
            addCriterion("req_method not between", value1, value2, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqProtocolIsNull() {
            addCriterion("req_protocol is null");
            return (Criteria) this;
        }

        public Criteria andReqProtocolIsNotNull() {
            addCriterion("req_protocol is not null");
            return (Criteria) this;
        }

        public Criteria andReqProtocolEqualTo(String value) {
            addCriterion("req_protocol =", value, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolNotEqualTo(String value) {
            addCriterion("req_protocol <>", value, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolGreaterThan(String value) {
            addCriterion("req_protocol >", value, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("req_protocol >=", value, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolLessThan(String value) {
            addCriterion("req_protocol <", value, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolLessThanOrEqualTo(String value) {
            addCriterion("req_protocol <=", value, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolLike(String value) {
            addCriterion("req_protocol like", value, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolNotLike(String value) {
            addCriterion("req_protocol not like", value, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolIn(List<String> values) {
            addCriterion("req_protocol in", values, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolNotIn(List<String> values) {
            addCriterion("req_protocol not in", values, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolBetween(String value1, String value2) {
            addCriterion("req_protocol between", value1, value2, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqProtocolNotBetween(String value1, String value2) {
            addCriterion("req_protocol not between", value1, value2, "reqProtocol");
            return (Criteria) this;
        }

        public Criteria andReqSizeIsNull() {
            addCriterion("req_size is null");
            return (Criteria) this;
        }

        public Criteria andReqSizeIsNotNull() {
            addCriterion("req_size is not null");
            return (Criteria) this;
        }

        public Criteria andReqSizeEqualTo(Integer value) {
            addCriterion("req_size =", value, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeNotEqualTo(Integer value) {
            addCriterion("req_size <>", value, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeGreaterThan(Integer value) {
            addCriterion("req_size >", value, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_size >=", value, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeLessThan(Integer value) {
            addCriterion("req_size <", value, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeLessThanOrEqualTo(Integer value) {
            addCriterion("req_size <=", value, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeIn(List<Integer> values) {
            addCriterion("req_size in", values, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeNotIn(List<Integer> values) {
            addCriterion("req_size not in", values, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeBetween(Integer value1, Integer value2) {
            addCriterion("req_size between", value1, value2, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("req_size not between", value1, value2, "reqSize");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNull() {
            addCriterion("req_time is null");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNotNull() {
            addCriterion("req_time is not null");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualTo(Long value) {
            addCriterion("req_time =", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualTo(Long value) {
            addCriterion("req_time <>", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThan(Long value) {
            addCriterion("req_time >", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("req_time >=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThan(Long value) {
            addCriterion("req_time <", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualTo(Long value) {
            addCriterion("req_time <=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeIn(List<Long> values) {
            addCriterion("req_time in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotIn(List<Long> values) {
            addCriterion("req_time not in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeBetween(Long value1, Long value2) {
            addCriterion("req_time between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotBetween(Long value1, Long value2) {
            addCriterion("req_time not between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqSchemeIsNull() {
            addCriterion("req_scheme is null");
            return (Criteria) this;
        }

        public Criteria andReqSchemeIsNotNull() {
            addCriterion("req_scheme is not null");
            return (Criteria) this;
        }

        public Criteria andReqSchemeEqualTo(String value) {
            addCriterion("req_scheme =", value, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeNotEqualTo(String value) {
            addCriterion("req_scheme <>", value, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeGreaterThan(String value) {
            addCriterion("req_scheme >", value, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeGreaterThanOrEqualTo(String value) {
            addCriterion("req_scheme >=", value, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeLessThan(String value) {
            addCriterion("req_scheme <", value, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeLessThanOrEqualTo(String value) {
            addCriterion("req_scheme <=", value, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeLike(String value) {
            addCriterion("req_scheme like", value, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeNotLike(String value) {
            addCriterion("req_scheme not like", value, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeIn(List<String> values) {
            addCriterion("req_scheme in", values, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeNotIn(List<String> values) {
            addCriterion("req_scheme not in", values, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeBetween(String value1, String value2) {
            addCriterion("req_scheme between", value1, value2, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqSchemeNotBetween(String value1, String value2) {
            addCriterion("req_scheme not between", value1, value2, "reqScheme");
            return (Criteria) this;
        }

        public Criteria andReqHostIsNull() {
            addCriterion("req_host is null");
            return (Criteria) this;
        }

        public Criteria andReqHostIsNotNull() {
            addCriterion("req_host is not null");
            return (Criteria) this;
        }

        public Criteria andReqHostEqualTo(String value) {
            addCriterion("req_host =", value, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostNotEqualTo(String value) {
            addCriterion("req_host <>", value, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostGreaterThan(String value) {
            addCriterion("req_host >", value, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostGreaterThanOrEqualTo(String value) {
            addCriterion("req_host >=", value, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostLessThan(String value) {
            addCriterion("req_host <", value, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostLessThanOrEqualTo(String value) {
            addCriterion("req_host <=", value, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostLike(String value) {
            addCriterion("req_host like", value, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostNotLike(String value) {
            addCriterion("req_host not like", value, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostIn(List<String> values) {
            addCriterion("req_host in", values, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostNotIn(List<String> values) {
            addCriterion("req_host not in", values, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostBetween(String value1, String value2) {
            addCriterion("req_host between", value1, value2, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqHostNotBetween(String value1, String value2) {
            addCriterion("req_host not between", value1, value2, "reqHost");
            return (Criteria) this;
        }

        public Criteria andReqPortIsNull() {
            addCriterion("req_port is null");
            return (Criteria) this;
        }

        public Criteria andReqPortIsNotNull() {
            addCriterion("req_port is not null");
            return (Criteria) this;
        }

        public Criteria andReqPortEqualTo(Integer value) {
            addCriterion("req_port =", value, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortNotEqualTo(Integer value) {
            addCriterion("req_port <>", value, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortGreaterThan(Integer value) {
            addCriterion("req_port >", value, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_port >=", value, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortLessThan(Integer value) {
            addCriterion("req_port <", value, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortLessThanOrEqualTo(Integer value) {
            addCriterion("req_port <=", value, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortIn(List<Integer> values) {
            addCriterion("req_port in", values, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortNotIn(List<Integer> values) {
            addCriterion("req_port not in", values, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortBetween(Integer value1, Integer value2) {
            addCriterion("req_port between", value1, value2, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPortNotBetween(Integer value1, Integer value2) {
            addCriterion("req_port not between", value1, value2, "reqPort");
            return (Criteria) this;
        }

        public Criteria andReqPathIsNull() {
            addCriterion("req_path is null");
            return (Criteria) this;
        }

        public Criteria andReqPathIsNotNull() {
            addCriterion("req_path is not null");
            return (Criteria) this;
        }

        public Criteria andReqPathEqualTo(String value) {
            addCriterion("req_path =", value, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathNotEqualTo(String value) {
            addCriterion("req_path <>", value, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathGreaterThan(String value) {
            addCriterion("req_path >", value, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathGreaterThanOrEqualTo(String value) {
            addCriterion("req_path >=", value, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathLessThan(String value) {
            addCriterion("req_path <", value, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathLessThanOrEqualTo(String value) {
            addCriterion("req_path <=", value, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathLike(String value) {
            addCriterion("req_path like", value, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathNotLike(String value) {
            addCriterion("req_path not like", value, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathIn(List<String> values) {
            addCriterion("req_path in", values, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathNotIn(List<String> values) {
            addCriterion("req_path not in", values, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathBetween(String value1, String value2) {
            addCriterion("req_path between", value1, value2, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqPathNotBetween(String value1, String value2) {
            addCriterion("req_path not between", value1, value2, "reqPath");
            return (Criteria) this;
        }

        public Criteria andReqQueryIsNull() {
            addCriterion("req_query is null");
            return (Criteria) this;
        }

        public Criteria andReqQueryIsNotNull() {
            addCriterion("req_query is not null");
            return (Criteria) this;
        }

        public Criteria andReqQueryEqualTo(String value) {
            addCriterion("req_query =", value, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryNotEqualTo(String value) {
            addCriterion("req_query <>", value, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryGreaterThan(String value) {
            addCriterion("req_query >", value, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryGreaterThanOrEqualTo(String value) {
            addCriterion("req_query >=", value, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryLessThan(String value) {
            addCriterion("req_query <", value, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryLessThanOrEqualTo(String value) {
            addCriterion("req_query <=", value, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryLike(String value) {
            addCriterion("req_query like", value, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryNotLike(String value) {
            addCriterion("req_query not like", value, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryIn(List<String> values) {
            addCriterion("req_query in", values, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryNotIn(List<String> values) {
            addCriterion("req_query not in", values, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryBetween(String value1, String value2) {
            addCriterion("req_query between", value1, value2, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqQueryNotBetween(String value1, String value2) {
            addCriterion("req_query not between", value1, value2, "reqQuery");
            return (Criteria) this;
        }

        public Criteria andReqPolicyIsNull() {
            addCriterion("req_policy is null");
            return (Criteria) this;
        }

        public Criteria andReqPolicyIsNotNull() {
            addCriterion("req_policy is not null");
            return (Criteria) this;
        }

        public Criteria andReqPolicyEqualTo(String value) {
            addCriterion("req_policy =", value, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyNotEqualTo(String value) {
            addCriterion("req_policy <>", value, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyGreaterThan(String value) {
            addCriterion("req_policy >", value, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("req_policy >=", value, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyLessThan(String value) {
            addCriterion("req_policy <", value, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyLessThanOrEqualTo(String value) {
            addCriterion("req_policy <=", value, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyLike(String value) {
            addCriterion("req_policy like", value, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyNotLike(String value) {
            addCriterion("req_policy not like", value, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyIn(List<String> values) {
            addCriterion("req_policy in", values, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyNotIn(List<String> values) {
            addCriterion("req_policy not in", values, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyBetween(String value1, String value2) {
            addCriterion("req_policy between", value1, value2, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andReqPolicyNotBetween(String value1, String value2) {
            addCriterion("req_policy not between", value1, value2, "reqPolicy");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("node_id =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("node_id <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("node_id >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("node_id >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("node_id <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("node_id <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("node_id like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("node_id not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("node_id in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("node_id not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("node_id between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("node_id not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andProxyStatusIsNull() {
            addCriterion("proxy_status is null");
            return (Criteria) this;
        }

        public Criteria andProxyStatusIsNotNull() {
            addCriterion("proxy_status is not null");
            return (Criteria) this;
        }

        public Criteria andProxyStatusEqualTo(Byte value) {
            addCriterion("proxy_status =", value, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusNotEqualTo(Byte value) {
            addCriterion("proxy_status <>", value, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusGreaterThan(Byte value) {
            addCriterion("proxy_status >", value, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("proxy_status >=", value, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusLessThan(Byte value) {
            addCriterion("proxy_status <", value, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("proxy_status <=", value, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusIn(List<Byte> values) {
            addCriterion("proxy_status in", values, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusNotIn(List<Byte> values) {
            addCriterion("proxy_status not in", values, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusBetween(Byte value1, Byte value2) {
            addCriterion("proxy_status between", value1, value2, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("proxy_status not between", value1, value2, "proxyStatus");
            return (Criteria) this;
        }

        public Criteria andProxyCostIsNull() {
            addCriterion("proxy_cost is null");
            return (Criteria) this;
        }

        public Criteria andProxyCostIsNotNull() {
            addCriterion("proxy_cost is not null");
            return (Criteria) this;
        }

        public Criteria andProxyCostEqualTo(Integer value) {
            addCriterion("proxy_cost =", value, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostNotEqualTo(Integer value) {
            addCriterion("proxy_cost <>", value, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostGreaterThan(Integer value) {
            addCriterion("proxy_cost >", value, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("proxy_cost >=", value, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostLessThan(Integer value) {
            addCriterion("proxy_cost <", value, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostLessThanOrEqualTo(Integer value) {
            addCriterion("proxy_cost <=", value, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostIn(List<Integer> values) {
            addCriterion("proxy_cost in", values, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostNotIn(List<Integer> values) {
            addCriterion("proxy_cost not in", values, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostBetween(Integer value1, Integer value2) {
            addCriterion("proxy_cost between", value1, value2, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andProxyCostNotBetween(Integer value1, Integer value2) {
            addCriterion("proxy_cost not between", value1, value2, "proxyCost");
            return (Criteria) this;
        }

        public Criteria andRspCodeIsNull() {
            addCriterion("rsp_code is null");
            return (Criteria) this;
        }

        public Criteria andRspCodeIsNotNull() {
            addCriterion("rsp_code is not null");
            return (Criteria) this;
        }

        public Criteria andRspCodeEqualTo(Integer value) {
            addCriterion("rsp_code =", value, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeNotEqualTo(Integer value) {
            addCriterion("rsp_code <>", value, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeGreaterThan(Integer value) {
            addCriterion("rsp_code >", value, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rsp_code >=", value, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeLessThan(Integer value) {
            addCriterion("rsp_code <", value, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeLessThanOrEqualTo(Integer value) {
            addCriterion("rsp_code <=", value, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeIn(List<Integer> values) {
            addCriterion("rsp_code in", values, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeNotIn(List<Integer> values) {
            addCriterion("rsp_code not in", values, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeBetween(Integer value1, Integer value2) {
            addCriterion("rsp_code between", value1, value2, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("rsp_code not between", value1, value2, "rspCode");
            return (Criteria) this;
        }

        public Criteria andRspReasonIsNull() {
            addCriterion("rsp_reason is null");
            return (Criteria) this;
        }

        public Criteria andRspReasonIsNotNull() {
            addCriterion("rsp_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRspReasonEqualTo(String value) {
            addCriterion("rsp_reason =", value, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonNotEqualTo(String value) {
            addCriterion("rsp_reason <>", value, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonGreaterThan(String value) {
            addCriterion("rsp_reason >", value, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonGreaterThanOrEqualTo(String value) {
            addCriterion("rsp_reason >=", value, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonLessThan(String value) {
            addCriterion("rsp_reason <", value, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonLessThanOrEqualTo(String value) {
            addCriterion("rsp_reason <=", value, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonLike(String value) {
            addCriterion("rsp_reason like", value, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonNotLike(String value) {
            addCriterion("rsp_reason not like", value, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonIn(List<String> values) {
            addCriterion("rsp_reason in", values, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonNotIn(List<String> values) {
            addCriterion("rsp_reason not in", values, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonBetween(String value1, String value2) {
            addCriterion("rsp_reason between", value1, value2, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspReasonNotBetween(String value1, String value2) {
            addCriterion("rsp_reason not between", value1, value2, "rspReason");
            return (Criteria) this;
        }

        public Criteria andRspSizeIsNull() {
            addCriterion("rsp_size is null");
            return (Criteria) this;
        }

        public Criteria andRspSizeIsNotNull() {
            addCriterion("rsp_size is not null");
            return (Criteria) this;
        }

        public Criteria andRspSizeEqualTo(Integer value) {
            addCriterion("rsp_size =", value, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeNotEqualTo(Integer value) {
            addCriterion("rsp_size <>", value, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeGreaterThan(Integer value) {
            addCriterion("rsp_size >", value, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rsp_size >=", value, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeLessThan(Integer value) {
            addCriterion("rsp_size <", value, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeLessThanOrEqualTo(Integer value) {
            addCriterion("rsp_size <=", value, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeIn(List<Integer> values) {
            addCriterion("rsp_size in", values, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeNotIn(List<Integer> values) {
            addCriterion("rsp_size not in", values, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeBetween(Integer value1, Integer value2) {
            addCriterion("rsp_size between", value1, value2, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("rsp_size not between", value1, value2, "rspSize");
            return (Criteria) this;
        }

        public Criteria andRspTimeIsNull() {
            addCriterion("rsp_time is null");
            return (Criteria) this;
        }

        public Criteria andRspTimeIsNotNull() {
            addCriterion("rsp_time is not null");
            return (Criteria) this;
        }

        public Criteria andRspTimeEqualTo(Long value) {
            addCriterion("rsp_time =", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeNotEqualTo(Long value) {
            addCriterion("rsp_time <>", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeGreaterThan(Long value) {
            addCriterion("rsp_time >", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("rsp_time >=", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeLessThan(Long value) {
            addCriterion("rsp_time <", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeLessThanOrEqualTo(Long value) {
            addCriterion("rsp_time <=", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeIn(List<Long> values) {
            addCriterion("rsp_time in", values, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeNotIn(List<Long> values) {
            addCriterion("rsp_time not in", values, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeBetween(Long value1, Long value2) {
            addCriterion("rsp_time between", value1, value2, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeNotBetween(Long value1, Long value2) {
            addCriterion("rsp_time not between", value1, value2, "rspTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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