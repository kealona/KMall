package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.linglett.pojo.ReturnEntity;
import com.linglett.pojo.shop;
import com.linglett.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    @Qualifier
    private ShopService shopService;

    @RequestMapping(value = "/addShop",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity addShop(@RequestBody String json){
        shop shopInfo = JSON.parseObject(json, shop.class);
        shopService.addShop(shopInfo);
        return ReturnEntity.successResult("添加成功");
    }

    @RequestMapping(value = "/deleteShop",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity deleteShop(@RequestBody String json){
        long id = Integer.parseInt(json);
        shopService.deleteShop(id);
        return ReturnEntity.successResult("删除成功");
    }

    @RequestMapping(value = "/updateShop",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity updateShop(@RequestBody String json){
        shop shopInfo = JSON.parseObject(json, shop.class);
        shopService.updateShop(shopInfo);
        return ReturnEntity.successResult("修改成功");
    }

}
