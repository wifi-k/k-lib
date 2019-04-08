package tbcloud.lib.api.msg;

/**
 * @author dzh
 * @date 2018-11-22 10:36
 */
public class UserLogin {

    private int platform;//1-user 2-open
    private long userId;
    private String token;
    private int status; //0-offline 1-online
    private long date; // timestamp

    private Integer devType;
    private String devToken;
    private String devOs;

    public Integer getDevType() {
        return devType;
    }

    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    public String getDevToken() {
        return devToken;
    }

    public void setDevToken(String devToken) {
        this.devToken = devToken;
    }

    public String getDevOs() {
        return devOs;
    }

    public void setDevOs(String devOs) {
        this.devOs = devOs;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }
}
