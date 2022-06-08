package com.cream.kw_springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cream.kw_springboot.bean.OrderItem;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@MapperScan("com.cream.kw_springboot.mapper")
public interface OrderItemMapper extends BaseMapper<OrderItem> {
}
