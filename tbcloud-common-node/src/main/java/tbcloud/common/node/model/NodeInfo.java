package tbcloud.common.node.model;

public class NodeInfo {
    private String nodeId;

    private String manufactory;

    private String model;

    private String firmware;

    private Long bindTime;

    private Byte isBind;

    private Byte isShare;

    private String comment;

    private Long createTime;

    private Long updateTime;

    private Byte isDelete;

    private String partner;

    private Integer memory;

    private Integer disk;

    private Integer upstream;

    private Integer downstream;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getManufactory() {
        return manufactory;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory == null ? null : manufactory.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware == null ? null : firmware.trim();
    }

    public Long getBindTime() {
        return bindTime;
    }

    public void setBindTime(Long bindTime) {
        this.bindTime = bindTime;
    }

    public Byte getIsBind() {
        return isBind;
    }

    public void setIsBind(Byte isBind) {
        this.isBind = isBind;
    }

    public Byte getIsShare() {
        return isShare;
    }

    public void setIsShare(Byte isShare) {
        this.isShare = isShare;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public Integer getUpstream() {
        return upstream;
    }

    public void setUpstream(Integer upstream) {
        this.upstream = upstream;
    }

    public Integer getDownstream() {
        return downstream;
    }

    public void setDownstream(Integer downstream) {
        this.downstream = downstream;
    }
}