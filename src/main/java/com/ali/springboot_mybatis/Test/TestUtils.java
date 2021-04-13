package com.ali.springboot_mybatis.Test;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;

public  class TestUtils {
    public static void main(String[] args) {
        a(1.00);
    }
    public static String a(double b){
        FieldPosition fieldPosition = new FieldPosition(1);
        Double aDouble = Double.valueOf(1.00);
        System.out.println(aDouble);

        DecimalFormat decimalFormat = new DecimalFormat();
        String format = decimalFormat.format(b);
        System.out.println(format);
        return format;
    }
}
