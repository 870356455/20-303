package cakeshop;

import java.util.List;

public class Cake{
    //蛋糕品种
    private String name;
    //蛋糕价格
    private Double price;
    //库存数量
    private Integer number;

    public Cake() {
    }

    public Cake(String name, Double price, Integer number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return " 蛋糕信息{" +
                "品种='" + name + '\'' +
                ", 单价=" + price +
                ", 库存=" + number +
                '}'+"\n";
    }

}

