package com.outman.engine.shit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.outman.engine.shit", "com.outman.engine.shit.web"})
public class EngineShitApplication {

    public static void main(String[] args) {
        SpringApplication.run(EngineShitApplication.class, args);
    }

}