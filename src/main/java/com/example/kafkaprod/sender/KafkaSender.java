package com.example.kafkaprod.sender;


import com.example.kafkaprod.model.Massage;

public interface KafkaSender {

  void send(Massage massage);

}
