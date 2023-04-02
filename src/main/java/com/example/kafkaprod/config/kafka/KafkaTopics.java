package com.example.kafkaprod.config.kafka;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class KafkaTopics {

  @Value("${topics.massageTopic}")
  private String massageTopic;
}
