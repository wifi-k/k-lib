package tbcloud.httpproxy.model;

public class HttpProxyRecord {
    private String id;

    private Long userId;

    private String reqMethod;

    private String reqProtocol;

    private Integer reqSize;

    private Long reqTime;

    private String reqScheme;

    private String reqHost;

    private Integer reqPort;

    private String reqPath;

    private String reqQuery;

    private String reqPolicy;

    private String nodeId;

    private Byte proxyStatus;

    private Integer proxyCost;

    private Integer rspCode;

    private String rspReason;

    private Integer rspSize;

    private Long rspTime;

    private Long createTime;

    private Long updateTime;

    private Byte isDelete;

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

    public Long getReqTime() {
        return reqTime;
    }

    public void setReqTime(Long reqTime) {
        this.reqTime = reqTime;
    }

    public String getReqScheme() {
        return reqScheme;
    }

    public void setReqScheme(String reqScheme) {
        this.reqScheme = reqScheme == null ? null : reqScheme.trim();
    }

    public String getReqHost() {
        return reqHost;
    }

    public void setReqHost(String reqHost) {
        this.reqHost = reqHost == null ? null : reqHost.trim();
    }

    public Integer getReqPort() {
        return reqPort;
    }

    public void setReqPort(Integer reqPort) {
        this.reqPort = reqPort;
    }

    public String getReqPath() {
        return reqPath;
    }

    public void setReqPath(String reqPath) {
        this.reqPath = reqPath == null ? null : reqPath.trim();
    }

    public String getReqQuery() {
        return reqQuery;
    }

    public void setReqQuery(String reqQuery) {
        this.reqQuery = reqQuery == null ? null : reqQuery.trim();
    }

    public String getReqPolicy() {
        return reqPolicy;
    }

    public void setReqPolicy(String reqPolicy) {
        this.reqPolicy = reqPolicy == null ? null : reqPolicy.trim();
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public Byte getProxyStatus() {
        return proxyStatus;
    }

    public void setProxyStatus(Byte proxyStatus) {
        this.proxyStatus = proxyStatus;
    }

    public Integer getProxyCost() {
        return proxyCost;
    }

    public void setProxyCost(Integer proxyCost) {
        this.proxyCost = proxyCost;
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

    public Long getRspTime() {
        return rspTime;
    }

    public void setRspTime(Long rspTime) {
        this.rspTime = rspTime;
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
}