package com.linglett.service.Impl;

import com.linglett.dao.OrderMapper;
import com.linglett.pojo.Order;
import com.linglett.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

    private OrderMapper orderMapper;

    @Autowired
    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public void addOrder(Order order) {
        orderMapper.addOrder(order);
    }

    @Override
    public void deleteOrder(long id) {
        orderMapper.deleteOrder(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderMapper.updateOrder(order);
    }

    @Override
    public Order queryOrder(long id) {
        return orderMapper.queryOrder(id);
    }
}
