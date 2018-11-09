package tbcloud.lib.api.util;

/**
 * @author dzh
 * @version 0.0.1
 * @date May 21, 2018 7:15:14 PM
 */
public class TimestampMark {

    private StringBuilder buf;

    private String n; // name
    private long ts; // timestamp

    private TimestampMark() {
        buf = new StringBuilder();
    }

    public static final TimestampMark init(String name) {
        return init(name, System.currentTimeMillis());
    }

    public static final TimestampMark init(String name, long st) {
        TimestampMark mark = new TimestampMark();
        mark.n = name;
        mark.ts = System.currentTimeMillis();
        return mark;
    }

    public void mark(String name) {
        long st = System.currentTimeMillis();

        buf.append(n);
        buf.append("-" + name + ":"); // previous name
        buf.append(st - ts);
        buf.append(" ");

        this.n = name;
        this.ts = st;
    }

    public String toString() {
        return buf.toString().trim();
    }

}
