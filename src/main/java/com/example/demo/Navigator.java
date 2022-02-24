package com.example.demo;

public class  Navigator{
    public Navigator(String search) {
    }

    public String Nav(String Search){
        
        String Ans = ("Этаж " + Search.charAt(5)+ " Корпус " + Search.charAt(3));
        
        return Ans;
    };
}
