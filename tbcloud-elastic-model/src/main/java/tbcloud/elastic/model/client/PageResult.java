package tbcloud.elastic.model.client;

import java.util.List;

/**
 * 分页结果
 *
 * @author dzh
 * @date 2019-01-29 01:49
 */
public class PageResult<T> {

    private List<T> page;

    private Integer total;

    public List<T> getPage() {
        return page;
    }

    public void setPage(List<T> page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
