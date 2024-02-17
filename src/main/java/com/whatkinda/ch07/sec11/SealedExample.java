package com.whatkinda.ch07.sec11;

/*
* 봉인된 클래스를 상속받는 객체는 final, sealed, non-sealed 를 써줘서 어떻게 처리할 지 결정해줘야 함.
* */
public class SealedExample {
    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();
    }
}
