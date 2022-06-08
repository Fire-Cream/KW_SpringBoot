package com.cream.kw_springboot.controller;

import com.cream.kw_springboot.bean.ItemCategory;
import com.cream.kw_springboot.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class ItemCategoryController {

    @Autowired
    private ItemCategoryService itemCategoryService;

    @RequestMapping("/list")
    public List<ItemCategory> list(HttpServletRequest request) {
        List<ItemCategory> list = itemCategoryService.getMenu();
        request.getSession().setAttribute("menu",list);
        return list;
    }
}
