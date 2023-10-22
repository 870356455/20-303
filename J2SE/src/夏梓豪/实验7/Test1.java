package 夏梓豪.实验7;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        int classNumber = 69,x=2000,sum = 0,needs=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=69; i++) {
            if(sum>=2000) {
                System.out.println("已成功集资2000元，同学们冲冲冲o.0！o.0！o.0！o.0！");
                break;
            }
            System.out.println("第" + i + "位同学出资：");
            int add= sc.nextInt();

            if (add>=10){
                sum+=add;
                //还需要筹集的资金
                needs = x-sum;
                System.out.println("还需要集资"+needs+"元");
            }
            else{
                System.out.println("请不要低于十元！");
                i--;
            }
        }
    }
}