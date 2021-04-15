package com.ali.springboot_mybatis;

import org.apache.commons.lang3.StringUtils;
import org.hamcrest.core.IsNull;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

public class TestList {
    public static void main(String[] args) {
        a();
        aa();
    }
    public static void  a(){
        List<String> list = new ArrayList<>();
        List<User> list1 = new ArrayList<>();
        for (User user : list1) {
            user.getName();
            user.getId();

        }
        User user = new User();
        user.setId("1");
        user.setAge("22");
        user.setName("wa");
        String id = user.getId();
        list.add(id);
        list.add(user.getAge());
        list.add(user.getName());
        list.add(user.getBirthday());
        //如何在list 里面各个字段 单独拼接desc 或 asc
        String collect1 = list.stream().filter(e -> StringUtils.isNotEmpty(e)).collect(Collectors.joining(","));
        //根据，拆分各个字段
        //对象字段和传入字段比对，在后面拼接 orderType
        if (StringUtils.isNotEmpty(collect1)){
            String[] split = collect1.split(",");
            for (int i=0;i<split.length;i++){
                System.out.println("---------------"+split[i]);
            }
        }
        //书到用时方恨少
        System.out.println(collect1);
    }
    public static void aa(){

        //-----------获取对象属性
        System.out.println("----------------------------");
        User user = new User();
        Class c = user.getClass();

        Field[] fs = c.getDeclaredFields();//fs 为c 的所有属性

        for(int i=0;i<4;i++){

            Field field = fs[i];//field为testRes的第i的属性

            System.out.println(field);

            field.setAccessible(true);
        }

        System.out.println(user);

    }
}
