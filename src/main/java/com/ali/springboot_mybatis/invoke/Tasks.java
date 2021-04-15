package com.ali.springboot_mybatis.invoke;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tasks {
    String value();
}
