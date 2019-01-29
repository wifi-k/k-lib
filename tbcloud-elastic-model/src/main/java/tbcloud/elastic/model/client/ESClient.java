/**
 *
 */
package tbcloud.elastic.model.client;

import com.google.gson.reflect.TypeToken;
import com.jayway.jsonpath.JsonPath;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.ResponseListener;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tbcloud.elastic.model.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dzh
 * @date Oct 17, 2016 7:58:02 PM
 * @since 1.0
 */
public class ESClient {

    static final Logger LOG = LoggerFactory.getLogger(ESClient.class);

    private RestClient _client;

    public ESClient(String conf) throws IOException {
        this(new FileInputStream(conf));
    }

    public ESClient(InputStream conf) throws IOException {
        try {
            open(ClientConf.create(conf));
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    // public ESClient(Properties conf) throws IOException {
    // open(ClientConf.create(conf));
    // }

    /**
     * To invoke close after not to be used
     *
     * @param conf
     *            FileInputStream of esclient.properties
     * @return
     * @throws ElasticsearchException
     * @throws IOException
     */
    private final void open(final ClientConf conf) throws IOException {
        init(conf);
        _client = RestClient.builder(conf.parseHttpHost()).setRequestConfigCallback(new RestClientBuilder.RequestConfigCallback() {
            @Override
            public RequestConfig.Builder customizeRequestConfig(RequestConfig.Builder requestConfigBuilder) {
                return requestConfigBuilder.setConnectTimeout(Integer.parseInt(conf.getVal(ClientConf.HTTP_CONN_TIMEOUT, "5000")))
                        .setSocketTimeout(Integer.parseInt(conf.getVal(ClientConf.HTTP_SOCKET_TIMEOUT, "30000")));
            }
        }).setMaxRetryTimeoutMillis(Integer.parseInt(conf.getVal(ClientConf.HTTP_RETRY_TIMEOUT, "10000")))
                .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
                    @Override
                    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                        return httpClientBuilder.setMaxConnPerRoute(Integer.parseInt(conf.getVal(ClientConf.HTTP_CONN_PER_ROUTE, "100")))
                                .setMaxConnTotal(Integer.parseInt(conf.getVal(ClientConf.HTTP_CONN_TOTAL, "200")));
                    }
                }).build();
    }

    protected ClientConf conf;

    protected void init(ClientConf conf) {
        LOG.info(conf.toString());

        this.conf = conf;
    }

    protected String indexAliasWrite(String id) {
        return conf.getValWithGroup(id, "alias.write");
    }

    protected String indexAliasRead(String id) {
        return conf.getValWithGroup(id, "alias.read");
    }

    /**
     *
     * @param method
     * @param path
     * @param params
     * @param data
     *            application/json
     * @param headers
     * @return Response needs to be consumed
     * @throws IOException
     */
    public Response httpReq(String method, String path, Map<String, String> params, String data, Header... headers) throws IOException {
        if (params == null) params = Collections.emptyMap();
        HttpEntity entity = data == null ? null : new NStringEntity(data, ContentType.APPLICATION_JSON);
        LOG.info("{} {} {} {}", method, path, params, data);
        return _client.performRequest(method, path, params, entity);
    }

    public String httpReqResult(String method, String path, Map<String, String> params, String data, Header... headers) throws IOException {
        return consumeResponse(httpReq(method, path, params, data, headers));
    }

    /**
     *
     * @param method
     * @param path
     * @param params
     * @param data
     *            application/json
     * @param responseListener
     * @param headers
     * @throws IOException
     */
    public void httpReqAsync(String method, String path, Map<String, String> params, String data, ResponseListener responseListener,
                             Header... headers) throws IOException {
        if (params == null) params = Collections.emptyMap();
        HttpEntity entity = data == null ? null : new NStringEntity(data, ContentType.APPLICATION_JSON);
        _client.performRequestAsync(method, path, params, entity, responseListener, headers);
    }

    public Integer searchCount(String method, String path, Map<String, String> params, String data, Header... headers) throws IOException {
        Response r = httpReq(method, path, params, data, headers);
        if (isSuccess(r)) return consumeResponse(r, "$.count");
        return -1;
    }

    // public <T> List<T> searchSource(String method, String path, Map<String,
    // String> params, String data,
    // Header... headers) throws IOException {
    // Response r = httpReq(method, path, params, data, headers);
    // if (isSuccess(r)) {
    // // return consumeResponse(r, "$.hits.hits.._source");
    // ESSearchResult<T> result =
    // ESSearchResult.<ESSearchResult<T>>fromJson(consumeResponse(r),
    // new TypeToken<ESSearchResult<T>>() {
    // }.getType());
    // List<ESHitsVal<T>> hits = result.getHits().getHits();
    // List<T> list = new ArrayList<>(hits.size());
    // for (ESHitsVal<T> h : hits) {
    // list.add(h.get_source());
    // }
    // return list;
    // }
    // return Collections.emptyList();
    // }

    public <T> List<T> searchSourceField(String method, String path, Map<String, String> params, String data, String field,
                                         Header... headers) throws IOException {
        Response r = httpReq(method, path, params, data, headers);
        if (isSuccess(r)) return consumeResponse(r, "$.hits.hits.._source." + field);
        return Collections.emptyList();
    }

    /**
     *
     * @param method
     * @param path
     * @param scroll
     *            default = 1m
     * @param params
     * @param data
     * @param headers
     * @return
     * @throws IOException
     */
    public <T> SearchScrollContext<T> searchScroll(String method, String path, String scroll, Map<String, String> params, String data,
                                                   SearchScrollContext<T> context, Header... headers) throws IOException {
        if (scroll == null) scroll = "1m";
        // SearchResponse r = SearchResponse.parse(httpReq(method, path +
        // "?scroll=" + scroll, params, data, headers));
        Response r = httpReq(method, path + "?scroll=" + scroll, params, data, headers);
        if (isSuccess(r)) {
            ESSearchResult<T> result = context.consumeRespose(consumeResponse(r));

            Integer total = result.getHits().getTotal();
            SearchScroll<T> cur = new SearchScroll<T>();
            cur.scroll(scroll).result(result);

            context.total(total);
            context.current(cur);
            context.setClient(this);
        }
        return context;
    }

    public SearchScrollContext<LinkedHashMap<String, Object>> searchScroll(String method, String path, String scroll,
                                                                           Map<String, String> params, String data, Header... headers) throws IOException {
        SearchScrollContext<LinkedHashMap<String, Object>> context = new SearchScrollContext<LinkedHashMap<String, Object>>() {
            @Override
            public ESSearchResult<LinkedHashMap<String, Object>> consumeRespose(String json) {
                return ESSearchResult.fromJson(json, new TypeToken<ESSearchResult<LinkedHashMap<String, Object>>>() {
                }.getType());
            }
        };
        searchScroll(method, path, scroll, params, data, context, headers);
        return context;
    }

    public boolean deleteScroll(String scrollId) throws IOException {
        if (scrollId == null || "".equals(scrollId)) return true;
        String json = JsonBuilder.start(40).append("\"scroll_id\":[\"").append(scrollId).append("\"]").end();
        Response r = httpReq("DELETE", "/_search/scroll", null, json);
        consumeResponseQuietly(r);
        return isSuccess(r);
    }

    /**
     *
     * @param r
     */
    public void consumeResponseQuietly(Response r) {
        if (r == null) return;
        EntityUtils.consumeQuietly(r.getEntity());
    }

    public <T> T consumeResponse(Response r, String jpath) throws IOException {
        if (r.getEntity() == null) return null;
        String json = EntityUtils.toString(r.getEntity(), StandardCharsets.UTF_8);
        return JsonPath.<T>read(json, jpath);
    }

    public String consumeResponse(Response r) throws ParseException, IOException {
        if (r.getEntity() == null) return "";
        return EntityUtils.toString(r.getEntity(), StandardCharsets.UTF_8);
    }

    public String consumeResponse(Response r, Charset charset) throws ParseException, IOException {
        if (r.getEntity() == null) return "";
        return EntityUtils.toString(r.getEntity(), charset);
    }

    /**
     * create or update index aliases
     *
     * @param json
     *            alias actions, generate json with
     *
     * @return
     * @throws IOException
     */
    public boolean updateIndexAlias(String json) throws IOException {
        Response r = httpReq("POST", "/_aliases", null, json);
        consumeResponseQuietly(r);
        return isSuccess(r);
    }

    public int updateDoc(String method, String path, Map<String, String> params, String data, Header... headers) throws IOException {
        String json = consumeResponse(httpReq("POST", path, null, data, headers));
        if ("".equals(json)) {
            return 0;
        }
        return ESUpdateByQueryResult.fromJson(json).getUpdated();
    }

    public Response getIndexAlias(String alias) throws IOException {
        return httpReq("GET", "/_aliases/" + alias, null, null);
    }

    public Response getIndexAlias(String idx, String alias) throws IOException {
        return httpReq("GET", "/" + idx + "/_aliases/" + alias, null, null);
    }

    public boolean existIndexAliss(String idx, String alias) throws IOException {
        Response r = getIndexAlias(idx, alias);
        try {
            Object obj = consumeResponse(r, "$." + idx + ".aliases." + alias);
            return obj != null;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean existIndexAliss(String alias) throws IOException {
        Response r = getIndexAlias(alias);
        try {
            List<Object> obj = consumeResponse(r, "$..aliases." + alias);
            return !(obj == null || obj.isEmpty());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteIndexAlias(String alias) throws IOException {
        Response r = httpReq("DELETE", "/_all/_aliases/" + alias, null, null);
        consumeResponseQuietly(r);
        return isSuccess(r);
    }

    public boolean createIndex(String name, int shards, int replicas) throws IOException {
        ESIndex index = new ESIndex().number_of_shards(shards).number_of_replicas(replicas);
        Response r = httpReq("PUT", "/" + name, null, index.toString());
        consumeResponseQuietly(r);
        return isSuccess(r);
    }

    public void deleteIndex(String name) throws IOException {
        consumeResponseQuietly(httpReq("DELETE", "/" + name, null, null));
    }

    public boolean existIndex(String name) throws IOException {
        return isSuccess(httpReq("HEAD", "/" + name, null, null));
    }

    void logErr(Exception e) {
        LOG.error(e.getMessage(), e);
    }

    public boolean isSuccess(Response r) {
        int status = r.getStatusLine().getStatusCode();
        return status >= 200 && status < 300 ? true : false;
    }

    /**
     * dispose client resources
     */
    public void close() {
        if (_client != null) {
            try {
                _client.close();
                _client = null;
            } catch (IOException e) {
                logErr(e);
            }
        }
    }

}
