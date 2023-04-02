package com.example.kafkaprod.config.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import static com.fasterxml.jackson.databind.DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static com.fasterxml.jackson.databind.SerializationFeature.*;

@Configuration
public class JacksonMapperConfig {

  @Bean
  @Primary
  public ObjectMapper objectMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.findAndRegisterModules();

    JavaTimeModule javaTimeModule = new JavaTimeModule();
    mapper.registerModule(javaTimeModule);

    SimpleModule simpleModule = new SimpleModule();
    mapper.registerModule(simpleModule);

    mapper.disable(WRITE_DATES_AS_TIMESTAMPS);
    mapper.disable(FAIL_ON_UNKNOWN_PROPERTIES);
    mapper.disable(ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
    mapper.disable(FAIL_ON_EMPTY_BEANS);
    mapper.disable(WRAP_EXCEPTIONS);

    return mapper;
  }
}
