package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.linglett.pojo.Cart;
import com.linglett.pojo.ReturnEntity;
import com.linglett.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("cart")
public class CartController {
    @Autowired
    @Qualifier
    private CartService cartService;

    @RequestMapping(value = "/addToCart",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity addToCart(@RequestBody String json){
        Cart cart = JSON.parseObject(json,Cart.class);
        cartService.addCartGood(cart);
        return ReturnEntity.successResult("添加到购物车成功");
    }

    @RequestMapping(value = "/deleteFromCart",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity deleteFromCart(@RequestBody String json){
        long id = Integer.parseInt(json);
        cartService.deleteFromCart(id);
        return ReturnEntity.successResult("从购物车删除成功");
    }

    @RequestMapping(value = "/queryCart",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity queryCart(@RequestBody String json){
        cartService.queryCart(json);
        return ReturnEntity.successResult("查询成功");
    }
}
