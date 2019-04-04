package tbcloud.node.model;

public class NodeDevice {
    private Long id;

    private String mac;

    private String name;

    private Long onTime;

    private Long offTime;

    private Integer status;

    private String note;

    private String nodeId;

    private Long createTime;

    private Long updateTime;

    private Byte isDelete;

    private Byte isBlock;

    private String macVendor;

    private String macIcon;

    private String localIp;

    private Byte isRecord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getOnTime() {
        return onTime;
    }

    public void setOnTime(Long onTime) {
        this.onTime = onTime;
    }

    public Long getOffTime() {
        return offTime;
    }

    public void setOffTime(Long offTime) {
        this.offTime = offTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
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

    public Byte getIsBlock() {
        return isBlock;
    }

    public void setIsBlock(Byte isBlock) {
        this.isBlock = isBlock;
    }

    public String getMacVendor() {
        return macVendor;
    }

    public void setMacVendor(String macVendor) {
        this.macVendor = macVendor == null ? null : macVendor.trim();
    }

    public String getMacIcon() {
        return macIcon;
    }

    public void setMacIcon(String macIcon) {
        this.macIcon = macIcon == null ? null : macIcon.trim();
    }

    public String getLocalIp() {
        return localIp;
    }

    public void setLocalIp(String localIp) {
        this.localIp = localIp == null ? null : localIp.trim();
    }

    public Byte getIsRecord() {
        return isRecord;
    }

    public void setIsRecord(Byte isRecord) {
        this.isRecord = isRecord;
    }
}