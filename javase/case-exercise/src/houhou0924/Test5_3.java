package houhou0924;

public class Test5_3 {
    public static void main(String[] args) {
        for (int i = 101; i <=200; i++) {
            if (check(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean check(int date){
        for (int i = 2; i <=date/2; i++) {
            if (date%i==0){
                return false;
            }
        }
        return true;
    }
}
