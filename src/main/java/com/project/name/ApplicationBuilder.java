package com.project.name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.project")
@EnableAutoConfiguration
public class ApplicationBuilder {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBuilder.class, args);
    }
}
