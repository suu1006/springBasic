package com.example.springbasic.singleton;

public class StatefulService {

    // private int price; // 상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        //this.price = price; // 문제가 되는 부분
        return price;
    }

//    public int getPrice(){
//        return price;
//    }
}
