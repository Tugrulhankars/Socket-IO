package com.chatsocket.socket.config;

import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.boot.CommandLineRunner;

public class StartupConfig implements CommandLineRunner {

    private final SocketIOServer socketIOServer;

    public StartupConfig(SocketIOServer socketIOServer) {
        this.socketIOServer = socketIOServer;
    }


    @Override
    public void run(String... args) throws Exception {
        socketIOServer.start();
    }
}
