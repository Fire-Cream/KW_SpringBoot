package com.cream.kw_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cream.kw_springboot.bean.User;

public interface UserService extends IService<User> {
    User login(String username, String password);

    void registerUser(User user);

    User existUser(String username);
}
