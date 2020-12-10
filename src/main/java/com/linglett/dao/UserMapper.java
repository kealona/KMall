package com.linglett.dao;

import com.linglett.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
   /**
    * 实现用户登录，查询账号密码是否正确
    * @param user 要查询的用户
    * @return 返回查询结果，user的全部信息
    */
   User LoginUser(@Param("loginUser") User user);

    //int addUser(User user);

    //根据id删除一个Book
   // void deleteUserById(String userId);

    //更新Book
   // int updateUser(User user);

    //根据id查询,返回一个Book
   // User queryUserById(int userId);

    //查询全部Book,返回list集合
   // List<User> queryAllUser();

}
