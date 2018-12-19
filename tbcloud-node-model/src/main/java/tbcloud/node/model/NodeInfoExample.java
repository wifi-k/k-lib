package tbcloud.node.model;

import java.util.ArrayList;
import java.util.List;

public class NodeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeInfoExample() {
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

        public Criteria andManufactoryIsNull() {
            addCriterion("manufactory is null");
            return (Criteria) this;
        }

        public Criteria andManufactoryIsNotNull() {
            addCriterion("manufactory is not null");
            return (Criteria) this;
        }

        public Criteria andManufactoryEqualTo(String value) {
            addCriterion("manufactory =", value, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryNotEqualTo(String value) {
            addCriterion("manufactory <>", value, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryGreaterThan(String value) {
            addCriterion("manufactory >", value, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryGreaterThanOrEqualTo(String value) {
            addCriterion("manufactory >=", value, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryLessThan(String value) {
            addCriterion("manufactory <", value, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryLessThanOrEqualTo(String value) {
            addCriterion("manufactory <=", value, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryLike(String value) {
            addCriterion("manufactory like", value, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryNotLike(String value) {
            addCriterion("manufactory not like", value, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryIn(List<String> values) {
            addCriterion("manufactory in", values, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryNotIn(List<String> values) {
            addCriterion("manufactory not in", values, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryBetween(String value1, String value2) {
            addCriterion("manufactory between", value1, value2, "manufactory");
            return (Criteria) this;
        }

        public Criteria andManufactoryNotBetween(String value1, String value2) {
            addCriterion("manufactory not between", value1, value2, "manufactory");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andFirmwareIsNull() {
            addCriterion("firmware is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareIsNotNull() {
            addCriterion("firmware is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareEqualTo(String value) {
            addCriterion("firmware =", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareNotEqualTo(String value) {
            addCriterion("firmware <>", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareGreaterThan(String value) {
            addCriterion("firmware >", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareGreaterThanOrEqualTo(String value) {
            addCriterion("firmware >=", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareLessThan(String value) {
            addCriterion("firmware <", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareLessThanOrEqualTo(String value) {
            addCriterion("firmware <=", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareLike(String value) {
            addCriterion("firmware like", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareNotLike(String value) {
            addCriterion("firmware not like", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareIn(List<String> values) {
            addCriterion("firmware in", values, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareNotIn(List<String> values) {
            addCriterion("firmware not in", values, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareBetween(String value1, String value2) {
            addCriterion("firmware between", value1, value2, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareNotBetween(String value1, String value2) {
            addCriterion("firmware not between", value1, value2, "firmware");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNull() {
            addCriterion("bind_time is null");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNotNull() {
            addCriterion("bind_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindTimeEqualTo(Long value) {
            addCriterion("bind_time =", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotEqualTo(Long value) {
            addCriterion("bind_time <>", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThan(Long value) {
            addCriterion("bind_time >", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("bind_time >=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThan(Long value) {
            addCriterion("bind_time <", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThanOrEqualTo(Long value) {
            addCriterion("bind_time <=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeIn(List<Long> values) {
            addCriterion("bind_time in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotIn(List<Long> values) {
            addCriterion("bind_time not in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeBetween(Long value1, Long value2) {
            addCriterion("bind_time between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotBetween(Long value1, Long value2) {
            addCriterion("bind_time not between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andIsBindIsNull() {
            addCriterion("is_bind is null");
            return (Criteria) this;
        }

        public Criteria andIsBindIsNotNull() {
            addCriterion("is_bind is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindEqualTo(Byte value) {
            addCriterion("is_bind =", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotEqualTo(Byte value) {
            addCriterion("is_bind <>", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindGreaterThan(Byte value) {
            addCriterion("is_bind >", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_bind >=", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLessThan(Byte value) {
            addCriterion("is_bind <", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLessThanOrEqualTo(Byte value) {
            addCriterion("is_bind <=", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindIn(List<Byte> values) {
            addCriterion("is_bind in", values, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotIn(List<Byte> values) {
            addCriterion("is_bind not in", values, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindBetween(Byte value1, Byte value2) {
            addCriterion("is_bind between", value1, value2, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotBetween(Byte value1, Byte value2) {
            addCriterion("is_bind not between", value1, value2, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNull() {
            addCriterion("is_share is null");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNotNull() {
            addCriterion("is_share is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareEqualTo(Byte value) {
            addCriterion("is_share =", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotEqualTo(Byte value) {
            addCriterion("is_share <>", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThan(Byte value) {
            addCriterion("is_share >", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_share >=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThan(Byte value) {
            addCriterion("is_share <", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThanOrEqualTo(Byte value) {
            addCriterion("is_share <=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareIn(List<Byte> values) {
            addCriterion("is_share in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotIn(List<Byte> values) {
            addCriterion("is_share not in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareBetween(Byte value1, Byte value2) {
            addCriterion("is_share between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotBetween(Byte value1, Byte value2) {
            addCriterion("is_share not between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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

        public Criteria andPartnerIsNull() {
            addCriterion("partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(String value) {
            addCriterion("partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(String value) {
            addCriterion("partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(String value) {
            addCriterion("partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(String value) {
            addCriterion("partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(String value) {
            addCriterion("partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(String value) {
            addCriterion("partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(String value) {
            addCriterion("partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<String> values) {
            addCriterion("partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<String> values) {
            addCriterion("partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(String value1, String value2) {
            addCriterion("partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(String value1, String value2) {
            addCriterion("partner not between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNull() {
            addCriterion("memory is null");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNotNull() {
            addCriterion("memory is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryEqualTo(Integer value) {
            addCriterion("memory =", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotEqualTo(Integer value) {
            addCriterion("memory <>", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThan(Integer value) {
            addCriterion("memory >", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory >=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThan(Integer value) {
            addCriterion("memory <", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThanOrEqualTo(Integer value) {
            addCriterion("memory <=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryIn(List<Integer> values) {
            addCriterion("memory in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotIn(List<Integer> values) {
            addCriterion("memory not in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryBetween(Integer value1, Integer value2) {
            addCriterion("memory between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotBetween(Integer value1, Integer value2) {
            addCriterion("memory not between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andDiskIsNull() {
            addCriterion("disk is null");
            return (Criteria) this;
        }

        public Criteria andDiskIsNotNull() {
            addCriterion("disk is not null");
            return (Criteria) this;
        }

        public Criteria andDiskEqualTo(Integer value) {
            addCriterion("disk =", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskNotEqualTo(Integer value) {
            addCriterion("disk <>", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskGreaterThan(Integer value) {
            addCriterion("disk >", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskGreaterThanOrEqualTo(Integer value) {
            addCriterion("disk >=", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskLessThan(Integer value) {
            addCriterion("disk <", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskLessThanOrEqualTo(Integer value) {
            addCriterion("disk <=", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskIn(List<Integer> values) {
            addCriterion("disk in", values, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskNotIn(List<Integer> values) {
            addCriterion("disk not in", values, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskBetween(Integer value1, Integer value2) {
            addCriterion("disk between", value1, value2, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskNotBetween(Integer value1, Integer value2) {
            addCriterion("disk not between", value1, value2, "disk");
            return (Criteria) this;
        }

        public Criteria andUpstreamIsNull() {
            addCriterion("upstream is null");
            return (Criteria) this;
        }

        public Criteria andUpstreamIsNotNull() {
            addCriterion("upstream is not null");
            return (Criteria) this;
        }

        public Criteria andUpstreamEqualTo(Integer value) {
            addCriterion("upstream =", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamNotEqualTo(Integer value) {
            addCriterion("upstream <>", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamGreaterThan(Integer value) {
            addCriterion("upstream >", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamGreaterThanOrEqualTo(Integer value) {
            addCriterion("upstream >=", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamLessThan(Integer value) {
            addCriterion("upstream <", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamLessThanOrEqualTo(Integer value) {
            addCriterion("upstream <=", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamIn(List<Integer> values) {
            addCriterion("upstream in", values, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamNotIn(List<Integer> values) {
            addCriterion("upstream not in", values, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamBetween(Integer value1, Integer value2) {
            addCriterion("upstream between", value1, value2, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamNotBetween(Integer value1, Integer value2) {
            addCriterion("upstream not between", value1, value2, "upstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamIsNull() {
            addCriterion("downstream is null");
            return (Criteria) this;
        }

        public Criteria andDownstreamIsNotNull() {
            addCriterion("downstream is not null");
            return (Criteria) this;
        }

        public Criteria andDownstreamEqualTo(Integer value) {
            addCriterion("downstream =", value, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamNotEqualTo(Integer value) {
            addCriterion("downstream <>", value, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamGreaterThan(Integer value) {
            addCriterion("downstream >", value, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamGreaterThanOrEqualTo(Integer value) {
            addCriterion("downstream >=", value, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamLessThan(Integer value) {
            addCriterion("downstream <", value, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamLessThanOrEqualTo(Integer value) {
            addCriterion("downstream <=", value, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamIn(List<Integer> values) {
            addCriterion("downstream in", values, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamNotIn(List<Integer> values) {
            addCriterion("downstream not in", values, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamBetween(Integer value1, Integer value2) {
            addCriterion("downstream between", value1, value2, "downstream");
            return (Criteria) this;
        }

        public Criteria andDownstreamNotBetween(Integer value1, Integer value2) {
            addCriterion("downstream not between", value1, value2, "downstream");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeIsNull() {
            addCriterion("unbind_time is null");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeIsNotNull() {
            addCriterion("unbind_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeEqualTo(Long value) {
            addCriterion("unbind_time =", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeNotEqualTo(Long value) {
            addCriterion("unbind_time <>", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeGreaterThan(Long value) {
            addCriterion("unbind_time >", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("unbind_time >=", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeLessThan(Long value) {
            addCriterion("unbind_time <", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeLessThanOrEqualTo(Long value) {
            addCriterion("unbind_time <=", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeIn(List<Long> values) {
            addCriterion("unbind_time in", values, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeNotIn(List<Long> values) {
            addCriterion("unbind_time not in", values, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeBetween(Long value1, Long value2) {
            addCriterion("unbind_time between", value1, value2, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeNotBetween(Long value1, Long value2) {
            addCriterion("unbind_time not between", value1, value2, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeIsNull() {
            addCriterion("share_time is null");
            return (Criteria) this;
        }

        public Criteria andShareTimeIsNotNull() {
            addCriterion("share_time is not null");
            return (Criteria) this;
        }

        public Criteria andShareTimeEqualTo(Long value) {
            addCriterion("share_time =", value, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeNotEqualTo(Long value) {
            addCriterion("share_time <>", value, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeGreaterThan(Long value) {
            addCriterion("share_time >", value, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("share_time >=", value, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeLessThan(Long value) {
            addCriterion("share_time <", value, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeLessThanOrEqualTo(Long value) {
            addCriterion("share_time <=", value, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeIn(List<Long> values) {
            addCriterion("share_time in", values, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeNotIn(List<Long> values) {
            addCriterion("share_time not in", values, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeBetween(Long value1, Long value2) {
            addCriterion("share_time between", value1, value2, "shareTime");
            return (Criteria) this;
        }

        public Criteria andShareTimeNotBetween(Long value1, Long value2) {
            addCriterion("share_time not between", value1, value2, "shareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeIsNull() {
            addCriterion("unshare_time is null");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeIsNotNull() {
            addCriterion("unshare_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeEqualTo(Long value) {
            addCriterion("unshare_time =", value, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeNotEqualTo(Long value) {
            addCriterion("unshare_time <>", value, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeGreaterThan(Long value) {
            addCriterion("unshare_time >", value, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("unshare_time >=", value, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeLessThan(Long value) {
            addCriterion("unshare_time <", value, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeLessThanOrEqualTo(Long value) {
            addCriterion("unshare_time <=", value, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeIn(List<Long> values) {
            addCriterion("unshare_time in", values, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeNotIn(List<Long> values) {
            addCriterion("unshare_time not in", values, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeBetween(Long value1, Long value2) {
            addCriterion("unshare_time between", value1, value2, "unshareTime");
            return (Criteria) this;
        }

        public Criteria andUnshareTimeNotBetween(Long value1, Long value2) {
            addCriterion("unshare_time not between", value1, value2, "unshareTime");
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
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