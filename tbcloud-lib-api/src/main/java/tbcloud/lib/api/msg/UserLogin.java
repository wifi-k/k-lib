package tbcloud.lib.api.msg;

/**
 * @author dzh
 * @date 2018-11-22 10:36
 */
public class UserLogin {

    private long userId;
    private String token;
    private int status; //0-offline 1-online
    private long date; // timestamp

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
}
