package com.cream.kw_springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cream.kw_springboot.bean.User;
import com.cream.kw_springboot.mapper.UserMapper;
import com.cream.kw_springboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("/userServiceImpl")
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User login(String username, String password) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",username);
        queryWrapper.eq("password",password);
        return baseMapper.selectOne(queryWrapper);
    }

    @Override
    public void registerUser(User user) {
        baseMapper.insert(user);
    }

    @Override
    public User existUser(String username) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",username);
        return baseMapper.selectOne(queryWrapper);
    }
}
