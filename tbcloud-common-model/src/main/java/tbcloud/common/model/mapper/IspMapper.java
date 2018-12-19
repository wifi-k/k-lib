package tbcloud.common.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.common.model.Isp;
import tbcloud.common.model.IspExample;

public interface IspMapper {
    long countByExample(IspExample example);

    int deleteByExample(IspExample example);

    int deleteByPrimaryKey(String ispId);

    int insert(Isp record);

    int insertSelective(Isp record);

    List<Isp> selectByExample(IspExample example);

    Isp selectByPrimaryKey(String ispId);

    int updateByExampleSelective(@Param("record") Isp record, @Param("example") IspExample example);

    int updateByExample(@Param("record") Isp record, @Param("example") IspExample example);

    int updateByPrimaryKeySelective(Isp record);

    int updateByPrimaryKey(Isp record);
}