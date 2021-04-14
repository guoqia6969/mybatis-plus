package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author wangsh
 * @Classname UserMapper 用户mapper接口
 * @Description
 * @Date 2021/4/14 19:24
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
