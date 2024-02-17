package com.manuoku.tij.ch14.sec07.exam03;

public class PrintThread extends Thread {
    @Override
    public void run() {
        while (true) {
            if (Thread.interrupted()) {
                System.out.println("Thread interrupted 발생");
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
