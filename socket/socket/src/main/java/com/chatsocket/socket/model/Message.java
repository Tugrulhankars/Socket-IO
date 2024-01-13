package com.chatsocket.socket.model;

import lombok.Data;


public class Message {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
