package com.whatkinda.ch13.sec03.exam01;

public class GenericExample {

    // 제네릭 메소드
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();

        box.setContent(t);

        return box;
    }

    public static void main(String[] args) {
        //제네릭 메소드 호출
        Box<Integer> box1 = boxing(100);
        int intValue = box1.getContent();
        System.out.println("intValue = " + intValue);

        //제네릭 메소드 호출
        Box<String> box2 = boxing("Hello");
        String strValue = box2.getContent();
        System.out.println("strValue = " + strValue);
    }
}
