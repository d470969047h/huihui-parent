package com.huihui.mapper;

import com.huihui.pojo.ItemDesePojo;
import com.huihui.pojo.ItemDesePojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDesePojoMapper {
    int countByExample(ItemDesePojoExample example);

    int deleteByExample(ItemDesePojoExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(ItemDesePojo record);

    int insertSelective(ItemDesePojo record);

    List<ItemDesePojo> selectByExampleWithBLOBs(ItemDesePojoExample example);

    List<ItemDesePojo> selectByExample(ItemDesePojoExample example);

    ItemDesePojo selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") ItemDesePojo record, @Param("example") ItemDesePojoExample example);

    int updateByExampleWithBLOBs(@Param("record") ItemDesePojo record, @Param("example") ItemDesePojoExample example);

    int updateByExample(@Param("record") ItemDesePojo record, @Param("example") ItemDesePojoExample example);

    int updateByPrimaryKeySelective(ItemDesePojo record);

    int updateByPrimaryKeyWithBLOBs(ItemDesePojo record);

    int updateByPrimaryKey(ItemDesePojo record);
}