package 夏梓豪.实验9;
class Point{
    int x,y;
    Point(int a,int b){
        x=a;
        y=b;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Point p1,p2;
        p1 = new Point(10,10);
        p2 = new Point(23,25);
        System.out.println(p1.x);
        System.out.println(p2.y);
    }
}
