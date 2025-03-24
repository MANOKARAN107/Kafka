package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {

    @KafkaListener(topics = "test-topic", groupId = "topic-group-1")
    public void listenToCodeDecodeKafkaTopic(String messageReceived) {
        System.out.println("Message received is " + messageReceived);
    }
}