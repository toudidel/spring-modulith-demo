package com.example.spring_modulith_demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

@Slf4j
public class ModularityTest {

  ApplicationModules modules = ApplicationModules.of(SpringModulithDemoApplication.class);

  @Test
  void verifyModularity() {
    log.info(modules.toString());

    modules.verify();
  }
}
