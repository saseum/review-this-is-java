package com.whatkinda.ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double num = 1234567.89;

        // 정수 자리까지 표기
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("df.format(num) = " + df.format(num));

        // 무조건 소수 첫째자리까지 표기
        df = new DecimalFormat("#,###.0");
        System.out.println("df.format(num) = " + df.format(num));
    }
}
