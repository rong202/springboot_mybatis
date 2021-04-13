package com.ali.springboot_mybatis.controller;

import com.ali.springboot_mybatis.ov.RequestVo;
import com.ali.springboot_mybatis.pojo.Girl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

    List<Girl> findBy(String name, int age);

    List<Girl> findBy1(@Param("requestVo")RequestVo requestVo);

    List<Girl> findBy2(@Param("requestVo")RequestVo requestVo);

    List<Girl> findAll1(Girl girl);

    List<Girl> like(String str);
}
