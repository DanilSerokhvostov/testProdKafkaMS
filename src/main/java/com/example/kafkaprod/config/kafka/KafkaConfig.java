package com.example.kafkaprod.config.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configuration
@RequiredArgsConstructor
public class KafkaConfig {

  @Bean
  public RecordMessageConverter messageConverter(ObjectMapper objectMapper) {
    return new StringJsonMessageConverter(objectMapper);
  }

}
