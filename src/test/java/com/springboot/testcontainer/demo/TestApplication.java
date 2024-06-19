package com.springboot.testcontainer.demo;

import com.springboot.testcontainer.demo.config.ContainersConfig;
import org.springframework.boot.SpringApplication;

public class TestApplication {
    public static void main(String[] args) {
        SpringApplication
                .from(Application::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
