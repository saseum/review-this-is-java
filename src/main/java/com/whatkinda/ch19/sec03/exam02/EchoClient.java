package com.whatkinda.ch19.sec03.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        //Socket 생성과 동시에 localhost 의 50001 포트로 연결요청
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[클라이언트] 연결 성공");

            //데이터 보내기
            String sendMessage = "나는 자바가 좋아";
            OutputStream os = socket.getOutputStream();
            byte[] bytes = sendMessage.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

            //데이터 받기
            InputStream is = socket.getInputStream();
            bytes = new byte[1024];
            int readByteCount = is.read(bytes);
            String receivedMessage = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("[클라이언트] 데이터 받음: " + receivedMessage);

            socket.close();
            System.out.println("[클라이언트] 연결 끊음");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
