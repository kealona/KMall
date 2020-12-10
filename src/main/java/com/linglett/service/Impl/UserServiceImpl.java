package com.linglett.service.Impl;

import com.linglett.dao.UserMapper;
import com.linglett.pojo.User;
import com.linglett.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        System.out.println("setUserMapper方法");
        this.userMapper = userMapper;
    }

    public User loginUser(User userdata) {
        String userId = userdata.getUserId();
        String password = userdata.getPassword();
        System.out.println("userId="+userId);
        System.out.println("password="+password);

        userdata = userMapper.LoginUser(userdata);
        System.out.println(userdata.toString());
            System.out.println("执行UserMapper完成查询登录用户");
        return userdata;
    }

    public void deleteUserById(String id) {
        System.out.println("执行serviceImpl");
        // userMapper.deleteUserById(id);
    }
}
