package com.houhou.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int lucky = r.nextInt(101);
        System.out.println("猜数字游戏开始！！");
        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();
            if (a==lucky){
                System.out.println("恭喜你猜对了！");
                break;
            }
            else if (a>lucky){
                System.out.println("猜大了，请继续：");
            }
            else if (a<lucky){
                System.out.println("猜小了，请继续：");
            }
            else{
                System.out.println("该数字不在范围内！请继续");
            }
        }
    }
}
