package com.ali.springboot_mybatis;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    private static List<User> dataList = new ArrayList();
    public static void main(String[] args) {
        User user = new User();
        Test1 testStringBuilder = new Test1();
        testStringBuilder.test(user);
    }
    public  void test(User user){
        StringBuilder stringBuilder = new StringBuilder();
        String s = ",";
        if (!StringUtils.isEmpty(user.getId())){
            stringBuilder.append(s + user.getId());
        }
        if (!StringUtils.isEmpty(user.getAge())){
            stringBuilder.append(s + user.getAge());
        }
        if (!StringUtils.isEmpty(user.getName())){
            stringBuilder.append(s + user.getName());
        }
        if (!StringUtils.isEmpty(user.getBirthday())){
            stringBuilder.append(s + user.getBirthday());
        }
        /*if (!user.getName().isEmpty()){
            stringBuilder.append(s + user.getName());
        }
        if (!user.getAge().isEmpty()){
            stringBuilder.append(s + user.getAge());
        }
        if (!user.getBirthday().isEmpty()){
            stringBuilder.append(s + user.getBirthday());
        }*/

        if (stringBuilder!=null){
            StringBuilder str = new StringBuilder();
            str = str.append("order by").append(stringBuilder) ;
            System.out.println(str);
            str.replace(8,9," ");
            System.out.println(str);
        }
        System.out.println("str----");

    }

}
