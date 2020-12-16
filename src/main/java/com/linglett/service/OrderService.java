package com.linglett.service;

import com.linglett.pojo.Order;

public interface OrderService {

    /**
     * 添加订单
     * @param order 订单info
     */
    void addOrder(Order order);

    /**
     * 删除订单
     * @param id 要删除的订单id
     */
    void deleteOrder(long id);

    /**
     * 修改订单
     * @param order 修改的订单信息
     */
    void updateOrder(Order order);

    /**
     * 根据id查询订单
     * @param id 要查询的订单id
     * @return 返回查询结果
     */
    Order queryOrder(long id);
}
