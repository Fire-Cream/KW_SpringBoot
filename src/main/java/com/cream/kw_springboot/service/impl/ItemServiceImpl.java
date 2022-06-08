package com.cream.kw_springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cream.kw_springboot.bean.Item;
import com.cream.kw_springboot.mapper.ItemMapper;
import com.cream.kw_springboot.service.ItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("/itemServiceImpl")
@Transactional
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {
    @Override
    public List<Item> selectItemsByFlag(int i) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("iflag", i);
        queryWrapper.eq("status", 1);
        queryWrapper.orderByDesc("created");
        queryWrapper.last("limit 6");
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public Item showItem(int id) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        return baseMapper.selectOne(queryWrapper);
    }
}
