package com.spring.boot.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个springboot入门
 */
@RestController
public class SampleController {
    /*//启动Springboot
    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);
    }*/

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

}
