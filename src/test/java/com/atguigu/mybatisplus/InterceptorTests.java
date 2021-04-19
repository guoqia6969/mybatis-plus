package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangsh
 * @Classname InterceptorTests
 * @Description
 * @Date 2021/4/19 19:17
 */
@SpringBootTest
public class InterceptorTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelectPage(){

        //创建分页参数
        Page<User> pageParam = new Page<>(1,5);
        //执行分页查询
        userMapper.selectPage(pageParam, null);
        //查看分页参数的成员
        System.out.println(pageParam);
    }

    @Test
    public void testSelectPageVo(){
        Page<User> pageParam = new Page<>(1,5);
        userMapper.selectByPage(pageParam, 20);
        List<User> users = pageParam.getRecords();
        users.forEach(System.out::println);
    }
}
