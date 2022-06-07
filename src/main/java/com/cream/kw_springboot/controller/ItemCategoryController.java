package com.cream.kw_springboot.controller;

import com.cream.kw_springboot.bean.ItemCategory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class ItemCategoryController {

    @RequestMapping("/list")
    public List<ItemCategory> list(){
        List<ItemCategory> list = new ArrayList<>() ;
        return list;
    }
}
