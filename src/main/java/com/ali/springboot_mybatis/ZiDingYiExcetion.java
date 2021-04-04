package com.ali.springboot_mybatis;

import lombok.Data;

@Data
public class ZiDingYiExcetion extends Exception{
    private String code;
    private String message;
}
