package com.linglett.service;

import com.linglett.dao.UserMapper;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        System.out.println("setUserMapper方法");
        this.userMapper = userMapper;
    }

    public void deleteUserById(String id) {
        System.out.println("执行serviceImpl");
         userMapper.deleteUserById(id);
    }
}
