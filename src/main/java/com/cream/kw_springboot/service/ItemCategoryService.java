package com.cream.kw_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cream.kw_springboot.bean.ItemCategory;

import java.util.List;

public interface ItemCategoryService extends IService<ItemCategory> {
    List<ItemCategory> getMenu();
}
