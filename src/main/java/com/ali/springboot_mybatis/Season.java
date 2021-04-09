package com.ali.springboot_mybatis;

public enum Season {
    // 定义四个枚举实例
    SPRING(1,"春"),SUMMER(2,"夏"),AUTUMN(3,"秋"),WINTER(4,"冬");

    private  int id;
    private  String name;

    Season(int id, String name) {
        this.id = id;
        this.name = name;
    }
/*   public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
*/


    public static void main(String[] args) {
        System.out.println(Season.SPRING.name);
        System.out.println(Season.SUMMER.name);
        System.out.println(Season.AUTUMN.name);
        System.out.println(Season.WINTER.name);
    }
}
