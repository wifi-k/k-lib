package tbcloud.node.model;

public class NodeDeviceWeek {
    private Long id;

    private Integer week;

    private String nodeId;

    private String mac;

    private Long totalTime;

    private Long createTime;

    private Long updateTime;

    private Byte isDelete;

    private String macNote;

    private String hostName;

    private String macVendor;

    private String macIcon;

    private Integer year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
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

    public String getMacNote() {
        return macNote;
    }

    public void setMacNote(String macNote) {
        this.macNote = macNote == null ? null : macNote.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}