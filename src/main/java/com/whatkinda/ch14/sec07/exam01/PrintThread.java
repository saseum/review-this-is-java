package com.whatkinda.ch14.sec07.exam01;

public class PrintThread extends Thread {
    private boolean isStop;

    public void setStop(boolean isStop) {
        this.isStop = isStop;
    }

    @Override
    public void run() {
        while (!isStop) {
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
