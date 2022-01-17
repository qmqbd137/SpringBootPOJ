package com.qmq.springbootpoj.service.impl;

import com.qmq.springbootpoj.entity.User;
import com.qmq.springbootpoj.mapper.UserMapper;
import com.qmq.springbootpoj.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bdQmq
 * @since 2022-01-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
