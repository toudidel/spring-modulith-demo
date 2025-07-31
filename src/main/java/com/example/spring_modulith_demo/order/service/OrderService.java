package com.example.spring_modulith_demo.order.service;

import com.example.spring_modulith_demo.notification.NotificationFacade;
import com.example.spring_modulith_demo.order.OrderCreatedEvent;
import com.example.spring_modulith_demo.order.model.Order;
import com.example.spring_modulith_demo.order.persistence.OrderRepository;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {

  private final ApplicationEventPublisher publisher;
  private final OrderRepository repository;
  private final NotificationFacade notificationFacade;

  //  private final ShipmentService shipmentService;

  @Transactional
  public UUID createOrder() {
    int randomQuantity = new Random().ints(1, 10).findFirst().getAsInt();
    Order order = repository.save(new Order(UUID.randomUUID(), randomQuantity));
    notificationFacade.notify("Order " + order.id() + " created.");
    publisher.publishEvent(new OrderCreatedEvent(order.id()));
    return order.id();
  }

  public List<Order> findAll() {
    return repository.findAll();
  }
}
