package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusApplicationTests {

    //@Autowired //默认按类型装配。是spring的注解
    @Resource //默认按名称装配，找不到与名称匹配的bean，则按照类型装配。是J2EE的注解
    private UserMapper userMapper;



    @Test
    void testSelectList(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void testInsert(){
        User user = new User();
        user.setName("王大炮");
        user.setAge(22);
        user.setEmail("wsh82898@163.com");
        int result = userMapper.insert(user);
        System.out.println("影响的行数"+result);
        System.out.println("id："+user.getId());
    }


    @Test
    void testSelect(){
        //根据id查询单个
        User user = userMapper.selectById(1L);
        System.out.println("user = " + user);
        System.out.println("---------------------------");
        //根据ids查询多个
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3, 4));
        users.forEach(System.out::println);
        System.out.println("---------------------------");
        //根据多个条件查询
        Map<String,Object> map = new HashMap<>();
        map.put("name","王大炮");
        map.put("age",22);
        List<User> users1 = userMapper.selectByMap(map);
        users1.forEach(System.out::println);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(5L);
        user.setName("阿拉蕾");
        int result = userMapper.updateById(user);
        System.out.println("本次更新记录："+result);
    }

    @Test
    void testDelete(){
        int i = userMapper.deleteById(1384100636998553602L);
        System.out.println("本次删除条数："+i);
    }

    @Test
    public void testSelectAllByName(){
        List<User> users = userMapper.selectAllByName("Jack");
        users.forEach(System.out::println);
    }



}
