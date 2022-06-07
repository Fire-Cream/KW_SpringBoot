package com.cream.kw_springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
    private String itemId;
    private String name;
    private Double marketPrice;
    private Double shopPrice;
    private Integer num;
    private String image;
    private String idesc;
    private Byte iflag;
    private Byte status;
    private Date create;
    private Date updated;
    private Integer cid;
}
