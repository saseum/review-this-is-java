package com.manuoku.tij.ch12.sec11.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParams(parameters);
            System.out.print("), ");
        }
        System.out.println("\n");

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println("\n");

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.print(method.getName() + "(");
            Class[] params = method.getParameterTypes();
            printParams(params);
            System.out.print("), ");
        }


    }

    private static void printParams(Class[] params) {
        int len = params.length;
        int idx = 0;
        for (Class param : params) {
            idx++;
            System.out.print(param.getName());
            if(idx == len-1) System.out.print(", ");
        }

    }
}
