package com.drem.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService(){
        System.out.println("HelloService....");
    }

    public String hello(){
        return "hello springMvc Annotation";
    }
}
