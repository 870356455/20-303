package 夏梓豪.实验6;

public class Test5 {
    public static void main(String[] args) {
        long sum = 0,a=8,item=a,n=12,i=1;
        for (i = 1; i <=n; i++) {
            sum+=item;
            item=item*10+a;
        }
        System.out.println(sum);
    }
}
