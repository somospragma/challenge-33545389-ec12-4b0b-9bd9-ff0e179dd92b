package com.example.eventsystem.application;

import com.example.eventsystem.domain.Event;
import com.example.eventsystem.infrastructure.EventRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Mono<Event> saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public Flux<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}