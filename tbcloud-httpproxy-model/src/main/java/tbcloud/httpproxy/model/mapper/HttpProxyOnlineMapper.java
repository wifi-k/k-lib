package tbcloud.httpproxy.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.httpproxy.model.HttpProxyOnline;
import tbcloud.httpproxy.model.HttpProxyOnlineExample;

public interface HttpProxyOnlineMapper {
    long countByExample(HttpProxyOnlineExample example);

    int deleteByExample(HttpProxyOnlineExample example);

    int deleteByPrimaryKey(String nodeId);

    int insert(HttpProxyOnline record);

    int insertSelective(HttpProxyOnline record);

    List<HttpProxyOnline> selectByExample(HttpProxyOnlineExample example);

    HttpProxyOnline selectByPrimaryKey(String nodeId);

    int updateByExampleSelective(@Param("record") HttpProxyOnline record, @Param("example") HttpProxyOnlineExample example);

    int updateByExample(@Param("record") HttpProxyOnline record, @Param("example") HttpProxyOnlineExample example);

    int updateByPrimaryKeySelective(HttpProxyOnline record);

    int updateByPrimaryKey(HttpProxyOnline record);
}