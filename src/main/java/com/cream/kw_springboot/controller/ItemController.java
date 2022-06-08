package com.cream.kw_springboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cream.kw_springboot.bean.Item;
import com.cream.kw_springboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/item")
public class ItemController {

    //注入service
    @Autowired
    private ItemService itemService;

    @RequestMapping("queryPage")
    public String queryPage(HttpServletRequest request, Model model) throws IOException {
        int cid = Integer.parseInt(request.getParameter("cid"));
        int page = Integer.parseInt(request.getParameter("page"));
        Page<Item> page1 = new Page<>(page,6);
        IPage<Item> pages = itemService.getItemsByOpr(page1,cid);
        model.addAttribute("cid", cid);
        model.addAttribute("pages",pages);
        return "category";
    }

    @RequestMapping("search")
    public String search(HttpServletRequest request,Model model) throws IOException {
        String name = request.getParameter("name");
        int page = Integer.parseInt(request.getParameter("page"));
        //PageInfo<Item> pageInfo = itemService.selectByName(name, page, 6);
        //model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("name", name);
        return "search";
    }

    @RequestMapping("showItem")
    public String showItem(HttpServletRequest request,Model model) throws IOException {
        int id = Integer.parseInt(request.getParameter("itemId"));
        Item item = itemService.showItem(id);
        model.addAttribute("item", item);
        return "item";
    }
}
