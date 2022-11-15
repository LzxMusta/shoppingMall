package com.lzxmusta.product;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzxmusta.product.entity.PmsBrandEntity;
import com.lzxmusta.product.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShoppingmallProductApplicationTests {
    @Autowired
    PmsBrandService pmsBrandService;
    @Test
    void contextLoads() {

    }

}
