package org.example;

public class Main {
    public static int tcpServerPort = 7777;

    public static void main(String[] args) throws Exception{
        new TcpServerExample(tcpServerPort);
    }
}