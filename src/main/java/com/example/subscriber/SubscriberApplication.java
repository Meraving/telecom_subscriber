package com.example.subscriber;

import com.example.subscriber.model.PurchaseMessage;
import com.example.subscriber.repository.PurchaseMessageRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubscriberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubscriberApplication.class, args);
    }

}
