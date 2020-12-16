package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.linglett.pojo.ReturnEntity;
import com.linglett.pojo.goods;
import com.linglett.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/good")
public class GoodController {
    @Autowired
    @Qualifier
    private GoodService goodService;

    @RequestMapping(value = "/addGood",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity addGood(@RequestBody String json){
        goods good = JSON.parseObject(json,goods.class);
        goodService.addGood(good);
        return ReturnEntity.successResult("添加成功");
    }

    @RequestMapping(value = "/deleteGood",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity deleteGood(@RequestBody String json){
        long id = Integer.parseInt(json);
        goodService.deleteGood(id);
        return ReturnEntity.successResult("删除成功");
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity updateGood(@RequestBody String json){
        goods good = JSON.parseObject(json,goods.class);
        goodService.updateGood(good);
        return ReturnEntity.successResult("修改成功");
    }

    @RequestMapping(value = "/queryGood",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity queryGood(@RequestBody String json){
        long id = Integer.parseInt(json);
        return ReturnEntity.successResult("查询成功");
    }

}
