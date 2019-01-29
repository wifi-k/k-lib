package tbcloud.elastic.model.client;

import com.jayway.jsonpath.*;
import com.jayway.jsonpath.spi.json.GsonJsonProvider;
import com.jayway.jsonpath.spi.json.JsonProvider;
import com.jayway.jsonpath.spi.mapper.GsonMappingProvider;
import com.jayway.jsonpath.spi.mapper.MappingProvider;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import tbcloud.elastic.model.*;
import tbcloud.httpproxy.model.HttpProxyRecord;
import tbcloud.lib.api.util.GsonUtil;
import tbcloud.lib.api.util.StringUtil;
import tbcloud.lib.api.util.TimestampMark;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @author dzh
 * @date 2019-01-25 15:00
 */
public class TbcloudESClient extends ESClient {

    private static final String ID_HTTPPROXYRECORD = "httpproxyrecord";

    static {
        Configuration.setDefaults(new Configuration.Defaults() {
            private final JsonProvider jsonProvider = new GsonJsonProvider();
            private final MappingProvider mappingProvider = new GsonMappingProvider();

            @Override
            public JsonProvider jsonProvider() {
                return jsonProvider;
            }

            @Override
            public MappingProvider mappingProvider() {
                return mappingProvider;
            }

            @Override
            public Set<Option> options() {
                return EnumSet.noneOf(Option.class);
            }
        });
    }

    public TbcloudESClient(String conf) throws IOException {
        super(conf);
    }

    public TbcloudESClient(InputStream conf) throws IOException {
        super(conf);
    }

    public boolean indexRecord(HttpProxyRecord record) throws IOException {
        String indexName = indexAliasWrite(ID_HTTPPROXYRECORD);

        String path = String.join("/", indexName, "_doc", record.getId());
        if (!StringUtil.isEmpty(record.getNodeId())) {
            path += "?routing=" + record.getNodeId();
        }
        Response rsp = httpReq("PUT", path, null, GsonUtil.toJson(record));
        String json = EntityUtils.toString(rsp.getEntity(), StandardCharsets.UTF_8);
        LOG.info("indexRecord rsp {} {} {}", record.getUserId(), record.getId(), json);
        return isSuccess(rsp);
    }

    /**
     * @param userId
     * @param pageNo
     * @param pageSize
     * @param reqStartTime
     * @param reqEndTime
     * @param reqTime      for search after
     * @param recordId     for search after
     * @return
     * @throws IOException
     */
    public PageResult<HttpProxyRecord> recordList(long userId, int pageNo, int pageSize, Long reqStartTime, Long reqEndTime, Long reqTime, String recordId)
            throws IOException {
        SearchBuilder builder = SearchBuilder.create().size(pageSize)
                .sort(Arrays.asList(ESPairVal.create("reqTime", "desc"), ESPairVal.create("id", "asc"))).query(ESQuery.create()
                        .bool(ESBool.create().filter(Arrays.asList(ESTerm.create("userId", userId),
                                ESRange.create("reqTime").gte(reqStartTime).lte(reqEndTime)))));
        if (reqTime != null && !StringUtil.isEmpty(recordId)) {
            builder.searchAfter(Arrays.asList(reqTime, recordId));
        } else {
            builder.from((pageNo - 1) * pageSize);
        }

        String searchJson = builder.toJson();
        // LOG.info("usrNoticeList req {} {}", usrId, searchJson);

        PageResult<HttpProxyRecord> result = new PageResult<>();
        TimestampMark mark = TimestampMark.init("userRecordList");
        String indexName = indexAliasRead(ID_HTTPPROXYRECORD);
        Response rsp = httpReq("POST", indexName + "/_search", null, searchJson);
        if (isSuccess(rsp) && rsp.getEntity() != null) {
            String json = EntityUtils.toString(rsp.getEntity(), StandardCharsets.UTF_8); // closed rsp
            LOG.info("userRecordList rsp {} {}", userId, json);

            //List<HttpProxyRecord> recordList = JsonPath.<List<HttpProxyRecord>>read(json, "$.hits.hits[*]._source");
            DocumentContext doc = JsonPath.parse(json);
            List<HttpProxyRecord> recordList = doc.read("$.hits.hits[*]._source", new TypeRef<List<HttpProxyRecord>>() {
            });
            Integer total = doc.read("$.hits.total", Integer.class);
            result.setPage(recordList);
            result.setTotal(total);

            mark.mark("readHits");
        } else {
            result.setTotal(0);
            result.setPage(Collections.emptyList());
        }
        LOG.info("{} {}", mark.toString(), userId);
        return result;
    }

    public HttpProxyRecord recordGet(long userId, String recordId) throws IOException {
        HttpProxyRecord record = null;

        TimestampMark mark = TimestampMark.init("recordGet");
        String indexName = indexAliasRead(ID_HTTPPROXYRECORD);
        Response rsp = httpReq("GET", String.join("/", indexName, "_doc", recordId), null, null);
        if (isSuccess(rsp) && rsp.getEntity() != null) {
            String json = EntityUtils.toString(rsp.getEntity(), StandardCharsets.UTF_8); // closed rsp
            LOG.info("userRecordList rsp {} {}", userId, json);
            record = JsonPath.parse(json).read("$._source", HttpProxyRecord.class);
            mark.mark("source");
        }
        LOG.info("{} {} {}", mark.toString(), userId, recordId);
        return record;
    }


}
