package com.cream.kw_springboot.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.cream.kw_springboot.mapper")
public class MybatisPlusConfig {

    public PaginationInnerInterceptor paginationInnerInterceptor() {
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        //设置单页最大数量，默认500条
        paginationInnerInterceptor.setMaxLimit(500L);
        return paginationInnerInterceptor;
    }
}
