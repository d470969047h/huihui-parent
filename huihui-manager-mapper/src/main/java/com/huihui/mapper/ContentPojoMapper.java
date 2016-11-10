package com.huihui.mapper;

import com.huihui.pojo.ContentPojo;
import com.huihui.pojo.ContentPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentPojoMapper {
    int countByExample(ContentPojoExample example);

    int deleteByExample(ContentPojoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContentPojo record);

    int insertSelective(ContentPojo record);

    List<ContentPojo> selectByExampleWithBLOBs(ContentPojoExample example);

    List<ContentPojo> selectByExample(ContentPojoExample example);

    ContentPojo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContentPojo record, @Param("example") ContentPojoExample example);

    int updateByExampleWithBLOBs(@Param("record") ContentPojo record, @Param("example") ContentPojoExample example);

    int updateByExample(@Param("record") ContentPojo record, @Param("example") ContentPojoExample example);

    int updateByPrimaryKeySelective(ContentPojo record);

    int updateByPrimaryKeyWithBLOBs(ContentPojo record);

    int updateByPrimaryKey(ContentPojo record);
}