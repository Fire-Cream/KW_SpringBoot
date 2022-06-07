package com.cream.kw_springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cream.kw_springboot.bean.User;
import com.cream.kw_springboot.mapper.UserMapper;
import com.cream.kw_springboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("/userServiceImpl")
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
