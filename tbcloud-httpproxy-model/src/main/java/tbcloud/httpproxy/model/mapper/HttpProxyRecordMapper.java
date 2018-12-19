package tbcloud.httpproxy.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.httpproxy.model.HttpProxyRecord;
import tbcloud.httpproxy.model.HttpProxyRecordExample;

public interface HttpProxyRecordMapper {
    long countByExample(HttpProxyRecordExample example);

    int deleteByExample(HttpProxyRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(HttpProxyRecord record);

    int insertSelective(HttpProxyRecord record);

    List<HttpProxyRecord> selectByExample(HttpProxyRecordExample example);

    HttpProxyRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HttpProxyRecord record, @Param("example") HttpProxyRecordExample example);

    int updateByExample(@Param("record") HttpProxyRecord record, @Param("example") HttpProxyRecordExample example);

    int updateByPrimaryKeySelective(HttpProxyRecord record);

    int updateByPrimaryKey(HttpProxyRecord record);
}