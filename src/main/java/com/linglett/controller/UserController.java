package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.linglett.pojo.User;
import com.linglett.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("del/{userId}")
    public void deleteUserById(@PathVariable("userId")String userId) {
     System.out.println("执行controller层");
        userService.deleteUserById(userId);
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public String login(@RequestBody String userJson) {
        //从前端获取userdata
        User user = JSON.parseObject(userJson,User.class);

        System.out.println(user.toString());
        System.out.println("实现登录");

        user = userService.loginUser(user);
        System.out.println("登录成功");

        //把获取的User信息以JSON字符串形式发送给前端
        String userData = JSONObject.toJSONString(user);
        System.out.println(userData);

        return userData;
    }


}
