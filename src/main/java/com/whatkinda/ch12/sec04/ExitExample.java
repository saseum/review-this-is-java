package com.whatkinda.ch12.sec04;

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("== 프로그램 강제종료(정상종료)");
                System.exit(0);
            }
        }
    }
}
