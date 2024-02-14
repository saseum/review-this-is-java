package com.manuoku.tij.ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        Member member = new Member("winter", "눈송이", 25);

        System.out.println(member.id()); // getter 메소드 호출
        System.out.println(member.toString());

        Member m1 = new Member("winter", "눈송이", 25);

        System.out.println(member.equals(m1));
        System.out.println(m1.hashCode());
        System.out.println(member.hashCode());

    }
}
