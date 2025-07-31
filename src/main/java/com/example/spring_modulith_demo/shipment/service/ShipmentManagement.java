package com.example.spring_modulith_demo.shipment.service;

import com.example.spring_modulith_demo.order.OrderCreatedEvent;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.modulith.moments.HourHasPassed;
import org.springframework.modulith.moments.support.TimeMachine;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ShipmentManagement {

  private final ShipmentService shipmentService;
  private final TimeMachine timeMachine;

  @ApplicationModuleListener
  public void onOrderCreated(OrderCreatedEvent event) throws InterruptedException {
    Thread.sleep(5000);
    shipmentService.send(event.orderId());
    log.info("Current time is " + timeMachine.now().toString());
    timeMachine.shiftBy(Duration.ofHours(3));
  }

  @ApplicationModuleListener
  public void onHourHasPassed(HourHasPassed event) throws InterruptedException {
    log.info("Hour has passed. Now is: " + event.getTime().toString());
  }
}
