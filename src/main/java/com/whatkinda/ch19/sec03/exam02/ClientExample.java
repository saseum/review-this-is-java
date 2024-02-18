package com.whatkinda.ch19.sec03.exam02;

import java.io.IOException;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        try {
            // 소켓 생성과 동시에 localhost 의 50001 Port 로 연결 요청
            Socket socket = new Socket("localhost", 50001);

            System.out.println("[클라이언트] 연결 성공");

            // 소켓 닫기
            socket.close();
            System.out.println("[클라이언트] 연결 끊음");
        } catch (IOException e) {

        }


    }
}
