import javax.xml.transform.Source;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Face {
    private String name;
    private List<Double> left = new ArrayList<>();
    private List<Double> right = new ArrayList<>();

    private Double distance;

    public Face() {
    }

    public Face(String name,Double leftx,Double lefty,Double rightx,Double righty) {
        this.name = name;
        this.left.add(leftx);
        this.left.add(lefty);
        this.right.add(rightx);
        this.right.add(righty);
    }

    public List<Double> getLeft() {
        return left;
    }

    public void setLeft(List<Double> left) {
        this.left = left;
    }

    public List<Double> getRight() {
        return right;
    }

    public void setRight(List<Double> right) {
        this.right = right;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写设置瞳距方法
    public void setDistance(){
        DecimalFormat df = new DecimalFormat("#.00");
        this.distance = Double.valueOf(df.format(Math.abs(this.right.get(0) - this.left.get(0))));
    }

    @Override
    public String toString() {
        return "Face{" +
                "name='" + name + '\'' +
                ", left=" + left +
                ", right=" + right +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {
        //初始化数据
        Face face1 = new Face("赵力新",3.7,5.5,5.6,5.5);
        Face face2 = new Face("王小雅",-1.7,-2.5,-3.5,-2.5);
        Face face3 = new Face("李静静",5.5,9.8,7.2,9.8);
        Face face4 = new Face("张三丰",12.7,7.9,14.9,7.9);
        face1.setDistance();
        face2.setDistance();
        face3.setDistance();
        face4.setDistance();
        Face[] faces = {face1,face2,face3,face4};

        //找出样例数据
        Face face = new Face("demo",-5.3,-7.8,-7.1,-7.8);
        face.setDistance();
        for (int i = 0; i < faces.length; i++) {
            if (faces[i].getDistance().equals(face.getDistance()) ){
                //输出信息
                System.out.println("找到啦！");
                System.out.println(faces[i]);
            }
        }
    }
}
