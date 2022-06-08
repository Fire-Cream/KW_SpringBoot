package com.cream.kw_springboot.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("order_item")
public class OrderItem {
    @TableId("itemid")
    private String orderItemId;
    private Integer count;
    private Double subtotal;
    @TableField(exist = false)
    private Item item;
    @TableField(exist = false)
    private Order order;
}
