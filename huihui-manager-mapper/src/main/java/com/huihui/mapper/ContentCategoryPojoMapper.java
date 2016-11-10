package com.huihui.mapper;

import com.huihui.pojo.ContentCategoryPojo;
import com.huihui.pojo.ContentCategoryPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentCategoryPojoMapper {
    int countByExample(ContentCategoryPojoExample example);

    int deleteByExample(ContentCategoryPojoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContentCategoryPojo record);

    int insertSelective(ContentCategoryPojo record);

    List<ContentCategoryPojo> selectByExample(ContentCategoryPojoExample example);

    ContentCategoryPojo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContentCategoryPojo record, @Param("example") ContentCategoryPojoExample example);

    int updateByExample(@Param("record") ContentCategoryPojo record, @Param("example") ContentCategoryPojoExample example);

    int updateByPrimaryKeySelective(ContentCategoryPojo record);

    int updateByPrimaryKey(ContentCategoryPojo record);
}