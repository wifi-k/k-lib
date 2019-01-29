/**
 *
 */
package tbcloud.elastic.model;

import com.google.gson.reflect.TypeToken;
import tbcloud.lib.api.util.GsonUtil;

import java.util.List;

/**
 * @author dzh
 * @date Oct 21, 2016 6:54:07 PM
 * @since 1.0
 */
public class ESUpdateByQueryResult extends ESObject {

    private Integer took;
    private boolean timed_out;
    private Integer total;
    private Integer updated;
    private Integer batches;
    private Integer version_conflicts;
    private Integer noops;
    private Integer retries;
    private Integer throttled_millis;
    private String requests_per_second;
    private Integer throttled_until_millis;
    private List<Object> failures;

    public Integer getTook() {
        return took;
    }

    public void setTook(Integer took) {
        this.took = took;
    }

    public boolean isTimed_out() {
        return timed_out;
    }

    public void setTimed_out(boolean timed_out) {
        this.timed_out = timed_out;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Integer getBatches() {
        return batches;
    }

    public void setBatches(Integer batches) {
        this.batches = batches;
    }

    public Integer getVersion_conflicts() {
        return version_conflicts;
    }

    public void setVersion_conflicts(Integer version_conflicts) {
        this.version_conflicts = version_conflicts;
    }

    public Integer getNoops() {
        return noops;
    }

    public void setNoops(Integer noops) {
        this.noops = noops;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Integer getThrottled_millis() {
        return throttled_millis;
    }

    public void setThrottled_millis(Integer throttled_millis) {
        this.throttled_millis = throttled_millis;
    }

    public String getRequests_per_second() {
        return requests_per_second;
    }

    public void setRequests_per_second(String requests_per_second) {
        this.requests_per_second = requests_per_second;
    }

    public Integer getThrottled_until_millis() {
        return throttled_until_millis;
    }

    public void setThrottled_until_millis(Integer throttled_until_millis) {
        this.throttled_until_millis = throttled_until_millis;
    }

    public List<Object> getFailures() {
        return failures;
    }

    public void setFailures(List<Object> failures) {
        this.failures = failures;
    }

    public static ESUpdateByQueryResult fromJson(String json) {
        return GsonUtil.fromJson(json, new TypeToken<ESUpdateByQueryResult>() {
        }.getType());
    }

}
