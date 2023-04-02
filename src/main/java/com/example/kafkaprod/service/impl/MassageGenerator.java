package com.example.kafkaprod.service.impl;

import com.example.kafkaprod.model.Massage;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class MassageGenerator implements com.example.kafkaprod.service.MassageGenerator {

    @Override
    public Massage generateMassage(int minLength, int maxLength) {
        String generatedString = RandomStringUtils.randomAlphabetic(minLength, maxLength);
        return Massage.builder()
                .word(generatedString)
                .build();
    }
}
