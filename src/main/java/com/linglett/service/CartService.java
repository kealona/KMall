package com.linglett.service;

import com.linglett.pojo.Cart;
import com.linglett.pojo.goods;

import java.util.List;

public interface CartService {

    /**
     * 向购物车添加商品
     * @param cart 购物车info
     */
    void addCartGood(Cart cart);

    /**
     * 从购物车删除商品
     * @param id 商品id
     */
    void deleteFromCart(long id);

    /**
     * 搜索某个人的购物车
     * @param id 需要查询的UserId
     * @return 返回查询结果
     */
    List<goods> queryCart(String id);

}
