package com.whatkinda.ch19.sec07;

import org.json.JSONObject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {

    public static void main(String[] args) {
        try {
            ChatServer chatServer = new ChatServer();
            chatServer.start();

            System.out.println("------------------");
            System.out.println("서버를 종료하려면 q를 입력하고 Enter");
            System.out.println("------------------");

            Scanner sc = new Scanner(System.in);
            while (true) {
                String key = sc.nextLine();
                if(key.toLowerCase().equals("q")) break;
            }

            sc.close();
            chatServer.stop();
        } catch (IOException e) {
            System.out.println("[서버] " + e.getMessage());

        }
    }

    ServerSocket serverSocket;
    ExecutorService threadPool = Executors.newFixedThreadPool(100);
    Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

    public void start() throws IOException {
        serverSocket = new ServerSocket(50001);
        System.out.println("[서버] 시작됨");

         Thread thread = new Thread(() -> {
             try {
                 while (true) {
                     Socket socket = serverSocket.accept();
                     SocketClient sc = new SocketClient(this, socket);
                 }
             } catch(IOException e) {}
         });

         thread.start();
    }

    // 클라이언트 연결 시 SocketClient 생성 및 추가
    public void addSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.put(key, socketClient);
        System.out.println("입장 : " + key);
        System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
    }

    // 클라이언트 연결 종료 시 SocketClient 제거
    public void removeSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.remove(key);
        System.out.println("퇴장 : " + key);
        System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
    }

    // 모든 클라이언트에게 메시지 보냄
    public void sendToAll(SocketClient sender, String message) {
        JSONObject root = new JSONObject();
        root.put("clientIp", sender.clientIp);
        root.put("chatName", sender.chatName);
        root.put("message", message);
        String json = root.toString();

        Collection<SocketClient> socketClients = chatRoom.values();
        for (SocketClient sc : socketClients) {
            if(sc == sender) continue;
            sc.send(json);
        }
    }

    public void stop() {
        try {
            serverSocket.close();
            threadPool.shutdownNow();
            chatRoom.values().stream().forEach(sc -> sc.close());
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {}
    }
}
