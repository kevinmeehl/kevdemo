package com.example.kevdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class GreetingController {

    private static final String content = "Welcome to the machine!";

    private static final String isoTimestamp(){
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ISO_TIME;
        String isoTime = timestamp.format(dtf);
        return isoTime;
    }

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(content, isoTimestamp());
    }
}