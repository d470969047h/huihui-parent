package com.huihui.mapper;

import com.huihui.pojo.ItemPojo;
import com.huihui.pojo.ItemPojoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemPojoMapper {
    int countByExample(ItemPojoExample example);

    int deleteByExample(ItemPojoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemPojo record);

    int insertSelective(ItemPojo record);

    List<ItemPojo> selectByExample(ItemPojoExample example);

    ItemPojo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemPojo record, @Param("example") ItemPojoExample example);

    int updateByExample(@Param("record") ItemPojo record, @Param("example") ItemPojoExample example);

    int updateByPrimaryKeySelective(ItemPojo record);

    int updateByPrimaryKey(ItemPojo record);
}