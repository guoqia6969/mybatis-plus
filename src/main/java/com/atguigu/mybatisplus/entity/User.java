package com.atguigu.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wangsh
 * @Classname User实体类
 * @Description
 * @Date 2021/4/14 19:20
 */
@Data
@TableName(value = "t_user")
public class User {
    /**
     * 主键id
     * 1@TableId 告诉mybatisPlus 这个字段是这个表的主键ID
     * mybatisPLus默认使用雪花算法id生成策略
     * 2@TableId (type = IdType.ASSIGN_ID)
     */
    @TableId(value = "uid")
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
