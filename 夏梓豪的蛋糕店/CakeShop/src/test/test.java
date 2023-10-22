package test;

import java.util.HashMap;

public class test {


    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","奶酪蛋糕");
        hashMap.put("price","12.8");
        hashMap.put("numbers","30");

        System.out.println(hashMap.get("name"));

    }
}
