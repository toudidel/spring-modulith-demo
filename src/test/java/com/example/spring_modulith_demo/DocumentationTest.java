package com.example.spring_modulith_demo;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class DocumentationTest {
  ApplicationModules modules = ApplicationModules.of(SpringModulithDemoApplication.class);

  @Test
  void writeDocumentation() {
    new Documenter(modules)
        .writeModulesAsPlantUml()
        .writeIndividualModulesAsPlantUml()
        .writeAggregatingDocument();
  }
}
