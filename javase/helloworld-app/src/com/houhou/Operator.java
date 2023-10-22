package com.houhou;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int m=5;
        int n=3;
        //m 5 6 5 4
        //n 3 4 3
        //             6 -   5 + 5   -   4 + 4   + 3
        int result = ++m - --m + m-- - ++n + n-- + 3;
        System.out.println(result);
        System.out.println(m);
        System.out.println(n);


        System.out.println("--------------------------");


        byte x = 10;
        byte y = 30;
        x+=y;
        System.out.println(x);

        System.out.println("--------------------------");

        int a=88,b=45,c=34,max;
        if (a>b)
        {
            max=a>c?a:c;
        }
        else
        {
            max=b>c?b:c;
        }
        System.out.println(max);

        Scanner sc = new Scanner(System.in);
        System.out.println("输入年龄");
        int age = sc.nextInt();
        System.out.println("您的年龄为："+age);
    }
}
