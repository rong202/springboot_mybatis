package com.ali.springboot_mybatis.service;

import com.ali.springboot_mybatis.modle.PageResult;
import com.ali.springboot_mybatis.ov.RequestVo;
import com.ali.springboot_mybatis.pojo.Girl;

import java.util.List;

public interface Iservice {
    void padd(List list);

    List list();

    void del(int id);

    Girl findById(int id);

    void add(String name, Integer age);

    void pdel(List list);

    int pdel1(List list);

    List<Girl> findBy(String name, int age);

    List<Girl> findBy1(RequestVo requestVo);
    List<Girl> findBy2(RequestVo requestVo);

    PageResult<List<Girl>> listPage(Girl girl);
}
