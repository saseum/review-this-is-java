package com.manuoku.tij.ch07.sec10.exam02;

/*
* 추상 메소드: 반드시 메소드재정의가 필요함. 내용부를 가지고 있지 않고, 선언부만 가지고 있음
* */
public abstract class Animal {

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    // 추상 메소드 정의(자식객체마다 메소드 재정의 필요)
    public abstract void sound();
}
