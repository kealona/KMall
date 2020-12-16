package com.linglett.service.Impl;

import com.linglett.dao.ShopMapper;
import com.linglett.pojo.shop;
import com.linglett.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopServiceImpl implements ShopService {

    private ShopMapper shopMapper;

    @Autowired
    public void setShopMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Override
    public void addShop(shop shop) {
        shopMapper.addShop(shop);
    }

    @Override
    public void deleteShop(long id) {
        shopMapper.deleteShop(id);
    }

    @Override
    public void updateShop(shop shop) {
        shopMapper.updateShop(shop);
    }
}
