package houhou0924;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //双色球系统
        int[] userNumbers = userSelectNumber();
        System.out.println("您投入的号码");
        printArrat(userNumbers);
        System.out.println("中奖号码");
        int[] luckNumbers = createLuckNumbers();
        printArrat(luckNumbers);
        judge(userNumbers,luckNumbers);
    }

    public static void printArrat(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i== arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
    //设计一个方法，用于让用户投注一组号码并返回
    public static int[] userSelectNumber() {
        //创建一个整形数组，用于存储用户投注的7个号码

        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33之间，不能重复）");
                int number = sc.nextInt();
                if (number < 1 || number > 33) {
                    System.out.println("对不起，您输入的红球号码不在1-33之间，请确认！");
                } else {
                    if (exist(numbers, number)) {
                        System.out.println("对不起，您当前输入的红球号码前面选择过，重复了，请确认！");
                    }else {
                        numbers[i] = number;
                        break;
                    }
                    //判断号码是否重复
                }
            }
        }
        //投注篮球号码
        while (true) {
            System.out.println("请您输入最后1个蓝球号码（1-16）");
            int number = sc.nextInt();
            if (number<1||number>16){
                System.out.println("对不起，您输入的蓝球号码范围不对！");
            }else{
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }
    private static boolean exist(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==0){
                break;
            }
            if (numbers[i]==number){
                return true;
            }
        }
        return false;
    }

    //
    public static int[] createLuckNumbers() {
        //1.创建一个整形数组，用于存储这七个号码
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i < numbers.length-1; i++) {
            while(true){
                int number = r.nextInt(33)+1;
                if (!exist(numbers,number)){
                    numbers[i] = number;
                    break;
                }
            }
        }
        numbers[6] = r.nextInt(16)+1;
        return numbers;
    }
    public static void judge(int[] userNumbers,int[]luckNumbers){
        int redCount =0;
        int blueCount =0;
        for (int i = 0; i < userNumbers.length-1; i++) {
            for (int j = 0; j < luckNumbers.length-1; j++) {
                if (userNumbers[i]==luckNumbers[j]){
                    redCount++;
                    break;
                }
            }
        }
        blueCount = userNumbers[6]==luckNumbers[6]?1:0;
        System.out.println("您命中的红球数量是："+redCount);
        System.out.println("您命中的蓝球数量是："+blueCount);
        //判断输出结果
        if (redCount==6&&blueCount==1){
            System.out.println("1000万");
        }else if (redCount==6&&blueCount==0){
            System.out.println("500万");
        }else if (redCount==5&&blueCount==1){
            System.out.println("3000");
        }else if (redCount==5&&blueCount==0||redCount==4&&blueCount==1){
            System.out.println("200");
        }else if (redCount==4&&blueCount==0||redCount==3&&blueCount==1){
            System.out.println("10");
        }else if (redCount<3&&blueCount==1){
            System.out.println("5");
        }else{
            System.out.println("未中奖");
        }
    }
}