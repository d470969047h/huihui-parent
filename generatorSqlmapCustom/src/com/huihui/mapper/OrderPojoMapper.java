package com.huihui.mapper;

import com.huihui.pojo.OrderPojo;
import com.huihui.pojo.OrderPojoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPojoMapper {
    int countByExample(OrderPojoExample example);

    int deleteByExample(OrderPojoExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderPojo record);

    int insertSelective(OrderPojo record);

    List<OrderPojo> selectByExample(OrderPojoExample example);

    OrderPojo selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OrderPojo record, @Param("example") OrderPojoExample example);

    int updateByExample(@Param("record") OrderPojo record, @Param("example") OrderPojoExample example);

    int updateByPrimaryKeySelective(OrderPojo record);

    int updateByPrimaryKey(OrderPojo record);
}