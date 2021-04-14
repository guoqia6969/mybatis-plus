package com.atguigu.mybatisplus.entity;

import lombok.Data;

/**
 * @author wangsh
 * @Classname User实体类
 * @Description
 * @Date 2021/4/14 19:20
 */
@Data
public class User {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 邮箱
     */
    private String email;

}
