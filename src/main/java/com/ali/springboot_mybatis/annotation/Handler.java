package com.ali.springboot_mybatis.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ThinkPad on 2017/11/12.
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Component
public @interface Handler {

    String name();

    String code();

    //  Class messageConvertClass() default MessageConvert.class;

}
