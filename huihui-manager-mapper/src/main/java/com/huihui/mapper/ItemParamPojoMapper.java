package com.huihui.mapper;

import com.huihui.pojo.ItemParamPojo;
import com.huihui.pojo.ItemParamPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemParamPojoMapper {
    int countByExample(ItemParamPojoExample example);

    int deleteByExample(ItemParamPojoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemParamPojo record);

    int insertSelective(ItemParamPojo record);

    List<ItemParamPojo> selectByExampleWithBLOBs(ItemParamPojoExample example);

    List<ItemParamPojo> selectByExample(ItemParamPojoExample example);

    ItemParamPojo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemParamPojo record, @Param("example") ItemParamPojoExample example);

    int updateByExampleWithBLOBs(@Param("record") ItemParamPojo record, @Param("example") ItemParamPojoExample example);

    int updateByExample(@Param("record") ItemParamPojo record, @Param("example") ItemParamPojoExample example);

    int updateByPrimaryKeySelective(ItemParamPojo record);

    int updateByPrimaryKeyWithBLOBs(ItemParamPojo record);

    int updateByPrimaryKey(ItemParamPojo record);
}