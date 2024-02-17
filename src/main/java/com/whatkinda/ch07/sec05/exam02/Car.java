package com.whatkinda.ch07.sec05.exam02;

/*
* final 클래스와 final 메소드 : 자식 클래스에서 상속 불가 및 오버라이딩 불가
* */
public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public final void stop() {
        System.out.println("== 차를 멈춤");
        speed = 0;
    }
}
