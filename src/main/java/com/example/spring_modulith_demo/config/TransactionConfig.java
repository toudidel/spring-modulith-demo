package com.example.spring_modulith_demo.config;

import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class TransactionConfig {

  @Bean
  public PlatformTransactionManager transactionManager() {
    return new ResourcelessTransactionManager();
  }
}
