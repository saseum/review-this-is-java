package com.whatkinda.ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String javaHome = System.getProperty("java.home");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String javaVersion = System.getProperty("java.specification.version");

        System.out.println("osName = " + osName);
        System.out.println("javaHome = " + javaHome);
        System.out.println("javaVersion = " + javaVersion);
        System.out.println("userName = " + userName);
        System.out.println("userHome = " + userHome);

        Properties props = System.getProperties();
        Set keys = props.keySet();  // 강제형변환 안됨: 강제형변환이란? 부모가 자식 타입 따라가는거 (casting) , 반대는 promotion, 자동형변환
        for (Object key : keys) {
            String k = (String) key;
            String v = (String) props.get(key);

            System.out.print("key = " + k);
            System.out.println(", value = " + v);
        }

    }
}
