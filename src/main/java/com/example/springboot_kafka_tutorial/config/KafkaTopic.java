package com.example.springboot_kafka_tutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    @Bean
    public NewTopic exampleTopic(){
        return TopicBuilder.name("example")
                .build();

        //bin/kafka-console-producer.sh --topic example --bootstrap-server localhost:9092
        //bin/kafka-console-consumer.sh --topic example --from-beginning --bootstrap-server localhost:9092
    }
    @Bean
    public NewTopic exampleJsonTopic() {
        return TopicBuilder.name("example_json")
                .build();
    }
}
