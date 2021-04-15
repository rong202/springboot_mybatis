package com.ali.springboot_mybatis.invoke;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "task.prop")
public class A {
    private String scanPackage = "";
}
