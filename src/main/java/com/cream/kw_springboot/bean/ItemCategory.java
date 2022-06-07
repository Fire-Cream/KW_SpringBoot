package com.cream.kw_springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemCategory {
    private Integer itemCategoryId;
    private String menuName;
    private Integer status;
}
