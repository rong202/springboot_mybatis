package com.ali.springboot_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 可以使用的mybatis demo
 */
/*@MapperScan("com.ali.springboot_mybatis.service")*/
@SpringBootApplication
//@ComponentScan(basePackages = {"com.ali.springboot_mybatis.service", "com.ali.springboot_mybatis.controller"})
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
