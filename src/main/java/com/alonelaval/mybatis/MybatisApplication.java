package com.alonelaval.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.alonelaval.mybatis")
public class MybatisApplication {


    public static void main(String[] args) {

        SpringApplication.run(MybatisApplication.class, args);
    }
}
