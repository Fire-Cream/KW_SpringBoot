package com.cream.kw_springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cream.kw_springboot.bean.Item;
import com.cream.kw_springboot.mapper.ItemMapper;
import com.cream.kw_springboot.service.ItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("/itemServiceImpl")
@Transactional
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {
}
