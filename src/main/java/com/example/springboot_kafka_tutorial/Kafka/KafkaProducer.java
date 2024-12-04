package com.example.springboot_kafka_tutorial.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    //we have created a kafka producer which will use kafka producer to send a message to the topic

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    //create a method which will use the afka template to send the message

    public void sendMessage(String message){
        LOGGER.info("Message sent %s",message);
        kafkaTemplate.send("example",message);
    }

    
}
