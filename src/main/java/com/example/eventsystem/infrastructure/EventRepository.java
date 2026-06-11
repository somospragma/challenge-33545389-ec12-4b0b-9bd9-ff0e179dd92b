package com.example.eventsystem.infrastructure;

import com.example.eventsystem.domain.Event;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EventRepository {
    Mono<Event> save(Event event);
    Flux<Event> findAll();
}