package com.whatkinda.ch05.sec04;

/*
* 참조타입변수는 아직 번지를 저장하고 있지 않다는 뜻으로 null 값을 가질 수 있으며,
* null 도 초기값으로 사용할 수 있기 때문에 null 로 초기화된 참조변수는 스택 영역에 생성된다.
*
* */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArr = null;
        String str = null;

        try {
            intArr[0] = 10; // NullPointerException
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(str.length());   // NullPointerException
        } catch (NullPointerException e) {
           e.printStackTrace();
        }

    }
}
