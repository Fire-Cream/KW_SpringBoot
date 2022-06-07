package com.cream.kw_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {

    @RequestMapping("/queryPage")
    public String queryPage(){
        return "category";
    }

    @RequestMapping("/search")
    public String search(){
        return "category";
    }

    @RequestMapping("/showItem")
    public String showItem(){
        return "category";
    }
}
