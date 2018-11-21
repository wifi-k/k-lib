package tbcloud.lib.api.msg;

/**
 * @author dzh
 * @date 2018-11-20 12:13
 */
public class EmailModify {

    private String token; //临时凭证，有效期1h
    private String email; //待验证的邮箱
    private String name; //用户昵称

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
