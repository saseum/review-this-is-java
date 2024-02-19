package com.whatkinda.ch19.sec06;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonExample {
    public static void main(String[] args) throws IOException {
        JSONObject root = new JSONObject();

        root.put("id", "winter");
        root.put("name", "한겨울");
        root.put("age", 30);
        root.put("human", true);

        JSONObject tel = new JSONObject();
        tel.put("home", "02-123-1234");
        tel.put("mobile", "010-1234-1234");

        root.put("tel", tel);

        JSONArray skill = new JSONArray();
        skill.put("java");
        skill.put("spring");
        skill.put("dart");
        skill.put("javascript");
        skill.put("redis");
        root.put("skill", skill);

        String json = root.toString();

        System.out.println("json = " + json);

        // 파일 출력
        Writer writer = new FileWriter("/Volumes/MX500/winter.json", Charset.forName("UTF-8"));
        writer.write(json);
        writer.flush();
        writer.close();
    }
}
