package com.spring.boot.demo.filter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GloableExceptionFilterHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(){
       Map<String,Object> map=new HashMap<>();
       map.put("code","500");
       map.put("msg","亲！系统异常，请稍后重试");
       return map;
    }
}
