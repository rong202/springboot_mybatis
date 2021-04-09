package com.ali.springboot_mybatis;


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
    public static class XiaoMing{
        private String name;
        private int age;

        public XiaoMing(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}

