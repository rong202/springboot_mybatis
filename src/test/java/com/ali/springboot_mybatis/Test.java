package com.ali.springboot_mybatis;

import lombok.Data;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test {
    @org.junit.Test
    public void a(XiaoMing xiaoMing){
        xiaoMing.setAge(11);
        switch (xiaoMing.getAge()){
            case 11:
                System.out.println("11岁");
            case 12:
                System.out.println("12岁");
            break;
        }
    }
    @Data
    public static class XiaoMing{
        private String name;
        private int age;

        public XiaoMing(String name){
            this.name = name;
        }
    }
    @org.junit.Test
    public void aa(XiaoMing xiaoMing){
        xiaoMing.setName("wang");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(","+xiaoMing.getName());
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        XiaoMing xiaoMing = new XiaoMing("xiaoming");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(","+xiaoMing.getName());
        System.out.println(stringBuilder);

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);
        String s =",";
        String a="aaaaaa";
        System.out.println(stringBuilder.append(s + a));
    }

}

