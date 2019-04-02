package tbcloud.lib.api;

/**
 * @author dzh
 * @date 2019-04-02 10:05
 */
public enum DeviceVendorEnum {

    Apple("apple", "ic_apple.png"),
    Default("default", "ic_default.png"),
    HUAWEI("huawei", "ic_hw.png"),
    MEIZU("meizu", "ic_meizu.png"),
    XIAOMI("xiaomi", "ic_mi.png"),
    OPPO("oppo", "ic_oppo.png"),
    SAMSUNG("sumsung", "ic_ss.png"),
    VIVO("vivo", "ic_vivo.png");

    private String company;
    private String icon;

    private DeviceVendorEnum(String company, String icon) {
        this.company = company;
        this.icon = icon;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
