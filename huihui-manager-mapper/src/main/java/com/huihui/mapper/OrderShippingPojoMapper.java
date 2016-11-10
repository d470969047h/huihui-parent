package com.huihui.mapper;

import com.huihui.pojo.OrderShippingPojo;
import com.huihui.pojo.OrderShippingPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderShippingPojoMapper {
    int countByExample(OrderShippingPojoExample example);

    int deleteByExample(OrderShippingPojoExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderShippingPojo record);

    int insertSelective(OrderShippingPojo record);

    List<OrderShippingPojo> selectByExample(OrderShippingPojoExample example);

    OrderShippingPojo selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OrderShippingPojo record, @Param("example") OrderShippingPojoExample example);

    int updateByExample(@Param("record") OrderShippingPojo record, @Param("example") OrderShippingPojoExample example);

    int updateByPrimaryKeySelective(OrderShippingPojo record);

    int updateByPrimaryKey(OrderShippingPojo record);
}