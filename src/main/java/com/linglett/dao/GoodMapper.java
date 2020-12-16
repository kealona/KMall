package com.linglett.dao;

import com.linglett.pojo.goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodMapper {

    /**
     * 增加商品
     * @param good 需要添加的商品
     */
    void addGood(@Param("addGood") goods good);

    /**
     * 删除商品
     * @param goodId 需要删除的商品id
     */
    void deleteGood(@Param("deleteGood") long goodId);

    /**
     * 查询一个店铺的所有商品
     * @param shopId 需要查询的店铺id
     * @return 返回查询结果
     */
    List<goods> queryGood(@Param("shopId") long shopId);

    /**
     * 修改商品的信息
     * @param good 需要修改的商品信息
     */
    void updateGood(@Param("updateGood") goods good);
}
