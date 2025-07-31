package com.example.spring_modulith_demo.order;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

  private final OrderService service;

  @PostMapping
  public ResponseEntity<UUID> createOrder() {
    return ResponseEntity.ok(service.createOrder());
  }

  @GetMapping
  public ResponseEntity<List<Order>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }
}
