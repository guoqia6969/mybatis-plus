package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangsh
 * @Classname ServiceTests
 * @Description
 * @Date 2021/4/15 19:47
 */
@SpringBootTest
public class ServiceTests {

    @Resource
    private UserService userService;


    @Test
    void countTest(){
        int count = userService.count();
        System.out.println("一共有："+count+"记录");
    }

    @Test
    void testSaveBatch(){
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setName("王"+i);
            user.setAge(i);
            user.setEmail("2457845545"+i+"@qq.com");
            users.add(user);
        }
        userService.saveBatch(users);
    }

    @Test
    public void testSelectAllByName(){
        List<User> users = userService.selectAllByName("Jack");
        users.forEach(System.out::println);
    }
}
