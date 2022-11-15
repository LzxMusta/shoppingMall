package com.lzxmusta.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.lzxmusta.product.dao")
@SpringBootApplication
public class ShoppingmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingmallProductApplication.class, args);
    }

}
