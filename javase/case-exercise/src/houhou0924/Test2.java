package houhou0924;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //完成随机验证码
        Scanner sc = new Scanner(System.in);
        String code =createCode(8);
        System.out.println(createCode(8));
        while (true) {
            System.out.println("请输入验证码");
            String yourcode = sc.next();
            if (code.equals(yourcode)) {
                System.out.println("验证码输入正确");
            } else {
                System.out.println("验证码输入错误，请重新输入");
                return;
            }
        }
    }
    public static String createCode(int a){
        Random ra = new Random();
        String code = "";
        for (int i = 0; i <a; i++) {
            int type = ra.nextInt(3);
            switch (type){
                case 0:
                    //随机一个数字字符
                    code+=ra.nextInt(10);
                    break;
                case 1:
                    //随机一个大写字符
                    char ch1=(char)(ra.nextInt(26)+65);
                    code+=ch1;
                    break;
                case 2:
                    //随机一个小写字符
                    char ch2=(char)(ra.nextInt(26)+97);
                    code+=ch2;
                    break;
            }
        }
        return code;
    }
}
