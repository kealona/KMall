package com.linglett.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.linglett.pojo.ReturnEntity;
import com.linglett.pojo.User;
import com.linglett.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

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
    public ReturnEntity login(@RequestBody String userJson) {

        System.out.println("userJson "+userJson);
        //从前端获取userdata
        User user = JSON.parseObject(userJson,User.class);

        System.out.println(user.toString());
        System.out.println("实现登录");

        User user1 = userService.loginUser(user);
        System.out.println("登录成功");

        //把获取的User信息以JSON字符串形式发送给前端
        String userData = JSONObject.toJSONString(user1);
        System.out.println(userData);

        return ReturnEntity.successResult(userData);
    }

    @GetMapping("/checkJwt")
    public ReturnEntity checkJwt(String token) {

        return ReturnEntity.successResult(userService.checkJwt(token));
    }

    @RequestMapping(value = "/SignUp",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity SignUp(@RequestBody String SignUpUser){
        System.out.println("调用注册controller方法");
        User user = JSON.parseObject(SignUpUser,User.class);
        if(userService.registerUser(user)){
            System.out.println("调用service层成功");
            return ReturnEntity.successResult(user);
        }
        else{
            return ReturnEntity.failedResult("注册失败！后端出错");
        }
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ReturnEntity updateUserPassword(@RequestBody String update){
        User user = JSON.parseObject(update,User.class);
        if(userService.updateUserPassword(user)){
            System.out.println("修改密码成功");
            return ReturnEntity.successResult(user);
        }
        else {
            return ReturnEntity.failedResult("修改密码失败");
        }
    }


}
