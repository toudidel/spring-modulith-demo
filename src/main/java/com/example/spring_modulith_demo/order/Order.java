package com.example.spring_modulith_demo.order;

import java.util.UUID;

public record Order(UUID id, int quantity) {}
