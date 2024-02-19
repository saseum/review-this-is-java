package com.whatkinda.ch19.sec06;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ParseJsonExample {
    public static void main(String[] args) throws IOException {
        // 파일로부터 JSON 읽기
        BufferedReader br = new BufferedReader(
                new FileReader("/Volumes/MX500/winter.json", Charset.forName("UTF-8"))
        );

        String json = br.readLine();
        System.out.println("json = " + json);
        br.close();

        JSONObject root = new JSONObject(json);

        System.out.println("root.get(\"name\") = " + root.getString("name"));
        System.out.println("root.get(\"human\") = " + root.getString("id"));
        System.out.println("root.getInt(\"age\") = " + root.getInt("age"));
        System.out.println("root.getBoolean(\"human\") = " + root.getBoolean("human"));
        System.out.println();

        JSONObject tel = root.getJSONObject("tel");
        System.out.println("tel.getString(\"mobile\") = " + tel.getString("mobile"));
        System.out.println();

        JSONArray skill = root.getJSONArray("skill");
        System.out.print("my skill is... ");
        skill.toList().forEach(v -> System.out.print((String) v + ", "));
        System.out.println();
    }
}
