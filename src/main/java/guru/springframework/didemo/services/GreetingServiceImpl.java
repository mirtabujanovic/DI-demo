package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return  "Hello Gurus!!!";
    }
}
