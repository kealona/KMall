package com.linglett.service.Impl;

import com.linglett.dao.GoodMapper;
import com.linglett.pojo.goods;
import com.linglett.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodServiceImpl implements GoodService {

    private GoodMapper goodMapper;

    @Autowired
    public void setGoodMapper(GoodMapper goodMapper) {
        this.goodMapper = goodMapper;
    }

    @Override
    public void addGood(goods good) {
        goodMapper.addGood(good);
    }

    @Override
    public void deleteGood(long id) {
        goodMapper.deleteGood(id);
    }

    @Override
    public void updateGood(goods good) {
        goodMapper.updateGood(good);
    }

    @Override
    public List<goods> queryGood(long id) {
        List<goods> goodsList = goodMapper.queryGood(id);
        return goodsList;
    }
}
