package com.cream.kw_springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cart {
    private Map<Integer,CartItem> cartItems = new HashMap<>();
    private Double total=0.0;

    //添加购物车
    public void addCartItem(CartItem cartItem){
        //获取商品id
        Integer itemId = cartItem.getItem().getItemId();
        if (!cartItems.containsKey(itemId)){
            //如果不存在，直接添加
            cartItems.put(itemId,cartItem);

        }else {
            //如果存在，则更新商品数量
            CartItem cartItem_old = cartItems.get(itemId);
            //更新商品数量
            cartItem_old.setCount(cartItem.getCount() + cartItem_old.getCount());
        }
        //更新总计
        total = total + cartItem.getSubtotal();
    }

    public void deleteCartItem(Integer cartItemId){
        CartItem remove = cartItems.remove(cartItemId);
        total -= remove.getSubtotal();
    }

    public void clearCart(){
        cartItems.clear();
        total = 0.0;
    }

}
