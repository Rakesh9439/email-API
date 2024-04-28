package com.email.controller;

import com.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailRequest emailRequest) {
        try {
            // Log the request
            System.out.println("Received request: " + emailRequest);

            emailService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());

            return "Email sent successfully!";
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            return "Error sending email: " + e.getMessage();
        }
    }

}
