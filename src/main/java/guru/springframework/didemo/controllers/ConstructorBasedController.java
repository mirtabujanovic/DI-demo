package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedController {

    private GreetingService greetingService;

    public ConstructorBasedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String controllerSaysHello() {
        return greetingService.sayHello();
    }
}
