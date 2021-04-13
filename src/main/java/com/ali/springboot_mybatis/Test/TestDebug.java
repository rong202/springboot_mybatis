package com.ali.springboot_mybatis.Test;

import com.ali.springboot_mybatis.pojo.Girl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDebug {
    public static final String WANGJIALONG = "wangjialong";

    public static void main(String[] args) {
        a();
        System.out.println(1%2);
    }
    public static void a(){
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            System.out.println("发生异常");
                System.out.println(i);
                list.add(i);

        }
        Girl girl = new Girl(1, WANGJIALONG, 22, "birthday");
        List<Integer> collect = Arrays.asList(1, 2, 3, 4).stream().filter(x -> x>1)
                .map(x -> x * 2).collect(Collectors.toList());
    }
}

