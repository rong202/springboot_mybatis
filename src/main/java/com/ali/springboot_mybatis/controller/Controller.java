package com.ali.springboot_mybatis.controller;

import com.ali.springboot_mybatis.ZiDingYiExcetion;
import com.ali.springboot_mybatis.modle.PageResult;
import com.ali.springboot_mybatis.ov.RequestVo;
import com.ali.springboot_mybatis.pojo.Girl;
import com.ali.springboot_mybatis.service.ChouXiang;
import com.ali.springboot_mybatis.service.Iservice;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 这是一个分支
 */
@RestController
public class Controller {
    @Autowired
    Idao idao;
    @Autowired
    Iservice iservice;
    private String key;

    /**
     *
     * @return
     */
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

    @GetMapping("findAll1")
    public PageResult<List<Girl>> findAll1(Girl girl) {
        PageResult<List<Girl>> listPageResult = iservice.listPage(girl);
        return listPageResult;
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

    /**
     * 只传入一个 id ,不是json对象
     * @param id
     * @return
     */
    @RequestMapping("findById")
    public Girl findById(Integer id) {
        System.out.println(id);
        Girl girl = iservice.findById(id);
        return girl;
    }

    @RequestMapping("findBy")
    @ResponseBody
    public List<Girl> findBy(@RequestBody RequestVo requestVo) throws Exception {
            String name = requestVo.getName();
            System.out.println(name);
            Integer age = requestVo.getAge();
            if (!name.isEmpty() && age !=null){
                List<Girl> girl = iservice.findBy(name,age);
                return girl;
            }

            ZiDingYiExcetion ziDingYiExcetion = new ZiDingYiExcetion();
            ziDingYiExcetion.setCode("0");
            ziDingYiExcetion.setMessage("缺少参数");
            throw ziDingYiExcetion;

        /**
         * null
         */


    }

    @RequestMapping("findBy1")
    @ResponseBody
    public List<Girl> findBy1(@RequestBody RequestVo requestVo) {
        System.out.println(requestVo.getName());
        List<Girl> girl = iservice.findBy1(requestVo);
            return girl;

    }
    @RequestMapping("findBy2")
    @ResponseBody
    public List<Girl> findBy2(@RequestBody RequestVo requestVo) {
        System.out.println(requestVo.getName());
        List<Girl> girl = iservice.findBy2(requestVo);
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
