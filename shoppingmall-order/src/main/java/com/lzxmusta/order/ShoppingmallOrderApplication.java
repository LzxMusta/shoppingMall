package com.lzxmusta.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.lzxmusta.order.dao")
@SpringBootApplication
public class ShoppingmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingmallOrderApplication.class, args);
    }

}
