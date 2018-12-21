package com.zzy.service.impl;

import org.springframework.stereotype.Service;

import com.zzy.service.HelloWorldService;

@Service("HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
	
    public String sayHello(String name) {
    	
    	System.out.println("---------------name:"+name);
        return "Hello World! " + name;
    }
}