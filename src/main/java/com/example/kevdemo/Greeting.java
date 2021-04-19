package com.example.kevdemo;

public class Greeting {


    private final String content;
    private final String timestamp;

    public Greeting(String content, String timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }
}