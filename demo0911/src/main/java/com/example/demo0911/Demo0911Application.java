package com.example.demo0911;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo0911.mapper")
public class Demo0911Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0911Application.class, args);
    }

}
