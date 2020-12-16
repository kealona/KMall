package com.linglett.dao;

import com.linglett.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
   /**
    * 实现用户登录，查询账号密码是否正确
    * @param user 要查询的用户
    * @return 返回查询结果，user的全部信息
    */
   User LoginUser(@Param("loginUser") User user);

   /**
    * 用户注册，向数据库添加一条用户数据
    */
   void SignUpUser(@Param("register") User user);

    /**
     * 根据用户Id删除用户的所有信息
     * @param userId 要删除的用户的Id
     */
    void deleteUserById(String userId);

   /**
    * 更新用户信息
    * @param user 需要修改的用户信息
    */
    void updateUserInfo(@Param("Userdata") User user);

   /**
    * 修改用户密码
    * @param user 需要修改的用户
    */
    void updatePassword(@Param("newPassword")User user);

    //根据id查询,返回一个Book
   // User queryUserById(int userId);

    //查询全部Book,返回list集合
   // List<User> queryAllUser();

}
