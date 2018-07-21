package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from " + this.getClass().getSimpleName();
    }
}
