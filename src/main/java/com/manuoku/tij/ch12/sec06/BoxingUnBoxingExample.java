package com.manuoku.tij.ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;  // boxing
        System.out.println("obj = " + obj.intValue());
        
        int value = obj;    // unboxing
        System.out.println("value = " + value);
        
        int result = obj + 100; // 연산시 언박싱
        System.out.println("result = " + result);
    }
}
