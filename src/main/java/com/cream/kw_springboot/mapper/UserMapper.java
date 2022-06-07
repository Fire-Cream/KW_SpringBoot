package com.cream.kw_springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cream.kw_springboot.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
