package com.whatkinda.ch06.sec08.exam02;

/*
* 메소드 가변길이 매개변수 연습
* */
public class ComputerExample {
    static int sum(int ... values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int result1 = sum(1, 2, 3, 4);
        int result2 = sum(1, 2, 3);
        int result3 = sum(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
