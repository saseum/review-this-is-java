package com.manuoku.tij.ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton.toString() = " + singleton.toString());
        System.out.println("singleton2.toString() = " + singleton2.toString());

        System.out.println("singleton eq singleton2 = " + (singleton == singleton2));
    }
}
