package com.ali.springboot_mybatis.invoke;

import com.ali.springboot_mybatis.test.RedisUtil;
import com.ali.springboot_mybatis.test.TestRedis;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({ClassUtil.class,
        TestRedis.class,
        RedisUtil.class})

public @interface EnableConfig {
}
