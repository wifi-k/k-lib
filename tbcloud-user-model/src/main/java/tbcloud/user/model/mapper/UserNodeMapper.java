package tbcloud.user.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.user.model.UserNode;
import tbcloud.user.model.UserNodeExample;

public interface UserNodeMapper {
    long countByExample(UserNodeExample example);

    int deleteByExample(UserNodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserNode record);

    int insertSelective(UserNode record);

    List<UserNode> selectByExample(UserNodeExample example);

    UserNode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserNode record, @Param("example") UserNodeExample example);

    int updateByExample(@Param("record") UserNode record, @Param("example") UserNodeExample example);

    int updateByPrimaryKeySelective(UserNode record);

    int updateByPrimaryKey(UserNode record);
}