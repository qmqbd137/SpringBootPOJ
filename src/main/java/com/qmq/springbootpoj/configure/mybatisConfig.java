package com.qmq.springbootpoj.configure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bd_Qmq
 * @create 2022-01-16 11:40
 */
@Configuration
@MapperScan("com.qmq.springbootpoj.mapper")
public class mybatisConfig {
}
