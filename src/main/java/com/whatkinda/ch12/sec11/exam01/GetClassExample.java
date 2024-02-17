package com.whatkinda.ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Car.class;
        Class clazz2 = Class.forName("com.whatkinda.ch12.sec11.exam01.Car");
        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println("clazz = " + clazz);
        System.out.println("clazz2 = " + clazz2);
        System.out.println("clazz3 = " + clazz3);

        Package pkg = clazz.getPackage();
        String simpleName = clazz.getSimpleName();
        String name = clazz.getName();

        System.out.println("pkg = " + pkg.toString());
        System.out.println("simpleName = " + simpleName);
        System.out.println("name = " + name);
    }
}
