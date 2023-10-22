package houhou0924;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("当前选手得分为："+getAverageScore(5));
    }
    public static double getAverageScore(int number){
        int[] scores = new int[number];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length ; i++) {
            System.out.println("请您录入第"+(i+1)+"个评委的分数：");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int sum = 0;
        int max =scores[0];
        int min =scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
            if (max<scores[i]){
                max=scores[i];
            }
            if (min>scores[i]){
                min=scores[i];
            }
        }
        return 1.0*(sum-min-max)/(number-2);
    }
}
