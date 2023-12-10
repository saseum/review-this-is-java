package com.manuoku.tij.ch03.sec05;

/*
*   나눗셈 연산 후 NaN 과 Infinity 처리
* */
public class InfinityAndNanCheckExample {

    public static void main(String[] args) {
        /*
        * 좌측 피 연산자가 실수이거나 우측 피연산자가 0.0 또는 0.0f 이면 예외 발생하지 않고 연산 결과가 Infinity(무한대) 또는 NaN(Not a Number) 가 됨.
        * */

        int x = 5;
        double y = 0.0;
        double z = x / y;
        double z2 = x % y;

        // bad code
        System.out.println(z + 2);

        // correct code
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else System.out.println(z + 2);

        System.out.println("Finite check : " + Double.isFinite(y));
    }
}
