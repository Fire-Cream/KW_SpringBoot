package com.cream.kw_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cream.kw_springboot.bean.OrderItem;

import java.util.List;

public interface OrderItemService extends IService<OrderItem> {
    List<OrderItem> getItemByOid(String orderId);
}
