package com.whatkinda.ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("def")
                .insert(0, "abc")
                .delete(3, 4)
                .toString();

        System.out.println("data = " + data);
    }
}
