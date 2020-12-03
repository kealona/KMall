package com.linglett.controller;

import com.linglett.pojo.User;
import com.linglett.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
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
public User login(@RequestBody Map<String,String> data, HttpSession session) {
    System.out.println("实现这个方法");
    User foundUser = new User();
    return null;
}


}
