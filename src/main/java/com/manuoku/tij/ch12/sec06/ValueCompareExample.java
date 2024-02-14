package com.manuoku.tij.ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        // ~128~127 초과값일 경우
        Integer obj1 = 300;
        Integer obj2 = 300;

        System.out.println("obj1 == obj2 = " + (obj1 == obj2));
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
        System.out.println();

        // -128~127 범위값일 경우

        Integer obj3 = 120;
        Integer obj4 = 120;

        System.out.println("(obj3 == obj4) = " + (obj3 == obj4));
        System.out.println("obj3.equals(obj4) = " + obj3.equals(obj4));
    }
}
