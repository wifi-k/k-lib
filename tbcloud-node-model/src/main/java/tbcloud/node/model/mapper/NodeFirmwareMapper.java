package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeFirmware;
import tbcloud.node.model.NodeFirmwareExample;

public interface NodeFirmwareMapper {
    long countByExample(NodeFirmwareExample example);

    int deleteByExample(NodeFirmwareExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NodeFirmware record);

    int insertSelective(NodeFirmware record);

    List<NodeFirmware> selectByExample(NodeFirmwareExample example);

    NodeFirmware selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NodeFirmware record, @Param("example") NodeFirmwareExample example);

    int updateByExample(@Param("record") NodeFirmware record, @Param("example") NodeFirmwareExample example);

    int updateByPrimaryKeySelective(NodeFirmware record);

    int updateByPrimaryKey(NodeFirmware record);
}