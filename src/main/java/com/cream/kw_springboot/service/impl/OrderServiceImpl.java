package com.cream.kw_springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cream.kw_springboot.bean.Order;
import com.cream.kw_springboot.mapper.OrderMapper;
import com.cream.kw_springboot.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("/orderServiceImpl")
@Transactional
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Override
    public void submitOrder(Order order) {
        baseMapper.insert(order);
    }

    @Override
    public Order selectByOid(String out_trade_no) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("out_trade_no",out_trade_no);
        return baseMapper.selectOne(queryWrapper);
    }

    @Override
    public void changeState(Order order) {

    }

    @Override
    public List<Order> showOrders(int uid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid",uid);
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public void addOrderMsg(Order order) {

    }
}
