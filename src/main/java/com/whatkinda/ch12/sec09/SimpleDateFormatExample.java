package com.whatkinda.ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println("sdf.format(now) = " + sdf.format(now));

        sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println("sdf.format(now) = " + sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println("sdf.format(now) = " + sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 D번째 날");
        System.out.println("sdf.format(now) = " + sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 d번째 날");
        System.out.println("sdf.format(now) = " + sdf.format(now));
    }
}
