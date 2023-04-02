package com.example.kafkaprod.scheduler.impl;

import com.example.kafkaprod.service.SendEventFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaSendMassageScheduler implements com.example.kafkaprod.scheduler.KafkaSendMassageScheduler {

    private final SendEventFacade sendEventFacade;

    @Async
    @Scheduled(fixedRateString = "${kafka.producer.send.massage.timeout}")
    public void sendMessage() {
            sendEventFacade.sendEvent();
    }
}
