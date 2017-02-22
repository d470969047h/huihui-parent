package com.huihui.mapper;

import com.huihui.pojo.UserPojo;
import com.huihui.pojo.UserPojoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPojoMapper {
    int countByExample(UserPojoExample example);

    int deleteByExample(UserPojoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPojo record);

    int insertSelective(UserPojo record);

    List<UserPojo> selectByExample(UserPojoExample example);

    UserPojo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserPojo record, @Param("example") UserPojoExample example);

    int updateByExample(@Param("record") UserPojo record, @Param("example") UserPojoExample example);

    int updateByPrimaryKeySelective(UserPojo record);

    int updateByPrimaryKey(UserPojo record);
}