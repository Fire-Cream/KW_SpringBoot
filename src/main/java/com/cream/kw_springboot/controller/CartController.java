package com.cream.kw_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {

    @RequestMapping("/cart")
    public String cart(){
        return "cart";
    }

    @RequestMapping("/add")
    public String add(){
        return "cart";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "cart";
    }

    @RequestMapping("/clear")
    public String clear(){
        return "cart";
    }
}
