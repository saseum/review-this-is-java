package com.whatkinda.ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setContent("Hello");

        System.out.println("box.getContent() = " + box.getContent());
        
        Box<Integer> box2 = new Box<>();
        box2.setContent(123);

        System.out.println("box2.getContent() = " + box2.getContent());
    }
}
