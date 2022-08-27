package com.greetingapp.service;

import com.greetingapp.Entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    String template = "Hello %s";
    AtomicLong counter = new AtomicLong();

    public User getMessage(){
        return new User((int) counter.incrementAndGet(), String.format(template,"Dnyandeo"));
    }
}
