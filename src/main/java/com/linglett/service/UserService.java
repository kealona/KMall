package com.linglett.service;

import com.linglett.pojo.User;

public interface UserService {
    /**
     * 用户登录
     *
     * @param userdata 即将登录的用户的信息
     * @return 返回用户的全部信息
     */
    User loginUser(User userdata);

    /**
     * 用户注册
     * @param userdata 即将注册的用户信息
     * @return 返回对数据库操作的结果
     */
    boolean registerUser(User userdata);

    /**
     * 修改用户的密码
     * @param user
     * @return 返回修改的结果
     */
    boolean updateUserPassword(User user);

    /**
     * 删除用户信息
     * @param id 要删除的用户的id
     */
    void deleteUserById(String id);

    /**
     * 生成新的jwt，并放入jwtMap中
     * @param name 根据name生成新的jwt
     * @return 返回生成的token
     */
    String generateNewJwt(String name);

    /**
     * 检查jwt的有效性
     * @param jwt 待验证的token
     * @return 验证的结果
     */
    Boolean checkJwt(String jwt);

    /**
     * 让token失效
     * @param token
     */
    void inValid(String token);


}
