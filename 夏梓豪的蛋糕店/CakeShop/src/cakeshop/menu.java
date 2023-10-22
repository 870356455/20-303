package cakeshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import static java.lang.System.exit;


public class menu{

    //全局变量用来存储蛋糕信息
    public static ArrayList<Cake> array = new ArrayList<>();

    /*
        1:用输出语句完成主页面的编写
        2：用Scanner实现键盘录入数据
        3：用switch语句完成操作的选择
        4：用循环完成再次回到主菜单
     */

    /*初始化蛋糕信息*/
    public static void init(){
        array.add(new Cake("奶酪蛋糕",12.8,30));
        array.add(new Cake("戚风蛋糕",9.0,20));
        array.add(new Cake("海绵蛋糕",5.0,30));
        array.add(new Cake("泡芙蛋糕",7.5,18));
        array.add(new Cake("慕斯蛋糕",19.9,25));
    }

    /*按单价排序方法*/
    public static void sortByPrice(){
        array.sort(Comparator.comparing(Cake::getPrice));
        System.out.println(array);
    }

    /*按库存排序方法*/
    public static void sortByNumbers(){
        array.sort(Comparator.comparing(Cake::getNumber));
        System.out.println(array);
    }

    /*菜单方法*/
    public static void menu(){
        //用循环完成再次回到主界面
        while(true){
            //菜单页面
            System.out.println("-----欢迎来到猴猴的蛋糕店-----");
            System.out.println("1、 显示今日蛋糕信息");
            System.out.println("2、 按单价进行排序");
            System.out.println("3、 按库存数量排序");
            System.out.println("4、 退出");
            //键盘交互
            Scanner sc = new Scanner(System.in);
            //定义变量用来接收用户输入的值
            Integer line = sc.nextInt();
            //根据变量来判断方法走向
            switch(line){
                case 1:
                    System.out.println(array);
                    break;
                case 2:
                    sortByPrice();
                    break;
                case 3:
                    sortByNumbers();
                    break;
                case 4:
                    exit(200);

            }
        }
    }

    /*主方法-测试*/
    public static void main(String[] args) {
        init();
        menu();
    }
}
//        for (int i = 0; i < array.size(); i++) {
//            if ("奶酪蛋糕".equals(array.get(i).getName())){
//                System.out.println(array.get(i));
//            }
//        }

























