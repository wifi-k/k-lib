package tbcloud.node.model.ext;

import tbcloud.node.model.NodeInfo;

/**
 * @author dzh
 * @date 2018-11-20 17:28
 */
public class NodeInfoRt extends NodeInfo {
    private Integer status;
    private long onlineTime;
    private long offlineTime;
    private String token;
    private Integer health;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public long getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(long onlineTime) {
        this.onlineTime = onlineTime;
    }

    public long getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(long offlineTime) {
        this.offlineTime = offlineTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
