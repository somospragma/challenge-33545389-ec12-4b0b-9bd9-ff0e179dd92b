package com.example.eventsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Configuration
public class ErrorHandlingConfig {
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder().onErrorResume(throwable -> Mono.error(new RuntimeException("Error handling event")));
    }
}