package tbcloud.node.model;

/**
 * 节点的应用定义
 *
 * @author dzh
 * @date 2018-11-26 16:06
 */
public enum AppEnum {

    HTTP_PROXY("111a533a4874b7d89eca003ef2e64660", "HTTP代理");


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
