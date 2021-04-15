package com.ali.springboot_mybatis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String Id;
    private String name;
    private String age;
    private String birthday;
}
