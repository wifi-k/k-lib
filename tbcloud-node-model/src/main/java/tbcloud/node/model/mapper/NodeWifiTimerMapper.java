package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeWifiTimer;
import tbcloud.node.model.NodeWifiTimerExample;

public interface NodeWifiTimerMapper {
    long countByExample(NodeWifiTimerExample example);

    int deleteByExample(NodeWifiTimerExample example);

    int deleteByPrimaryKey(String nodeId);

    int insert(NodeWifiTimer record);

    int insertSelective(NodeWifiTimer record);

    List<NodeWifiTimer> selectByExample(NodeWifiTimerExample example);

    NodeWifiTimer selectByPrimaryKey(String nodeId);

    int updateByExampleSelective(@Param("record") NodeWifiTimer record, @Param("example") NodeWifiTimerExample example);

    int updateByExample(@Param("record") NodeWifiTimer record, @Param("example") NodeWifiTimerExample example);

    int updateByPrimaryKeySelective(NodeWifiTimer record);

    int updateByPrimaryKey(NodeWifiTimer record);
}