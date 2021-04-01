package com.ali.springboot_mybatis.controller;

import com.ali.springboot_mybatis.pojo.Girl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Idao {
    List<Girl> list();

    void add(String name, Integer age);

    void padd(List list);

    void del(int id);

    Girl findById(int id);

    void add1(String name, Integer age);

    void pdel(Object o);

    int pdel1(List list);

    Girl findBy(String name, String birthday);
}
