package com.example.eventsystem.application;

import com.example.eventsystem.domain.Event;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class EventHandler {
    public Mono<Event> handleEvent(Event event) {
        // Lógica de manejo de eventos
        return Mono.just(event);
    }
}