package com.ali.springboot_mybatis.controller;

import com.ali.springboot_mybatis.ov.RequestVo;
import com.ali.springboot_mybatis.pojo.Girl;
import com.ali.springboot_mybatis.service.ChouXiang;
import com.ali.springboot_mybatis.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {
    @Autowired
    Idao idao;
    @Autowired
    Iservice iservice;
    private String key;

    @RequestMapping("findAll")
    public Map<String, Object> findAll() {
        ChouXiang chouXiang = new ChouXiang();
        HashMap<String, Object> hashMap = new HashMap<>();
        List<Girl> list = iservice.list();
        key = "a";
        hashMap.put(key, list);
        System.out.println(hashMap);
        return hashMap;
    }

    @RequestMapping("add")
    public String add(String name, Integer age) {
        iservice.add(name, age);
        return "添加成功";
    }

    @RequestMapping("add1")
    @ResponseBody
    public String add1(@RequestBody RequestVo requestVo) {
        String name = requestVo.getName();
        Integer age = requestVo.getAge();

        idao.add1(name, age);
        return "添加成功";
    }

    @RequestMapping("padd")
    public String foreachAdd(@RequestBody List<Girl> list) {
        iservice.padd(list);
        return "批量添加成功";
    }

    @RequestMapping("del")
    public String del(int id) {
        iservice.del(id);
        return "删除成功";
    }

    @RequestMapping("findById")
    public Girl findById(int id) {
        Girl girl = iservice.findById(id);
        return girl;
    }

    @RequestMapping("findBy")
    @ResponseBody
    public Girl findBy(@RequestBody RequestVo requestVo) {
        String name = requestVo.getName();
        String birthday = requestVo.getBirthday();
        Girl girl = iservice.findBy(name, birthday);
        return girl;
    }

    @RequestMapping("pdel")
    public String pDel(@RequestBody List<Girl> list) {
        System.out.println(list.toString());
        iservice.pdel(list);
        return "批量删除成功";
    }

    /**
     * 批量删除，返回受影响行数
     *
     * @param list
     * @return
     */
    @RequestMapping("pdel1")
    public String pDel1(@RequestBody List<Girl> list) {
        System.out.println(list.toString());
        iservice.pdel1(list);
        return "批量删除成功";
    }
}
