package com.greetingapp.controller;
import com.greetingapp.Entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    String template = "hello %s";
   private final static AtomicLong counter = new AtomicLong();

    @RequestMapping("/message")
    public User greeting(@RequestParam( defaultValue = "BridgeLabz") String name){
        return new User((int) counter.incrementAndGet(), String.format(template, name));
    }
}
