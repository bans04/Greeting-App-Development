package com.greetingapp.controller;
import com.greetingapp.Entity.NewUser;
import com.greetingapp.Entity.User;
import com.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//Controller class
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    String template = "hello %s";
   private final static AtomicLong counter = new AtomicLong();

   @Autowired
   private GreetingService greetingService;

    @RequestMapping("/message")
    public User greeting(@RequestParam( defaultValue = "BridgeLabz") String name){
        return new User((int) counter.incrementAndGet(), String.format(template, name));
    }

    //Call get message from GreetingService class
    @RequestMapping("/getMessage")
    public User sayHello(){
        return greetingService.getMessage();
    }

    @PostMapping("/greetingMessage")
    public User sayHello(NewUser newUser){
        return  greetingService.greetingMessage(newUser);
    }
}
