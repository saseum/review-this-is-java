package com.manuoku.tij.ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        System.out.println("now.format(dtf) = " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("result1.format(dtf) = " + result1.format(dtf));

        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("result2.format(dtf) = " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("result3.format(dtf) = " + result3.format(dtf));
    }
}
