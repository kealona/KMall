package com.linglett.service;

import com.linglett.pojo.goods;
import com.linglett.pojo.shop;

import java.util.List;

public interface SearchService {

    /**
     * 搜索商品
     * @param content 搜索内容
     * @return 返沪搜索结果（商品List)
     */
    List<goods> searchGood(String content);

    /**
     * 搜索店铺
     * @param content 搜索内容
     * @return 返回搜索到的店铺
     */
    List<shop> searchShop(String content);
}
