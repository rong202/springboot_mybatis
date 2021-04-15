package com.ali.springboot_mybatis.pojo;

import com.ali.springboot_mybatis.modle.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Girl extends Page {
    private Integer id;
    private String name;
    private Integer age;
    private String birthday;

    public Girl(String name){
        this.name = name;
    }
}
