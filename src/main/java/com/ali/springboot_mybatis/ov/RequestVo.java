package com.ali.springboot_mybatis.ov;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class RequestVo implements Serializable {
    private String name;
    private Integer age;
    private String birthday;

    public RequestVo(String name, Integer age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public RequestVo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
