package com.ali.springboot_mybatis;

import lombok.Data;

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

}

