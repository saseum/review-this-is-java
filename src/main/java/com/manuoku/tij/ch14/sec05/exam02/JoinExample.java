package com.manuoku.tij.ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.start();

        try {
            sumThread.join();   // 현재 join() 을 호출한 스레드는 '메인스레드', join() 메소드를 가진 스레드는 SumThread.
        } catch (InterruptedException e) {
        }

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        System.out.println("sumThread = " + sumThread.getSum());
    }
}
