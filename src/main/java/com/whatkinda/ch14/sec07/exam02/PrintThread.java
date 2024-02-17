package com.whatkinda.ch14.sec07.exam02;

public class PrintThread extends Thread {
    @Override
    public void run() {
        System.out.println("실행 중");
        try {
            Thread.sleep(1);    // 일시정지 상태를 만듦(InterruptedException 이 발생할 수 있도록)
        } catch (InterruptedException e) {
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
