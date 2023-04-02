package com.example.kafkaprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class KafkaProdApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProdApplication.class, args);
    }

}
