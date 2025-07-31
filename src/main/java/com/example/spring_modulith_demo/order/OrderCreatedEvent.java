package com.example.spring_modulith_demo.order;

import java.util.UUID;

public record OrderCreatedEvent(UUID orderId) {}
