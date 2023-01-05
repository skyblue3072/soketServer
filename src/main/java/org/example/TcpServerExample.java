package org.example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerExample {
    public TcpServerExample(int portNo) throws Exception
    {
        int tcpServerPort = portNo;
            // ServerSocket 생성
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(tcpServerPort));
        System.out.println("Starting tcp Server: " + tcpServerPort);
        System.out.println("[ Waiting ]\n");
        while (true) {
            // socket -> bind -> listen socket 클래스 내부에 구현되어 있음
            Socket socket = serverSocket.accept();
            System.out.println("Connected " + socket.getLocalPort() + " Port, From " + socket.getRemoteSocketAddress().toString() + "\n");
            // Thread
            Server tcpServer = new Server(socket);
            tcpServer.run();
        }
    }
}
