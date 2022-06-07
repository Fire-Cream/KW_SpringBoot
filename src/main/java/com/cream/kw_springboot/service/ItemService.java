package com.cream.kw_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cream.kw_springboot.bean.Item;

import java.util.List;

public interface ItemService extends IService<Item> {
    List<Item> selectItemsByFlag(int i);
}
