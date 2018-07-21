package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryGreetingController {

    private GreetingService greetingService;

    public PrimaryGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println(greetingService.sayHello());
    }
}
