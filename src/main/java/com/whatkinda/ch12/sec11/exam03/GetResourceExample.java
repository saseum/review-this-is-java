package com.whatkinda.ch12.sec11.exam03;

import java.net.URL;

public class GetResourceExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        URL resource = clazz.getResource("test1.jpg");
        String path = resource.getPath();

        resource = clazz.getResource("test2.jpg");
        String path2 = resource.getPath();

        System.out.println("path = " + path);
        System.out.println("path2 = " + path2);
    }
}
