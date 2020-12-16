package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.linglett.pojo.Footprint;
import com.linglett.pojo.ReturnEntity;
import com.linglett.service.FootprintService;
import com.sun.corba.se.impl.logging.POASystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("footprint")
public class FootprintController {

    @Autowired
    @Qualifier
    private FootprintService footprintService;

    @RequestMapping(value = "/addFootprint",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity addFootprint(@RequestBody String json){
        Footprint footprint = JSON.parseObject(json,Footprint.class);
        footprintService.addFootprint(footprint);
        return ReturnEntity.successResult(json);
    }

    @RequestMapping(value = "/deleteFootprint",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity deleteFootprint(@RequestBody String json){
        Footprint footprint = JSON.parseObject(json,Footprint.class);
        footprintService.deleteFootprint(footprint);
        return ReturnEntity.successResult(json);
    }
    @RequestMapping(value = "/queryFootprint",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity queryFootprint(@RequestBody String json){
        footprintService.queryFootprint(json);
        return ReturnEntity.successResult(json);
    }
}
