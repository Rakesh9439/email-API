package com.email.controller;

public class EmailRequest {
    private String subject;
    private String body;
    private String to;

    // Constructor
    public EmailRequest(String subject, String body, String to) {
        this.subject = subject;
        this.body = body;
        this.to = to;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getTo() {
        return to;
    }
}
