package com.spring.boot.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
