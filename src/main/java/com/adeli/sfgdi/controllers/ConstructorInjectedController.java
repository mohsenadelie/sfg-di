package com.adeli.sfgdi.controllers;

import com.adeli.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

//    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    // work with @Primary
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
