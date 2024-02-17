package com.whatkinda.ch12.sec07;

public class MathExample {
    public static void main(String[] args) {
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.7);

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        // 소수 이하 두자리 얻기
        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        double v3 = temp2/100.0;
        System.out.println("temp1 = " + temp1);
        System.out.println("temp2 = " + temp2);
        System.out.println("v3 = " + v3);

    }
}
