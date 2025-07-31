package com.example.spring_modulith_demo.notification.service;

import com.example.spring_modulith_demo.notification.NotificationFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationServiceImpl implements NotificationFacade {

  @Override
  public void notify(String message) {
    log.info(message);
  }
}
