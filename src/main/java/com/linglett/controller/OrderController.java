package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.linglett.pojo.Order;
import com.linglett.pojo.ReturnEntity;
import com.linglett.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    @Qualifier
    private OrderService orderService;

    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity addOrder(@RequestBody String json){
        Order order = JSON.parseObject(json,Order.class);
        orderService.addOrder(order);
        return ReturnEntity.successResult("添加订单成功");
    }

    @RequestMapping(value = "/deleteOrder",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity deleteOrder(@RequestBody String json){
        long id = Integer.parseInt(json);
        orderService.deleteOrder(id);
        return ReturnEntity.successResult("删除订单成功");
    }

    @RequestMapping(value = "/updateOrder",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity updateOrder(@RequestBody String json){
        Order order = JSON.parseObject(json,Order.class);
        orderService.updateOrder(order);
        return ReturnEntity.successResult("修改订单信息成功");
    }

    @RequestMapping(value = "/queryOrder",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity queryOrder(@RequestBody String json){
        long id = Integer.parseInt(json);
        Order order = orderService.queryOrder(id);
        return ReturnEntity.successResult(order);
    }
}
