package com.huihui.mapper;

import com.huihui.pojo.ItemParamItemPojo;
import com.huihui.pojo.ItemParamItemPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemParamItemPojoMapper {
    int countByExample(ItemParamItemPojoExample example);

    int deleteByExample(ItemParamItemPojoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemParamItemPojo record);

    int insertSelective(ItemParamItemPojo record);

    List<ItemParamItemPojo> selectByExampleWithBLOBs(ItemParamItemPojoExample example);

    List<ItemParamItemPojo> selectByExample(ItemParamItemPojoExample example);

    ItemParamItemPojo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemParamItemPojo record, @Param("example") ItemParamItemPojoExample example);

    int updateByExampleWithBLOBs(@Param("record") ItemParamItemPojo record, @Param("example") ItemParamItemPojoExample example);

    int updateByExample(@Param("record") ItemParamItemPojo record, @Param("example") ItemParamItemPojoExample example);

    int updateByPrimaryKeySelective(ItemParamItemPojo record);

    int updateByPrimaryKeyWithBLOBs(ItemParamItemPojo record);

    int updateByPrimaryKey(ItemParamItemPojo record);
}