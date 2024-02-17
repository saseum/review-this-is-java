package com.whatkinda.ch14.sec07.exam02;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            String currThreadName = Thread.currentThread().getName();
            System.out.println("currThreadName = " + currThreadName);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        thread.interrupt(); // interrupt 메소드 호출
    }
}
