package com.whatkinda.ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "길동");
        Student s2 = new Student(1, "길동");

        HashSet hashSet = new HashSet();

        hashSet.add(s1);
        hashSet.add(s2);

        System.out.println("hashSet.size() = " + hashSet.size());
    }
}
