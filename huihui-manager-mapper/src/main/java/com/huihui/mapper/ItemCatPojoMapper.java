package com.huihui.mapper;

import com.huihui.pojo.ItemCatPojo;
import com.huihui.pojo.ItemCatPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemCatPojoMapper {
    int countByExample(ItemCatPojoExample example);

    int deleteByExample(ItemCatPojoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemCatPojo record);

    int insertSelective(ItemCatPojo record);

    List<ItemCatPojo> selectByExample(ItemCatPojoExample example);

    ItemCatPojo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemCatPojo record, @Param("example") ItemCatPojoExample example);

    int updateByExample(@Param("record") ItemCatPojo record, @Param("example") ItemCatPojoExample example);

    int updateByPrimaryKeySelective(ItemCatPojo record);

    int updateByPrimaryKey(ItemCatPojo record);
}