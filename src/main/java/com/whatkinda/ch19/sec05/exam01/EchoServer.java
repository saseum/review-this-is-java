package com.whatkinda.ch19.sec05.exam01;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {
    private static ServerSocket serverSocket = null;
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        System.out.println("=== 서버를 종료하려면 q 입력 후 enter 를 누르세요.");

        // TCP 서버 시작
        startServer();

        Scanner sc = new Scanner(System.in);
        while (true) {
            String key = sc.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }

        // TCP 서버 종료
        stopServer();
    }

    private static void startServer() {
        // 작업스레드 생성
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    // 서버소켓 생성 및 50001 포트 바인딩
                    serverSocket = new ServerSocket(50001);

                    System.out.println("[서버] 시작됨\n");

                    while (true) {
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        executorService.execute(() -> {
                            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                            System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함..");

                            // 데이터 받기
                            try {
                                InputStream is = socket.getInputStream();
                                byte[] bytes = new byte[1024];
                                int byteCount = is.read(bytes);
                                String received = new String(bytes, 0, byteCount, "UTF-8");
                                System.out.println("received = " + received);

                                // 데이터 보내기
                                OutputStream os = socket.getOutputStream();
                                bytes = received.getBytes("UTF-8");
                                os.write(bytes);
                                os.flush();

                                System.out.println("[서버] 받은 데이터를 다시 보냄: " + received);

                                socket.close();
                                System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }

    private static void stopServer() {
        try {
            serverSocket.close();
            executorService.shutdownNow();  // 스레드풀 종료
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
