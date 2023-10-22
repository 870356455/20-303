package 夏梓豪.实验7;
import java.util.Random;
public class Test2 {
    public static void main(String[] args) {

        Random ra = new Random();
        int b = ra.nextInt(3) + 1;
        switch (b) {
            case 1:
                System.out.println("您当前在A区");
                break;
            case 2:
                System.out.println("您当前在B区");
                break;
            case 3:
                System.out.println("您当前在C区");
                break;
        }
        int xs = ra.nextInt(25);
        int fz = ra.nextInt(61);
        System.out.println("当前时间为" + xs + ":" + fz);
        //判断当前时间
        if ((xs == 7 && fz >= 30) || (xs == 8 && fz <= 30)) {
            System.out.println("当前时间为早高峰");
            route1(b);
        } else if ((xs == 16 && fz >= 30) || (xs == 18 && fz <= 30) || xs == 17) {
            System.out.println("当前时间为晚高峰");
            route1(b);
        } else {
            System.out.println("不是早高峰和晚高峰，当前不堵车");
            route2(b);

        }
    }
    public static void route1(int i){
        switch (i){
            case 1:
                System.out.println("从地下停车场A区开到B区驶出地下车库，随后从小区西门离开通过三环线上班");
                break;
            case 2:
                System.out.println("从地下停车场B区驶出地下车库，随后从小区西门离开通过三环线上班");
                break;
            case 3:
                System.out.println("从地下停车场C区驶出地下车库，随后从小区西门离开通过三环线上班");
                break;
        }
    }
    public static void route2(int j){
        switch (j){
            case 1:
                System.out.println("从地下停车场A区开到B区驶出地下车库，随后从小区东门离开通过环岛上班");
                break;
            case 2:
                System.out.println("从地下停车场B区驶出地下车库，随后从小区东门离开通过环岛上班");
                break;
            case 3:
                System.out.println("从地下停车场C区驶出地下车库，随后从小区东门离开通过环岛上班");
                break;
        }
    }
}