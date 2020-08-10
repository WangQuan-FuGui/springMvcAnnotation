package com.drem.controller;

import com.drem.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    public HelloController(){
        System.out.println("HelloController...");
    }
    @Autowired
    private HelloService service;

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        System.out.println("ssssssss");
        return "sssssss";
    }
}
