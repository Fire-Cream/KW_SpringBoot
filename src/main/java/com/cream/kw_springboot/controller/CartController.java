package com.cream.kw_springboot.controller;

import com.cream.kw_springboot.bean.Cart;
import com.cream.kw_springboot.bean.CartItem;
import com.cream.kw_springboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/cart")
    public String cart(HttpServletRequest request) throws IOException {
        //创建购物车
        if (request.getSession().getAttribute("cart") != null) {
            Cart cart = (Cart) request.getSession().getAttribute("cart");
            request.getSession().setAttribute("cart", cart);
        }
        return "cart";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request) throws IOException {
        //获取购买商品的id和信息
        int id = Integer.parseInt(request.getParameter("id"));
        int num = Integer.parseInt(request.getParameter("quantity"));
        //创建购物车
        Cart cart = new Cart();
        if (request.getSession().getAttribute("cart") != null) {
            cart = (Cart) request.getSession().getAttribute("cart");
        }
        //创建商品对象  设置商品信息和商品数量
        CartItem cartItem = new CartItem();
        cartItem.setItem(itemService.showItem(id));
        cartItem.setCount(num);
        //将商品存到购物车
        cart.addCartItem(cartItem);
        request.getSession().setAttribute("cart", cart);
        return "cart";
    }

    @RequestMapping("/delete")
    public String delete(HttpServletRequest request) throws IOException {
        //获取购买商品的id
        int id = Integer.parseInt(request.getParameter("id"));
        //获取购物车
        Cart cart = (Cart) request.getSession().getAttribute("cart");
        cart.deleteCartItem(id);
        if (cart.getCartItems().isEmpty()) {
            request.getSession().removeAttribute("cart");
        }
        return "cart";
    }

    @RequestMapping("/clear")
    public String clear(HttpServletRequest request) throws IOException {
        //创建购物车
        Cart cart = new Cart();
        if (request.getSession().getAttribute("cart") != null) {
            cart = (Cart) request.getSession().getAttribute("cart");
        }
        cart.clearCart();
        request.getSession().removeAttribute("cart");
        return "cart";
    }
}
