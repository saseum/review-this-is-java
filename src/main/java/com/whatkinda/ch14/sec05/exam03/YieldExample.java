package com.whatkinda.ch14.sec05.exam03;

public class YieldExample {
    public static void main(String[] args) throws InterruptedException {
        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start();

        Thread.sleep(5000);
        workThreadA.work = false;

        Thread.sleep(10000);
        workThreadA.work = true;
    }
}
