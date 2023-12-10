package com.manuoku.tij.ch07.sec10.exam01;

/*
* 추상 클래스(abstract class) :
* 추상 사전적 의미 : 객체들의 공통된 특성을 뽑아낸 것
* */
public abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
