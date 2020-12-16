package com.linglett.dao;

import com.linglett.pojo.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

    /**
     * 添加订单
     * @param order 订单info
     */
    void addOrder(@Param("addOrder") Order order);

    /**
     * 删除订单
     * @param id 要删除的id
     */
    void deleteOrder(@Param("deleteOrderId") long id);

    /**
     * 修改订单
     * @param order 修改的订单信息
     */
    void updateOrder(@Param("updateOrder") Order order);

    /**
     * 查询订单
     * @param id 查询的订单id
     * @return 返回查询结果
     */
    Order queryOrder(@Param("queryOrderId") long id);
}
