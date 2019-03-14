package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeWifi;
import tbcloud.node.model.NodeWifiExample;

public interface NodeWifiMapper {
    long countByExample(NodeWifiExample example);

    int deleteByExample(NodeWifiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NodeWifi record);

    int insertSelective(NodeWifi record);

    List<NodeWifi> selectByExample(NodeWifiExample example);

    NodeWifi selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NodeWifi record, @Param("example") NodeWifiExample example);

    int updateByExample(@Param("record") NodeWifi record, @Param("example") NodeWifiExample example);

    int updateByPrimaryKeySelective(NodeWifi record);

    int updateByPrimaryKey(NodeWifi record);
}