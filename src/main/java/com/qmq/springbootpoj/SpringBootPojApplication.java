package com.qmq.springbootpoj;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qmq.springbootpoj.mapper")
@EnableApolloConfig
public class SpringBootPojApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPojApplication.class, args);
    }

}
