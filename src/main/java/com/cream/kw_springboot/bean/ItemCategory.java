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
@TableName("item_cat")
public class ItemCategory {
    @TableId("cid")
    private Integer itemCategoryId;
    @TableField("name")
    private String menuName;
    @TableField("status")
    private Integer status;
}
