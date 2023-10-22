package houhou0924;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int price = sc.nextInt();
        System.out.println("请输入当前月份：");
        int mouth = sc.nextInt();
        System.out.println("请输入仓位类型：\n"+"1--头等舱    2--经济舱");
        int type = sc.nextInt();
        calulate(price,mouth,type);
    }
    public static void calulate(double price, int mouth, int type){
        if (mouth>=5&&mouth<=10){
            System.out.println("当前为旺季");
            switch (type){
                case 1:
                    price*=0.9;
                    System.out.println("头等舱9折优惠后价格为："+price+"元");
                    break;
                case 2:
                    price*=0.85;
                    System.out.println("经济8.5折优惠后价格为："+price+"元");
                    break;
            }
        }
        else{
            System.out.println("当前为淡季");
            switch (type){
                case 1:
                    price*=0.7;
                    System.out.println("头等舱7折优惠后价格为："+price+"元");
                    break;
                case 2:
                    price*=0.65;
                    System.out.println("经济舱6.5折优惠后价格为："+price+"元");
                    break;
            }
        }
    }
}
