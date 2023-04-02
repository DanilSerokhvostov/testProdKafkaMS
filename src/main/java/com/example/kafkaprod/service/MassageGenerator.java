package com.example.kafkaprod.service;

import java.util.Map;

public interface MassageGenerator {

    Map<String, String> generateMassage(int minLength, int maxLength);
}
