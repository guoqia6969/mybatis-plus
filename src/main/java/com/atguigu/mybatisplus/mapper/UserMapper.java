package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    /**
     * 根据年龄查询列表，分页显示
     * @param page page对象
     * @param age 年龄
     * @return 分页后的user对象
     */
    IPage<User> selectByPage(Page<?> page,Integer age);
}
