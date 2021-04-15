package com.ali.springboot_mybatis;

import com.ali.springboot_mybatis.invoke.EnableConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 可以使用的mybatis demo
 */
/*@MapperScan("com.ali.springboot_mybatis.service")*/
@SpringBootApplication
@ComponentScan(basePackages = {"com.ali.springboot_mybatis.test", "com.ali.springboot_mybatis.invoke", "com.ali.springboot_mybatis.service"})
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
