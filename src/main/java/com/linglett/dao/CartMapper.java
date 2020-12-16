package com.linglett.dao;

import com.linglett.pojo.Cart;
import com.linglett.pojo.goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {

    /**
     * 将商品加入购物车
     * @param cart 要添加的购物车信息
     */
    void addToCart(@Param("addCartGood") Cart cart);

    /**
     * 将商品从购物车中清除
     * @param id 要删除的购物车信息
     */
    void deleteFromCart(@Param("deleteCartGood") long id);

    /**
     * 查询某人的购物车
     * @param userId 用户的Id
     * @return 返回查询的结果
     */
    List<goods> queryCart(@Param("queryUserId") String userId);
}
