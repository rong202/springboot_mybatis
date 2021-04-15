package com.ali.springboot_mybatis.test;

import com.ali.springboot_mybatis.pojo.Girl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a {
    private static BigDecimal outboundCustomsClearancePrice;

    public static void a(){
        DecimalFormat decimalFormat = new DecimalFormat();
        String format = decimalFormat.format(1.01);
        double v = Double.parseDouble(format);

        System.out.println(decimalFormat.format(Double.valueOf(1.01)));

        List<Double> doubles = Arrays.asList(1.00, 2.00, 3.00, 4.00);
        Girl girl = new Girl("1.00");
        Girl girl1 = new Girl("2.00");
        Girl girl2 = new Girl("3.055");
        Girl girl3 = new Girl("4.00");
        List<Girl> list = new ArrayList<>();
        list.add(girl);
        list.add(girl1);
        list.add(girl2);
        list.add(girl3);
        Double reduce = list.stream().map(u ->
                {
                    Double aDouble = Double.valueOf(u.getName());
                    return aDouble;
                }
        ).reduce(0.00, Double::sum);
        System.out.println(reduce);
        String format1 = decimalFormat.format(reduce);
        System.out.println(format1);
        BigDecimal bigDecimal = new BigDecimal("12.010");
        System.out.println(bigDecimal);
        String format2 = decimalFormat.format(bigDecimal);
        System.out.println(format2);
        String a = "12.010";
        double s = 1.0210;
        String format3 = decimalFormat.format(s);
        System.out.println(format3);
          String format4 = decimalFormat.format(Double.valueOf(a));
        System.out.println(format4);

        String[] yearArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "W", "X", "Y"};
        String as ="12345678923456";
        int i = Arrays.binarySearch(yearArray, as.substring(9, 10));
        System.out.println(i);
        String s1 = i + 01 + "";
        System.out.println(s1);


    }
    public static void main(String[] args) {
        String str = "asdasd,qweqwe";
        String[] strs = str.split(",");
        String a =strs[0];
        System.out.println(strs[0]);
        a();
        String x = new String("a") + "c";



    }
}
