package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.linglett.pojo.ReturnEntity;
import com.linglett.pojo.goods;
import com.linglett.pojo.shop;
import com.linglett.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {
    @Autowired
    @Qualifier("SearchServiceImpl")
    private SearchService searchService;

    @RequestMapping(value = "/searchGoods",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity searchGoods(@RequestBody String content){
        System.out.println("接受到的搜索内容: "+content);
        List<goods> goodsList = searchService.searchGood(content);
        String jsonArray = JSON.toJSONString(goodsList);
        return ReturnEntity.successResult(jsonArray);
    }

    @RequestMapping(value = "/searchShop",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity searchShop(@RequestBody String content){
        System.out.println("接受到的搜索内容: "+content);
        List<shop> shopList = searchService.searchShop(content);
        String jsonArray = JSON.toJSONString(shopList);
        System.out.println(jsonArray);
        return ReturnEntity.successResult(jsonArray);
    }
}
