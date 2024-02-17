package com.manuoku.tij.ch14.sec08;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // 메인스레드에서 해당 autosaveThread 를 daemon화 함
        autoSaveThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

        System.out.println("메인스레드 종료");

    }
}
