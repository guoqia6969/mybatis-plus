package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.Product;
import com.atguigu.mybatisplus.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author wangsh
 * @Classname ConcurrentTest
 * @Description
 * @Date 2021/4/19 19:53
 */
@SpringBootTest
public class ConcurrentTest {

    @Resource
    private ProductMapper productMapper;

    @Test
    public void testConcurrentUpdate(){

        //1.小李
        Product product1 = productMapper.selectById(1L);

        //2.小张
        Product product2 = productMapper.selectById(1L);

        //3.小李将价格加了50元，存入了数据库
        product1.setPrice(product1.getPrice() + 50);
        productMapper.updateById(product1);

        //4.小王将价格降了30元，存入了数据库
        product2.setPrice(product2.getPrice() - 30);
        int result = productMapper.updateById(product2);
        if (result == 0) {
            System.out.println("小王重试");
            //重新获取数据
            product2 = productMapper.selectById(1L);
            //更新
            product2.setPrice(product2.getPrice() - 30);
            productMapper.updateById(product2);
        }

        //5.最后的结果
        Product product3 = productMapper.selectById(1L);
        System.out.println(product3);

    }
}
