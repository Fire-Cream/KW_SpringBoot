package com.cream.kw_springboot.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("item")
public class Item {
    @TableId("id")
    private Integer itemId;
    private String name;
    private Double marketPrice;
    private Double shopPrice;
    private Integer num;
    private String image;
    private String idesc;
    private Byte iflag;
    private Byte status;
    private Date created;
    private Date updated;
    private Integer cid;
}
