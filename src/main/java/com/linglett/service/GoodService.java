package com.linglett.service;

import com.linglett.pojo.goods;

import java.util.List;

public interface GoodService {

    /**
     * 添加商品
     * @param good 要添加的商品信息
     */
    void addGood(goods good);

    /**
     * 删除商品
     * @param id 需要删除的商品的id
     */
    void deleteGood(long id);

    /**
     * 修改商品信息
     * @param good 需要修改的商品的全部信息
     */
    void updateGood(goods good);

    /**
     * 查询某个商家的全部商品
     * @param id 该商家的id
     * @return 返回查询结果
     */
    List<goods> queryGood(long id);
}
