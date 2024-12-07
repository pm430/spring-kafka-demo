package com.pm430;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "pm430-group")
    public void consume(String message) {
        System.out.println("수신 메시지: " + message);
    }

}
