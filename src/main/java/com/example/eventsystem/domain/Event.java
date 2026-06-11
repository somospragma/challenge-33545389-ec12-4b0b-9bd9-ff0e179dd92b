package com.example.eventsystem.domain;

import java.time.Instant;

public record Event(String type, Instant timestamp, String origin, String data) {}