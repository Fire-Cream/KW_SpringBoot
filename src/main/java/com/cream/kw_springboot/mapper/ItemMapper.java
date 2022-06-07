package com.cream.kw_springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cream.kw_springboot.bean.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMapper extends BaseMapper<Item> {
}
