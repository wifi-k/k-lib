package tbcloud.lib.api;

/**
 * 节点的应用定义
 *
 * @author dzh
 * @date 2018-11-26 16:06
 */
public enum AppEnum {

    HTTP_PROXY("101520a12084d5432d9f3300b9c70ae5", "HTTP代理");


    private String id;  // IDUtil.genAppId
    private String name;

    private AppEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
