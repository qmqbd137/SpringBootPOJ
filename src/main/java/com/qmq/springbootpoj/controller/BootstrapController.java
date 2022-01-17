package com.qmq.springbootpoj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QMQ_bd137
 * @create_time is 2022-01-10 10:52
 */
@RestController
public class BootstrapController {

    @RequestMapping("/")
    public String App(){
        return "Welcome to SpringBoot Wrold";
    }
}
