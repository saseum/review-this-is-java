package com.whatkinda.ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("orange");

        boolean rst1 = obj1.equals(obj2);
        boolean rst2 = obj2.equals(obj3);
        System.out.println("rst1 = " + rst1);
        System.out.println("rst2 = " + rst2);

    }
}
