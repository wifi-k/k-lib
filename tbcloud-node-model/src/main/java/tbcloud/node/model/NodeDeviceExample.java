package tbcloud.node.model;

import java.util.ArrayList;
import java.util.List;

public class NodeDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeDeviceExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
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

        public Criteria andOnTimeIsNull() {
            addCriterion("on_time is null");
            return (Criteria) this;
        }

        public Criteria andOnTimeIsNotNull() {
            addCriterion("on_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnTimeEqualTo(Long value) {
            addCriterion("on_time =", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotEqualTo(Long value) {
            addCriterion("on_time <>", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeGreaterThan(Long value) {
            addCriterion("on_time >", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("on_time >=", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLessThan(Long value) {
            addCriterion("on_time <", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLessThanOrEqualTo(Long value) {
            addCriterion("on_time <=", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeIn(List<Long> values) {
            addCriterion("on_time in", values, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotIn(List<Long> values) {
            addCriterion("on_time not in", values, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeBetween(Long value1, Long value2) {
            addCriterion("on_time between", value1, value2, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotBetween(Long value1, Long value2) {
            addCriterion("on_time not between", value1, value2, "onTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNull() {
            addCriterion("off_time is null");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNotNull() {
            addCriterion("off_time is not null");
            return (Criteria) this;
        }

        public Criteria andOffTimeEqualTo(Long value) {
            addCriterion("off_time =", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotEqualTo(Long value) {
            addCriterion("off_time <>", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThan(Long value) {
            addCriterion("off_time >", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("off_time >=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThan(Long value) {
            addCriterion("off_time <", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThanOrEqualTo(Long value) {
            addCriterion("off_time <=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIn(List<Long> values) {
            addCriterion("off_time in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotIn(List<Long> values) {
            addCriterion("off_time not in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeBetween(Long value1, Long value2) {
            addCriterion("off_time between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotBetween(Long value1, Long value2) {
            addCriterion("off_time not between", value1, value2, "offTime");
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

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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

        public Criteria andIsBlockIsNull() {
            addCriterion("is_block is null");
            return (Criteria) this;
        }

        public Criteria andIsBlockIsNotNull() {
            addCriterion("is_block is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlockEqualTo(Byte value) {
            addCriterion("is_block =", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockNotEqualTo(Byte value) {
            addCriterion("is_block <>", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockGreaterThan(Byte value) {
            addCriterion("is_block >", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_block >=", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockLessThan(Byte value) {
            addCriterion("is_block <", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockLessThanOrEqualTo(Byte value) {
            addCriterion("is_block <=", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockIn(List<Byte> values) {
            addCriterion("is_block in", values, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockNotIn(List<Byte> values) {
            addCriterion("is_block not in", values, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockBetween(Byte value1, Byte value2) {
            addCriterion("is_block between", value1, value2, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockNotBetween(Byte value1, Byte value2) {
            addCriterion("is_block not between", value1, value2, "isBlock");
            return (Criteria) this;
        }

        public Criteria andMacVendorIsNull() {
            addCriterion("mac_vendor is null");
            return (Criteria) this;
        }

        public Criteria andMacVendorIsNotNull() {
            addCriterion("mac_vendor is not null");
            return (Criteria) this;
        }

        public Criteria andMacVendorEqualTo(String value) {
            addCriterion("mac_vendor =", value, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorNotEqualTo(String value) {
            addCriterion("mac_vendor <>", value, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorGreaterThan(String value) {
            addCriterion("mac_vendor >", value, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorGreaterThanOrEqualTo(String value) {
            addCriterion("mac_vendor >=", value, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorLessThan(String value) {
            addCriterion("mac_vendor <", value, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorLessThanOrEqualTo(String value) {
            addCriterion("mac_vendor <=", value, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorLike(String value) {
            addCriterion("mac_vendor like", value, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorNotLike(String value) {
            addCriterion("mac_vendor not like", value, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorIn(List<String> values) {
            addCriterion("mac_vendor in", values, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorNotIn(List<String> values) {
            addCriterion("mac_vendor not in", values, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorBetween(String value1, String value2) {
            addCriterion("mac_vendor between", value1, value2, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacVendorNotBetween(String value1, String value2) {
            addCriterion("mac_vendor not between", value1, value2, "macVendor");
            return (Criteria) this;
        }

        public Criteria andMacIconIsNull() {
            addCriterion("mac_icon is null");
            return (Criteria) this;
        }

        public Criteria andMacIconIsNotNull() {
            addCriterion("mac_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMacIconEqualTo(String value) {
            addCriterion("mac_icon =", value, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconNotEqualTo(String value) {
            addCriterion("mac_icon <>", value, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconGreaterThan(String value) {
            addCriterion("mac_icon >", value, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconGreaterThanOrEqualTo(String value) {
            addCriterion("mac_icon >=", value, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconLessThan(String value) {
            addCriterion("mac_icon <", value, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconLessThanOrEqualTo(String value) {
            addCriterion("mac_icon <=", value, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconLike(String value) {
            addCriterion("mac_icon like", value, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconNotLike(String value) {
            addCriterion("mac_icon not like", value, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconIn(List<String> values) {
            addCriterion("mac_icon in", values, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconNotIn(List<String> values) {
            addCriterion("mac_icon not in", values, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconBetween(String value1, String value2) {
            addCriterion("mac_icon between", value1, value2, "macIcon");
            return (Criteria) this;
        }

        public Criteria andMacIconNotBetween(String value1, String value2) {
            addCriterion("mac_icon not between", value1, value2, "macIcon");
            return (Criteria) this;
        }

        public Criteria andLocalIpIsNull() {
            addCriterion("local_ip is null");
            return (Criteria) this;
        }

        public Criteria andLocalIpIsNotNull() {
            addCriterion("local_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLocalIpEqualTo(String value) {
            addCriterion("local_ip =", value, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpNotEqualTo(String value) {
            addCriterion("local_ip <>", value, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpGreaterThan(String value) {
            addCriterion("local_ip >", value, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpGreaterThanOrEqualTo(String value) {
            addCriterion("local_ip >=", value, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpLessThan(String value) {
            addCriterion("local_ip <", value, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpLessThanOrEqualTo(String value) {
            addCriterion("local_ip <=", value, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpLike(String value) {
            addCriterion("local_ip like", value, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpNotLike(String value) {
            addCriterion("local_ip not like", value, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpIn(List<String> values) {
            addCriterion("local_ip in", values, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpNotIn(List<String> values) {
            addCriterion("local_ip not in", values, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpBetween(String value1, String value2) {
            addCriterion("local_ip between", value1, value2, "localIp");
            return (Criteria) this;
        }

        public Criteria andLocalIpNotBetween(String value1, String value2) {
            addCriterion("local_ip not between", value1, value2, "localIp");
            return (Criteria) this;
        }

        public Criteria andIsRecordIsNull() {
            addCriterion("is_record is null");
            return (Criteria) this;
        }

        public Criteria andIsRecordIsNotNull() {
            addCriterion("is_record is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecordEqualTo(Byte value) {
            addCriterion("is_record =", value, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordNotEqualTo(Byte value) {
            addCriterion("is_record <>", value, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordGreaterThan(Byte value) {
            addCriterion("is_record >", value, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_record >=", value, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordLessThan(Byte value) {
            addCriterion("is_record <", value, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordLessThanOrEqualTo(Byte value) {
            addCriterion("is_record <=", value, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordIn(List<Byte> values) {
            addCriterion("is_record in", values, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordNotIn(List<Byte> values) {
            addCriterion("is_record not in", values, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordBetween(Byte value1, Byte value2) {
            addCriterion("is_record between", value1, value2, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsRecordNotBetween(Byte value1, Byte value2) {
            addCriterion("is_record not between", value1, value2, "isRecord");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("is_online is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("is_online is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Byte value) {
            addCriterion("is_online =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Byte value) {
            addCriterion("is_online <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Byte value) {
            addCriterion("is_online >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_online >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Byte value) {
            addCriterion("is_online <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Byte value) {
            addCriterion("is_online <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Byte> values) {
            addCriterion("is_online in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Byte> values) {
            addCriterion("is_online not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Byte value1, Byte value2) {
            addCriterion("is_online between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Byte value1, Byte value2) {
            addCriterion("is_online not between", value1, value2, "isOnline");
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