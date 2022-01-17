package com.qmq.springbootpoj;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qmq.springbootpoj.entity.User;
import com.qmq.springbootpoj.mapper.UserMapper;
import com.qmq.springbootpoj.service.IUserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SpringBootPojApplicationTests {

    @Autowired
    private IUserService iUserService;

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(2,userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    void mapperTest1() {
        System.out.println(("----- selectAll method test ------"));
        QueryWrapper<User> userWrapper =  new QueryWrapper<User>();
        userWrapper.eq("userId",1).groupBy("userId");
        User user = iUserService.getOne(userWrapper);
        Assertions.assertEquals("小",user.getFirstName());
        System.out.println(user);
    }

}
