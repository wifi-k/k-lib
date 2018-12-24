package tbcloud.user.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.user.model.OpenOnline;
import tbcloud.user.model.OpenOnlineExample;

public interface OpenOnlineMapper {
    long countByExample(OpenOnlineExample example);

    int deleteByExample(OpenOnlineExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(OpenOnline record);

    int insertSelective(OpenOnline record);

    List<OpenOnline> selectByExample(OpenOnlineExample example);

    OpenOnline selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") OpenOnline record, @Param("example") OpenOnlineExample example);

    int updateByExample(@Param("record") OpenOnline record, @Param("example") OpenOnlineExample example);

    int updateByPrimaryKeySelective(OpenOnline record);

    int updateByPrimaryKey(OpenOnline record);
}