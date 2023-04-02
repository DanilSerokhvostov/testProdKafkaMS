package com.example.kafkaprod.sender.impl;

import com.example.kafkaprod.config.kafka.KafkaTopics;
import com.example.kafkaprod.model.Massage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaSender implements com.example.kafkaprod.sender.KafkaSender {

  private final KafkaTemplate<String, Massage> kafkaTemplate;
  private final KafkaTopics kafkaTopics;

  @Override
  public void send(Massage massage) {
    String massagedTopic = kafkaTopics.getMassageTopic();
    kafkaTemplate.send(massagedTopic, massage);
  }
}
