package com.atguigu.mybatisplus.service;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author wangsh
 * @Classname UserService
 * @Description
 * @Date 2021/4/15 19:39
 */
public interface UserService extends IService<User> {

    /**
     * 根据名称查询所有的记录
     * @param name 名称
     * @return userList
     */
    List<User> selectAllByName(String name);
}
