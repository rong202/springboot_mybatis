package com.ali.springboot_mybatis.service;

import lombok.Data;

/**
 * 重命名文件、方法、属性等（Rename）：Shift+F6，同时被修改处在其他被调用的地方也会随之更改，修改文件名，如类名，右键当前类文件 -> Refactor -> Rename，便会看到快捷键提示 Shift+F6
 * 重构类、方法（Change Signarture）：Ctrl+F6
 * 提取当前选择为变量（Extract Variable）：Ctrl+Alt+V
 * 提取当前选择为类的私有属性（Extract Field）：Ctrl+Alt+F
 * 提取当前选择为常量（Extract Constant）：Ctrl+Alt+C
 * 提取当前选择为方法（Extract Method）：Ctrl+Alt+M
 * 提取当前选择为方法参数（Extract Parameter）：Ctrl+Alt+P
 * 提取代码块至 if、try 等结构中（Surround With）：Ctrl+Alt+T
 * 创建模块文件等（New）：Ctrl+Alt+N
 * 创建测试用例（Test）：Ctrl+Shift+T
 * 重构菜单（Refactor for this）：Ctrl+T
 * 英雄总是最后登场！重构一切的男人！！！：Ctrl+Shift+Alt+T
 * ————————————————
 * 版权声明：本文为CSDN博主「csdn丨你的笑忘书」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/zhoukikoo/article/details/79374675
 */
public  class ChouXiang {
    public static final String Target_Salary = "2000";
    private static String SexInfo;

    public static void main(String[] args, int age1) {
        System.out.println(Target_Salary+"元");
        SexInfo = "此人是男性";
        System.out.println(SexInfo);
        System.out.println(SexInfo);
        System.out.println(SexInfo);

        XiaoMing xiaoMing = new XiaoMing(11);
        int age = xiaoMing.getAge(); //ctrl + alt + v 提取变量
        System.out.println(age + "岁是一个好年级"); //ctrl alt c 提取成员变量
        //ctrl alt v 局部变量

        System.out.println(age1); //ctrl alt p 提取参数

        a(xiaoMing);
    }
    public static void a(XiaoMing xiaoMing){
        System.out.println(1123);
        switch (xiaoMing.getAge()){
            case 11:
                System.out.println("11岁");
                break;
            case 12:
                System.out.println("12岁");
                break;
        }
    }
    public void a(){
        for(int i =0;i<11;i--){
            System.out.println(i);
        }
    }
    @Data
    public static class XiaoMing{
        private String name;
        private int age;

        public XiaoMing(int age){
            this.age = age;
        }
    }
}
