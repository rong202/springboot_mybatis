package com.ali.springboot_mybatis.test;

public class Test {
    private final static ThreadLocal THREAD_LOCAL = new ThreadLocal();

    public static void main(String[] args) {
        String o = (String) THREAD_LOCAL.get();
        System.out.println(o);
        System.out.println(getSysId());

    }
    public static Long getSysId(){
        return 1L;
    }
}
