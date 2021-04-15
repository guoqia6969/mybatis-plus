package com.atguigu.mybatisplus.service.impl;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangsh
 * @Classname UserServiceImpl
 * @Description
 * @Date 2021/4/15 19:42
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> selectAllByName(String name) {
        // baseMapper对象指向当前业务的mapper对象
        return baseMapper.selectAllByName(name);
    }
}
