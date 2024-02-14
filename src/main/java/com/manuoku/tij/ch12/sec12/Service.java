package com.manuoku.tij.ch12.sec12;

public class Service {

    @PrintAnnotation
    public void method1() {
        System.out.println("실행내용 1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("실행내용 2");
    }

    @PrintAnnotation(value = "#", number = 5)
    public void method3() {
        System.out.println("실행내용 3");
    }
}
