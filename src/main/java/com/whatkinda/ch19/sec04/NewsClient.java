package com.whatkinda.ch19.sec04;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class NewsClient {
    public static void main(String[] args) {

        try {
            //DatagramSocket 생성
            DatagramSocket datagramSocket = new DatagramSocket();

            //구독하고 싶은 뉴스주제 보내기
            String data = "정치";
            byte[] bytes = data.getBytes("UTF-8");
            DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost", 50001));

            datagramSocket.send(sendPacket);

            while (true) {
                //뉴스 받기
                DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                datagramSocket.receive(receivePacket);

                //문자열로 변환
                String news = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
                System.out.println("== 받은 뉴스 : " + news);

                // 10번째 뉴스 받으면 루프 종료
                if (news.contains("뉴스10")) {
                    break;
                }
            }

            datagramSocket.close();
        } catch (SocketException e) {
        } catch (UnsupportedEncodingException e) {
        } catch (IOException e) {
        }
    }
}
