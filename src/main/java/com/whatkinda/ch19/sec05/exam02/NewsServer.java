package com.whatkinda.ch19.sec05.exam02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
    private static DatagramSocket datagramSocket = null;
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        System.out.println("=== 서버 종료하려면 q 입력 후 Enter 눌러주세요.");

        // UDP 서버 시작
        startServer();

        Scanner sc = new Scanner(System.in);

        while (true) {
            String key = sc.nextLine();

            if(key.toLowerCase().equals("q")) {
                break;
            }
        }

        stopServer();
    }

    private static void stopServer() {
        datagramSocket.close();
        // 스레드풀 종료
        executorService.shutdownNow();
        System.out.println("[서버] 서버 종료");
    }

    private static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    //DatagramSocket 생성 및 50001 포트 바인딩
                    datagramSocket = new DatagramSocket(50001);
                    System.out.println("[서버] 시작되었음");

                    while (true) {
                        DatagramPacket receivedPacket = new DatagramPacket(
                                new byte[1024], 1024
                        );

                        datagramSocket.receive(receivedPacket);

                        // 작업큐에 처리작업 넣기
                        executorService.execute(() -> {
                            try {
                                String newsKind = new String(receivedPacket.getData(), 0, receivedPacket.getLength(), "UTF-8");

                                //클라이언트의 IP 와 Port 얻기
                                SocketAddress socketAddress = receivedPacket.getSocketAddress();

                                for (int i = 1; i <= 10; i++) {
                                    String data = newsKind + ": 뉴스 i";
                                    byte[] bytes = data.getBytes("UTF-8");
                                    DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
                                    datagramSocket.send(sendPacket);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }
}
