package com.atguigu.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

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

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 1@TableLogic 逻辑删除注解
     * 2@TableField MP会自动将数据库中的下划线命名风格转化为实体类中的驼峰命名风格
     * 删除状态
     * 0 false 未删除;   1 true 已删除
     */
    @TableLogic
    @TableField(value = "is_deleted")
    private Boolean deleted;
}
