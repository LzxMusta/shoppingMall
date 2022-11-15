package com.lzxmusta.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.lzxmusta.ware.dao")
@SpringBootApplication
public class ShoppingmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingmallWareApplication.class, args);
    }

}
