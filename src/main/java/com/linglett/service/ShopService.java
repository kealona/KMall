package com.linglett.service;

import com.linglett.pojo.shop;

public interface ShopService {

    /**
     * 添加商铺
     * @param shop 商铺infp
     */
    void addShop(shop shop);

    /**
     * 删除店铺
     * @param id 商铺id
     */
    void deleteShop(long id);

    /**
     * 修改店铺信息
     * @param shop 修改的信息
     */
    void updateShop(shop shop);
}
