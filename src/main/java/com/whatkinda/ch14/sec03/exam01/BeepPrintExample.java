package com.whatkinda.ch14.sec03.exam01;

import java.awt.*;

/**
 * 메인스레드가 동시에 두가지 작업을 처리할 수 없음을 보여주는 예제
 * */
public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
