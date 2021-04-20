package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangsh
 * @Classname WrapperTests
 * @Description Wrapper ： 条件构造抽象类
 * @Date 2021/4/20 19:02
 */
@SpringBootTest
public class WrapperTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void test1(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        //条件
        userQueryWrapper
                .like("name","王")
                .between("age",10,20)
                .isNotNull("email");
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
        //排序
        userQueryWrapper
                .orderByDesc("age")
                .orderByAsc("id");
        List<User> users1 = userMapper.selectList(userQueryWrapper);
        users1.forEach(System.out::println);

    }
}
