package com.cream.kw_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cream.kw_springboot.bean.Order;

import java.util.List;

public interface OrderService extends IService<Order> {
    void submitOrder(Order order);

    Order selectByOid(String out_trade_no);

    void changeState(Order order);

    List<Order> showOrders(int uid);

    void addOrderMsg(Order order);
}
