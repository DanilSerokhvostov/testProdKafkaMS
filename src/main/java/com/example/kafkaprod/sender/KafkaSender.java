package com.example.kafkaprod.sender;


import java.util.Map;

public interface KafkaSender {

  void send(Map<String, String> massage);

}
