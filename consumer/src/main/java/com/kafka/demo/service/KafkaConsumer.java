package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "topic-group-2")
    public void listener(String message) {
        System.out.println("Message Received :::" + message);
    }
}
