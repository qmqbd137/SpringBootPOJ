package com.qmq.springbootpoj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qmq.springbootpoj.mapper")
public class SpringBootPojApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPojApplication.class, args);
    }

}
