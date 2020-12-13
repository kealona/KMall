package com.linglett.service.Impl;

import com.linglett.JWT.JWTUtils;
import com.linglett.dao.UserMapper;
import com.linglett.pojo.User;
import com.linglett.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    private String TOKEN = "token!noifhsfowiegi";

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        System.out.println("setUserMapper方法");
        this.userMapper = userMapper;
    }

    @Override
    public User loginUser(User userdata) {
        String userId = userdata.getUserId();
        String password = userdata.getPassword();
        System.out.println("userId="+userId);
        System.out.println("password="+password);

        userdata = userMapper.LoginUser(userdata);
        System.out.println(userdata.toString());
        System.out.println("执行UserMapper完成查询登录用户");
        userdata.setToken(this.generateNewJwt(userId));
        return userdata;
    }

    @Override
    public boolean registerUser(User userdata) {
        System.out.println("调用registerUserService层");
        userMapper.SignUpUser(userdata);
        System.out.println("调用RegisterMapper成功");
        return true;
    }

    @Override
    public boolean updateUserPassword(User user) {
        System.out.println("调用更新密码的service层");
        System.out.println("新密码 "+user.getPassword());
        System.out.println("修改的用户id "+user.getUserId());
        userMapper.updatePassword(user);
        System.out.println("调用更新密码的mapper层成功");
        return true;
    }

    public void deleteUserById(String id) {
        System.out.println("执行serviceImpl");
        // userMapper.deleteUserById(id);
    }

    @Override
    public String generateNewJwt(String name) {
        String secret = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println("密钥="+secret);
        String token = JWTUtils.getToken(name, secret);
        System.out.println("token=" + token);
        return token;
    }

    @Override
    public Boolean checkJwt(String jwt) {
        try {
            String secret = UUID.randomUUID().toString().replaceAll("-", "");
            JWTUtils.DeToken(jwt, secret);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void inValid(String token) {
        System.out.println("使用Redis将token失效");
    }

}
