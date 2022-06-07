package com.cream.kw_springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private String orderId;
    private Date orderTime;
    private Double total;
    private Integer state;
    private String address;
    private String name;
    private String telephone;
    private User user;
    private List<OrderItem> orderItems = new ArrayList<>();
}
