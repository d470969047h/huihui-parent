package com.huihui.mapper;

import com.huihui.pojo.OrderItemPojo;
import com.huihui.pojo.OrderItemPojoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemPojoMapper {
    int countByExample(OrderItemPojoExample example);

    int deleteByExample(OrderItemPojoExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderItemPojo record);

    int insertSelective(OrderItemPojo record);

    List<OrderItemPojo> selectByExample(OrderItemPojoExample example);

    OrderItemPojo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderItemPojo record, @Param("example") OrderItemPojoExample example);

    int updateByExample(@Param("record") OrderItemPojo record, @Param("example") OrderItemPojoExample example);

    int updateByPrimaryKeySelective(OrderItemPojo record);

    int updateByPrimaryKey(OrderItemPojo record);
}