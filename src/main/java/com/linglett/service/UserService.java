package com.linglett.service;

import com.linglett.pojo.User;

public interface UserService {
    /**
     * 用户登录
     * @param userdata 即将登录的用户的信息
     * @return 返回用户的全部信息
     */
    User loginUser(User userdata);
    /**
     * 删除用户信息
     * @param id 要删除的用户的id
     */
    void deleteUserById(String id);
}
