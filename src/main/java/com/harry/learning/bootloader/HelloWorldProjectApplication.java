package com.harry.learning.bootloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.harry.learning")
public class HelloWorldProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldProjectApplication.class, args);
    }
}
