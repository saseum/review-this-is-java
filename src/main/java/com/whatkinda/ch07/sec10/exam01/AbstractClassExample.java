package com.whatkinda.ch07.sec10.exam01;

public class AbstractClassExample {
    public static void main(String[] args) {
        // 추상클래스는 직접 선언 불가. 오직 자식객체로의 상속 용도
        //Phone phone = new Phone();

        SmartPhone sp = new SmartPhone("크루저");

        System.out.println("sp.owner = " + sp.owner);
        sp.turnOn();
        sp.internetSearch();
        sp.turnOff();
    }
}
