package com.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/test")
    public String exception(){
        int i=1/0;
        return "success";
    }
}
