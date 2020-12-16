package com.linglett.dao;

import com.linglett.pojo.shop;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {

    /**
     * 添加一个商家店铺
     * @param shop 需要添加的店铺信息
     */
    void addShop(@Param("addShop") shop shop);

    /**
     * 删除店铺
     * @param id 需要删除的店铺id
     */
    void deleteShop(@Param("deleteShop") long id);

    /**
     * 修改店铺信息
     * @param shop 需要修改的店铺信息
     */
    void updateShop(@Param("updateShop") shop shop);
}
