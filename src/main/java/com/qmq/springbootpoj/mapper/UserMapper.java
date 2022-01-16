package com.qmq.springbootpoj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qmq.springbootpoj.Entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Bd_Qmq
 * @create 2022-01-16 11:49
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
