package com.clinical.service.impl;
import com.clinical.dao.cluster.CartMapper;
import com.clinical.model.cluster.Cart;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.CartService;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper    cartMapper;



    @Override
    public  void saveCart(Cart cart) {
         cartMapper.saveCart(cart);

     }
}