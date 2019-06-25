package io.pivotal.pal.tracker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${welcome.message}")
    private String value;

    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/show")
    public String show(){

        return value;
    }

}
