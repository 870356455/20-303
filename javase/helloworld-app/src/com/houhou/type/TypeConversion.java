package com.houhou.type;

public class TypeConversion {
    public static void main(String[] args) {
        //强制类型转换
        //数据类型  变量  =  （数据类型）变量、数据
        int a=20;
        byte b= (byte) a;//ALT+ENTER (快捷）强制类型转换
        System.out.println(a);
        System.out.println(b);

        int i=1500;
        byte y= (byte) i;
        System.out.println(y);//强制转换数据丢失

        double d=99.5;
        int c= (int) d;
        System.out.println(c);//数据丢失
    }
}
