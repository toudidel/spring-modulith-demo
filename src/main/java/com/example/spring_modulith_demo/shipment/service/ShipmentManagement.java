package com.example.spring_modulith_demo.shipment.service;

import com.example.spring_modulith_demo.order.OrderCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ShipmentManagement {

  private final ShipmentService shipmentService;

  @EventListener
  public void onOrderCreated(OrderCreatedEvent event) throws InterruptedException {
    Thread.sleep(5000);
    shipmentService.send(event.orderId());
  }
}
