/**
 *
 */
package tbcloud.elastic.model.client;

import jframe.core.util.PropsConf;
import org.apache.http.HttpHost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/**
 * read and parse esclient.properties
 *
 * @author dzh
 * @date Oct 18, 2016 7:20:37 PM
 * @since 1.0
 */
public class ClientConf {

    static Logger LOG = LoggerFactory.getLogger(ClientConf.class);

    public static final String HTTP_HOST = "http.host";

    public static final String HTTP_PORT = "http.port";

    public static final String HTTP_SOCKET_TIMEOUT = "http.socket.timeout";

    public static final String HTTP_CONN_TIMEOUT = "http.conn.timeout";

    public static final String HTTP_RETRY_TIMEOUT = "http.retry.timeout";

    public static final String HTTP_CONN_TOTAL = "http.conn.total";

    public static final String HTTP_CONN_PER_ROUTE = "http.conn.per.route";

    private PropsConf _p;

    private ClientConf() {
    }

    public static final ClientConf create(InputStream client) throws Exception {
        ClientConf conf = new ClientConf();
        conf._p = new PropsConf();
        conf._p.init(client);
        return conf;
    }

    public String getHttpHost() {
        return _p.getConf(null, ClientConf.HTTP_HOST, "127.0.0.1:9200");
    }

    String[] getHttpHosts() {
        return _p.getConf(null, ClientConf.HTTP_HOST, "127.0.0.1:9200").split("\\s+");
    }

    /**
     * http.port
     *
     * @return
     */
    public int getHttpPort() {
        return _p.getConfInt(null, ClientConf.HTTP_PORT, "9200");
    }

    public HttpHost[] parseHttpHost() {
        String[] hosts = getHttpHosts();
        List<HttpHost> httpHost = new LinkedList<HttpHost>();
        for (int i = 0; i < hosts.length; i++) {
            String host = hosts[i];
            int loc = host.indexOf(':');
            if (loc == 0 || loc == host.length() - 1) continue;
            String ip = loc == -1 ? host : host.substring(0, loc);
            int port = loc == -1 ? getHttpPort() : Integer.parseInt(host.substring(loc + 1));

            httpHost.add(new HttpHost(ip, port, "http"));
        }
        return httpHost.toArray(new HttpHost[httpHost.size()]);
    }

    public String getValWithGroup(String group, String key) {
        return _p.getConf(group, key);
    }

    public String getVal(String key) {
        return _p.getConf(null, key);
    }

    public String getVal(String key, String defVal) {
        return _p.getConf(null, key, defVal);
    }

    @Override
    public String toString() {
        return _p.toString();
    }

}
