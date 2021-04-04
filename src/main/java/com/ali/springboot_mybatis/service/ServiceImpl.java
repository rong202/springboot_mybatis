package com.ali.springboot_mybatis.service;

import com.ali.springboot_mybatis.controller.Idao;
import com.ali.springboot_mybatis.modle.PageResult;
import com.ali.springboot_mybatis.ov.RequestVo;
import com.ali.springboot_mybatis.pojo.Girl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public List<Girl> findBy(String name, int age) {
        return idao.findBy(name, age);
    }

    @Override
    public List<Girl> findBy1(RequestVo requestVo) {
        return idao.findBy1(requestVo);
    }

    @Override
    public List<Girl> findBy2(RequestVo requestVo) {
        return idao.findBy2(requestVo);
    }

    @Override
    public PageResult<List<Girl>> listPage(Girl girl) {
        PageHelper.startPage(girl.getPage(), girl.getRows());
        System.out.println("++++++++++++"+girl.getPage()+ girl.getRows());
        List<Girl> allPaging = idao.findAll1(girl);
        PageInfo<Girl> of = PageInfo.of(allPaging);

        return new PageResult<>(of.getTotal(), of.getList());
    }
}
