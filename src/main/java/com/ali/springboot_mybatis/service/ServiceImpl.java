package com.ali.springboot_mybatis.service;

import com.ali.springboot_mybatis.controller.Idao;
import com.ali.springboot_mybatis.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements Iservice {
    @Autowired(required=false)
    Idao idao;

    @Override
    public void padd(List list) {
        idao.padd(list);
    }

    @Override
    public List list() {
        return idao.list();
    }

    @Override
    public void del(int id) {
        idao.del(id);
    }

    @Override
    public Girl findById(int id) {
        return idao.findById(id);
    }

    @Override
    public void add(String name, Integer age) {
        idao.add(name, age);
    }

    @Override
    public void pdel(List list) {
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
            idao.pdel(o);
        }
    }

    @Override
    public int pdel1(List list) {
        int i = idao.pdel1(list);
        System.out.println(i);
        return idao.pdel1(list);
    }

    @Override
    public Girl findBy(String name, String birthday) {
        return idao.findBy(name, birthday);
    }
}
