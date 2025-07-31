package com.example.spring_modulith_demo.shipment.service;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShipmentService {

  public void send(UUID orderId) {
    log.info("Order " + orderId + " sent to customer.");
  }
}
