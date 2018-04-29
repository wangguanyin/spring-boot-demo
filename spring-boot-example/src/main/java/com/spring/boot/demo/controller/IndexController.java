package com.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.put("name","张三，您好");
        map.put("sex",0);//0-男 1-女
        List<String> user=new ArrayList<>();
        user.add("李四");
        user.add("王五");
        user.add("赵六");
        map.put("userList",user);
        return "index";
    }
}
