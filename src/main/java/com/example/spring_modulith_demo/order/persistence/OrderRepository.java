package com.example.spring_modulith_demo.order.persistence;

import com.example.spring_modulith_demo.order.model.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

  private final Map<UUID, Order> orders = new ConcurrentHashMap<>();

  public Order save(Order order) {
    orders.put(order.id(), order);
    return order;
  }

  public List<Order> findAll() {
    return new ArrayList<>(orders.values());
  }
}
