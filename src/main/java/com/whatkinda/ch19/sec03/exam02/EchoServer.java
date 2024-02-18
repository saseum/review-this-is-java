package com.whatkinda.ch19.sec03.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("--------------------");

        //TCP 서버 시작
        startServer();

        Scanner sc = new Scanner(System.in);
        while (true) {
            String key = sc.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }
        sc.close();

        //TCP 서버 종료
        stopServer();
    }

    public static void startServer() {
        //작업 스레드 정의
        Thread thread = new Thread() {
            @Override
            public void run() {
                // 서버소켓 생성 및 포트 바인딩
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");

                    // 연결 수락 및 데이터 통신
                    while (true) {
                        System.out.println("\n[서버] 연결 요청을 기다림\n");

                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트 정보 얻기
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");

                        //데이터 받기
                        InputStream is = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int readByteCount = is.read(bytes);
                        String message = new String(bytes, 0, readByteCount, "UTF-8");
                        System.out.println("[서버] 받은 데이터: " + message);

                        //데이터 보내기
                        OutputStream os = socket.getOutputStream();
                        bytes = message.getBytes("UTF-8");
                        os.write(bytes);
                        os.flush();
                        System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);

                        //연결 끊기
                        socket.close();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");

                    }
                } catch (IOException e) {
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };

        // 스레드 시작
        thread.start();
    }

    public static void stopServer() {
        try {
            // ServerSocket 닫고 Port 언바인딩
            serverSocket.close();
        } catch (IOException e) {
        }
    }

}
