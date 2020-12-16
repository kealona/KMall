package com.linglett.service.Impl;


import com.linglett.dao.SearchMapper;
import com.linglett.pojo.goods;
import com.linglett.pojo.shop;
import com.linglett.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SearchServiceImpl implements SearchService {

    private SearchMapper searchMapper;

    @Autowired
    public void setSearchMapper(SearchMapper searchMapper) {
        this.searchMapper = searchMapper;
    }

    @Override
    public List<goods> searchGood(String content) {
        System.out.println("搜索商品Service层");
        List<goods> mapList = searchMapper.searchGood(content);
        System.out.println("搜索结果：");
        for (goods goods : mapList) {
            System.out.println(goods.toString());
        }
        System.out.println("搜索成功...");
        return mapList;
    }

    @Override
    public List<shop> searchShop(String content) {
        List<shop> shopList = searchMapper.searchShop(content);
        System.out.println("搜索商铺");
        return shopList;
    }
}
