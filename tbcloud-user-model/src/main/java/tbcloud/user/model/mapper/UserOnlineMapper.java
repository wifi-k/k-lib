package tbcloud.user.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.user.model.UserOnline;
import tbcloud.user.model.UserOnlineExample;

public interface UserOnlineMapper {
    long countByExample(UserOnlineExample example);

    int deleteByExample(UserOnlineExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserOnline record);

    int insertSelective(UserOnline record);

    List<UserOnline> selectByExample(UserOnlineExample example);

    UserOnline selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserOnline record, @Param("example") UserOnlineExample example);

    int updateByExample(@Param("record") UserOnline record, @Param("example") UserOnlineExample example);

    int updateByPrimaryKeySelective(UserOnline record);

    int updateByPrimaryKey(UserOnline record);
}