package com.atguigu.mybatisplus.controller;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangsh
 * @Classname UserController
 * @Description
 * @Date 2021/5/11 19:13
 * @ CrossOrigin 允许跨域
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    private List<User> list(){
        return userService.list();
    }
}
