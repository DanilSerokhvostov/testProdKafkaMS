package com.example.kafkaprod.service;

import com.example.kafkaprod.model.Massage;

public interface MassageGenerator {

    Massage generateMassage(int minLength, int maxLength);
}
