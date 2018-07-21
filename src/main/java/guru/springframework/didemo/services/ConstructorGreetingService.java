package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return  "Hello Gurus!!!";
    }
}
