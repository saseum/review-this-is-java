package com.whatkinda.ch07.sec05.exam02;

public class SportsCar extends Car {

    @Override
    public void speedUp() {
        speed += 10;
    }

    /* 메소드 재정의 불가
    @Override
    public void stop() {
        System.out.println("== 스포츠카를 멈춤");
        speed = 0;
    }
    */
}
