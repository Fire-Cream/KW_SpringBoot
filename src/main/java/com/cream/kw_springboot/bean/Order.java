package com.cream.kw_springboot.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.test.autoconfigure.AutoConfigureMybatisPlus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.annotations.ResultMap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName(value = "orders",resultMap = "order")
public class Order {
    @TableId("oid")
    private String orderId;
    @TableField("ordertime")
    private Date orderTime;
    private Double total;
    private Integer state;
    private String address;
    private String name;
    private String telephone;
    @TableField(exist = false)
    private User user;
    @TableField(exist = false)
    private List<OrderItem> orderItems = new ArrayList<>();
}
