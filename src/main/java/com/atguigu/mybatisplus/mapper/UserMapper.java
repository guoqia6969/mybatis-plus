package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangsh
 * @Classname UserMapper 用户mapper接口
 * @Description
 * @Date 2021/4/14 19:24
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据名称查询所有的记录
     * @param name 名称
     * @return userList
     */
    List<User> selectAllByName(String name);
}
