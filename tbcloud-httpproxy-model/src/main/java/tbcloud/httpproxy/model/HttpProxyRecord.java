package tbcloud.httpproxy.model;

public class HttpProxyRecord {
    private String id;

    private Long userId;

    private String reqUri;

    private String reqMethod;

    private String reqProtocol;

    private Integer reqSize;

    private Integer rspCode;

    private String rspReason;

    private Integer rspSize;

    private Long reqTime;

    private Long rspTime;

    private Long proxySendTime;

    private Long proxyRecvTime;

    private Long createTime;

    private Long updateTime;

    private Byte isDelete;

    private String nodeId;

    private Integer proxyCost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri == null ? null : reqUri.trim();
    }

    public String getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod == null ? null : reqMethod.trim();
    }

    public String getReqProtocol() {
        return reqProtocol;
    }

    public void setReqProtocol(String reqProtocol) {
        this.reqProtocol = reqProtocol == null ? null : reqProtocol.trim();
    }

    public Integer getReqSize() {
        return reqSize;
    }

    public void setReqSize(Integer reqSize) {
        this.reqSize = reqSize;
    }

    public Integer getRspCode() {
        return rspCode;
    }

    public void setRspCode(Integer rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspReason() {
        return rspReason;
    }

    public void setRspReason(String rspReason) {
        this.rspReason = rspReason == null ? null : rspReason.trim();
    }

    public Integer getRspSize() {
        return rspSize;
    }

    public void setRspSize(Integer rspSize) {
        this.rspSize = rspSize;
    }

    public Long getReqTime() {
        return reqTime;
    }

    public void setReqTime(Long reqTime) {
        this.reqTime = reqTime;
    }

    public Long getRspTime() {
        return rspTime;
    }

    public void setRspTime(Long rspTime) {
        this.rspTime = rspTime;
    }

    public Long getProxySendTime() {
        return proxySendTime;
    }

    public void setProxySendTime(Long proxySendTime) {
        this.proxySendTime = proxySendTime;
    }

    public Long getProxyRecvTime() {
        return proxyRecvTime;
    }

    public void setProxyRecvTime(Long proxyRecvTime) {
        this.proxyRecvTime = proxyRecvTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public Integer getProxyCost() {
        return proxyCost;
    }

    public void setProxyCost(Integer proxyCost) {
        this.proxyCost = proxyCost;
    }
}