package com.cream.kw_springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cream.kw_springboot.bean.ItemCategory;
import com.cream.kw_springboot.mapper.ItemCategoryMapper;
import com.cream.kw_springboot.service.ItemCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemCategoryServiceImpl")
@Transactional
public class ItemCategoryServiceImpl extends ServiceImpl<ItemCategoryMapper, ItemCategory> implements ItemCategoryService {
}
