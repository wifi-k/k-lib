package tbcloud.common.user.model;

public class UserDeveloper {
    private Integer userId;

    private Integer status;

    private String reason;

    private String name;

    private String idNum;

    private String imgIdUser;

    private String imgIdBack;

    private Long createTime;

    private Long updateTime;

    private Byte isDelete;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public String getImgIdUser() {
        return imgIdUser;
    }

    public void setImgIdUser(String imgIdUser) {
        this.imgIdUser = imgIdUser == null ? null : imgIdUser.trim();
    }

    public String getImgIdBack() {
        return imgIdBack;
    }

    public void setImgIdBack(String imgIdBack) {
        this.imgIdBack = imgIdBack == null ? null : imgIdBack.trim();
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