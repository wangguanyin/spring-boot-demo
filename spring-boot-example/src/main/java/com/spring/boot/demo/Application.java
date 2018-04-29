package com.spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.spring.boot.demo.controller","com.spring.boot.demo.filter"})
@EnableAutoConfiguration()
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
