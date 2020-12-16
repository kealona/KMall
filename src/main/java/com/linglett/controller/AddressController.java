package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.linglett.pojo.Address;
import com.linglett.pojo.ReturnEntity;
import com.linglett.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/address")
public class AddressController {
    @Autowired
    @Qualifier
    private AddressService addressService;

    @RequestMapping(value = "/addAddress",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity addAddress(@RequestBody String json){
        Address address = JSON.parseObject(json,Address.class);
        addressService.addAddress(address);
        return ReturnEntity.successResult("添加收货地址成功");
    }

    @RequestMapping(value = "/deleteAdress",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity deleteAddress(@RequestBody String json){
        long id = Integer.parseInt(json);
        addressService.deleteAddress(id);
        return ReturnEntity.successResult("删除收货地址成功");
    }

    @RequestMapping(value = "/updateAddress",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity updateAddress(@RequestBody String json){
        Address address = JSON.parseObject(json,Address.class);
        addressService.updateAddress(address);
        return ReturnEntity.successResult("修改收货地址成功");
    }

    @RequestMapping(value = "/queryAddress",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity queryAddress(@RequestBody String json){
        addressService.queryAddress(json);
        return ReturnEntity.successResult(json);
    }
}
