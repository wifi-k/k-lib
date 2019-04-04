package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeDeviceWeek;
import tbcloud.node.model.NodeDeviceWeekExample;

public interface NodeDeviceWeekMapper {
    long countByExample(NodeDeviceWeekExample example);

    int deleteByExample(NodeDeviceWeekExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NodeDeviceWeek record);

    int insertSelective(NodeDeviceWeek record);

    List<NodeDeviceWeek> selectByExample(NodeDeviceWeekExample example);

    NodeDeviceWeek selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NodeDeviceWeek record, @Param("example") NodeDeviceWeekExample example);

    int updateByExample(@Param("record") NodeDeviceWeek record, @Param("example") NodeDeviceWeekExample example);

    int updateByPrimaryKeySelective(NodeDeviceWeek record);

    int updateByPrimaryKey(NodeDeviceWeek record);
}