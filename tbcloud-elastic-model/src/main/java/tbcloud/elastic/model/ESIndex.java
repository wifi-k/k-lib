/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 19, 2016 11:20:37 PM
 * @since 1.0
 */
public class ESIndex extends ESObject {

    private int number_of_shards;

    private int number_of_replicas;

    public ESIndex number_of_shards(int shards) {
        this.number_of_shards = shards;
        return this;
    }

    public ESIndex number_of_replicas(int replicas) {
        this.number_of_replicas = replicas;
        return this;
    }

    @Override
    public String toString() {
        return toJson(new StringBuilder(75)).toString();
    }

    private StringBuilder toJson(StringBuilder buf) {
        return buf.append("{\"settings\":{\"index\":{\"number_of_shards\":").append(number_of_shards).append(",\"number_of_replicas\":")
                .append(number_of_replicas).append("}}}");
    }

}
