package com.example.demo.Component.Guangbiao;

import java.net.Socket;

public class shutdown {
    public void shutdown() throws Exception {

        String host = "10.10.100.254";
        int port = 8989;

        Socket socket = new Socket(host,port);

        System.out.println("=======断开测试========");

        exit e = new exit();
        e.exit(socket);
    }
}
