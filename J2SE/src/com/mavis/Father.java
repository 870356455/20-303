package com.mavis;

public class Father {
    int age;

    public Father(int age) {
        this.age = age;
    }

    public Father() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void fun(){
        System.out.println("father fun");
    }
}

class Child extends Father{

    public Child(){
        super();
    }



//    void fun(){
//        System.out.println("child fun");
//    }

    void sfun(){
        super.fun();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.fun();
    }

}
