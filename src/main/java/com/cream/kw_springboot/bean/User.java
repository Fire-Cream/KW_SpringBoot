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
@TableName("user")
public class User {
    @TableId("uid")
    private String userId;
    @TableField("username")
    private String userName;
    private String password;
    @TableField("name")
    private String nickName;
    private String email;
    private String telephone;
}
