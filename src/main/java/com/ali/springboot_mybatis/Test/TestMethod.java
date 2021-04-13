package com.ali.springboot_mybatis.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        //Method a = TestMethod.class.getMethod("a", String.class);
        Class<?> clazz = Class.forName("com.ali.springboot_mybatis.Test.TestMethod");
        System.out.println(clazz);
        Method m = clazz.getMethod("a", String.class);
        Object a = m.invoke(clazz.getDeclaredConstructor().newInstance(),"aaa");
        System.out.println(a.toString());
        System.out.println(m);
        clazz.getMethods();
        // System.out.println(a);
        // a.invoke("wangjialong");
    }

    public String a(String b) {
        return b;
    }
}
