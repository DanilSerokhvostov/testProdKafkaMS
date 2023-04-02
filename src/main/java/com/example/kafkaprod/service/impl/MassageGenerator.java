package com.example.kafkaprod.service.impl;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class MassageGenerator implements com.example.kafkaprod.service.MassageGenerator {

    @Override
    public Map<String, String> generateMassage(int minLength, int maxLength) {
        String generatedString = RandomStringUtils.randomAlphabetic(minLength, maxLength);
        return Collections.singletonMap("word", generatedString);
    }
}
