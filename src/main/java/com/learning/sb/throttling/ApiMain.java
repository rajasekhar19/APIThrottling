package com.learning.sb.throttling;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication  //from spring-boot-autoconfigure ->spring-boot-starter-web
@OpenAPIDefinition      //springdoc-openapi-webmvc-core
@EnableScheduling       //from spring-context ->spring-boot-starter-web
public class ApiMain {
    public static void main(String[] args) {
        SpringApplication.run(ApiMain.class, args);
    }
}
