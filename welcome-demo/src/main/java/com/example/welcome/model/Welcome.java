package com.example.welcome.model;

import java.time.LocalDateTime;

public class Welcome {
    private String message;
    private LocalDateTime timestamp;

    public Welcome(String message) {
        this.message    = message;
        this.timestamp  = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
