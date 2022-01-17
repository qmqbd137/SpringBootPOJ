package com.qmq.springbootpoj.controller;


import com.qmq.springbootpoj.entity.User;
import com.qmq.springbootpoj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bdQmq
 * @since 2022-01-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired(required = false)
    private IUserService iUserService;

    @RequestMapping("/getName")
    public String getUserNameById(long id){
        User user = iUserService.getById(id);
        return user.getFirstName() + user.getLastName();
    }

}
