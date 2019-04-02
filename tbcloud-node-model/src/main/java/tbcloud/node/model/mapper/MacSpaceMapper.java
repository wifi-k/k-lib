package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.MacSpace;
import tbcloud.node.model.MacSpaceExample;

public interface MacSpaceMapper {
    long countByExample(MacSpaceExample example);

    int deleteByExample(MacSpaceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MacSpace record);

    int insertSelective(MacSpace record);

    List<MacSpace> selectByExample(MacSpaceExample example);

    MacSpace selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MacSpace record, @Param("example") MacSpaceExample example);

    int updateByExample(@Param("record") MacSpace record, @Param("example") MacSpaceExample example);

    int updateByPrimaryKeySelective(MacSpace record);

    int updateByPrimaryKey(MacSpace record);
}