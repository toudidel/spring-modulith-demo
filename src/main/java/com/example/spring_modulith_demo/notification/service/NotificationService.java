package com.example.spring_modulith_demo.notification.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {

  public void notify(String message) {
    log.info(message);
  }
}
