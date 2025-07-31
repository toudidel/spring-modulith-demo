package com.example.spring_modulith_demo.order;

import com.example.spring_modulith_demo.notification.service.NotificationService;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

  private final OrderRepository repository;
  private final NotificationService notificationService;

  public UUID createOrder() {
    int randomQuantity = new Random().ints(1, 10).findFirst().getAsInt();
    Order order = repository.save(new Order(UUID.randomUUID(), randomQuantity));
    notificationService.notify("Order " + order.id() + " created.");
    return order.id();
  }

  public List<Order> findAll() {
    return repository.findAll();
  }
}
