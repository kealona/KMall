package com.linglett.dao;

import com.linglett.pojo.goods;
import com.linglett.pojo.shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchMapper {

    /**
     * 搜索商品
     * @param content 搜索的商品内容
     * @return 返回的商品信息表
     */
    List<goods> searchGood(@Param("SearchContent") String content);

    /**
     * 搜索店铺
     * @param content 搜索内容
     * @return 返回店铺表
     */
    List<shop> searchShop(@Param("SearchName") String content);
}
