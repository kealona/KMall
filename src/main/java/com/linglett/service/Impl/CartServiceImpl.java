package com.linglett.service.Impl;

import com.linglett.dao.CartMapper;
import com.linglett.pojo.Cart;
import com.linglett.pojo.goods;
import com.linglett.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartServiceImpl implements CartService {

    private CartMapper cartMapper;

    @Autowired
    public void setCartMapper(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    @Override
    public void addCartGood(Cart cart) {
        cartMapper.addToCart(cart);
    }

    @Override
    public void deleteFromCart(long id) {
        cartMapper.deleteFromCart(id);
    }

    @Override
    public List<goods> queryCart(String id) {
        List<goods> goodsList = cartMapper.queryCart(id);
        return goodsList;
    }
}
