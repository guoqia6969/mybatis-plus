package com.atguigu.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author wangsh
 * @Classname Product
 * @Description
 * @Date 2021/4/19 19:47
 */
@Data
public class Product {

    /**
     * 商品id
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private Integer price;

    /**
     * 乐观锁版本号
     */
    @Version
    private Integer version;
}
