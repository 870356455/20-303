package houhou0924;

public class Test5_2 {
    public static void main(String[] args) {
        int count = 0;
        OUT://为外部循环指定标签
        for (int i = 101; i <=200 ; i++) {

            for (int j = 2; j <= i/2 ; j++) {
                if (i%j==0){
                    continue OUT;
                }
            }
            count++;
            System.out.print(i+" ");
        }
        System.out.println("素数的个数是："+count);
    }
}
