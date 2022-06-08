package com.cream.kw_springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cream.kw_springboot.bean.OrderItem;
import com.cream.kw_springboot.mapper.OrderItemMapper;
import com.cream.kw_springboot.service.OrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("orderItemServiceImpl")
@Transactional
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {
    @Override
    public List<OrderItem> getItemByOid(String orderId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("oid",orderId);
        return baseMapper.selectList(queryWrapper);
    }
}
