package com.manuoku.tij.ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        int amPm = now.get(Calendar.AM_PM);
        System.out.println("amPm = " + amPm);
    }
}
