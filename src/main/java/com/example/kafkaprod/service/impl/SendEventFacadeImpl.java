package com.example.kafkaprod.service.impl;

import com.example.kafkaprod.sender.KafkaSender;
import com.example.kafkaprod.service.MassageGenerator;
import com.example.kafkaprod.service.SendEventFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendEventFacadeImpl implements SendEventFacade {

    private final KafkaSender kafkaSender;
    private final MassageGenerator massageGenerator;

    @Override
    public void sendEvent() {
        kafkaSender.send(massageGenerator.generateMassage(0, 100));
    }
}
