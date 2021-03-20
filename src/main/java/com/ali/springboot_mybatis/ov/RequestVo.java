package com.ali.springboot_mybatis.ov;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestVo implements Serializable {
    private String name;
    private Integer age;
    private String birthday;

}
