package houhou0924;

/**
 打印三角形
 计算机本质只能打印行，所以按照行思考
 行（i）   先打空格（n-i）    再打星星    换行
 1          3               1
 2          2               3
 3          1               5
 4          0               7
 */
public class Test7 {
    public static void main(String[] args) {
        //1.定义行循环
        int n=5;
        for (int i = 1; i<=n; i++) {
            //2.控制空格打印
            for (int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            //3.控制星星打印
            for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("*");
            }
            //4.换行
            System.out.println();
        }
    }
}
