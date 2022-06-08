package com.cream.kw_springboot;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.cream.kw_springboot.bean.Item;
import com.cream.kw_springboot.bean.Order;
import com.cream.kw_springboot.bean.OrderItem;
import com.cream.kw_springboot.service.ItemService;
import com.cream.kw_springboot.service.OrderItemService;
import com.cream.kw_springboot.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KwSpringBootApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        List<Order> orders = orderService.showOrders(9);
        System.out.println(orders.get(0).getOrderItems());
    }

}
