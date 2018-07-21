package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("hr")
public class PrimaryCroatianGreetingService implements GreetingService{

    @Override
    public String sayHello() {
        return "Bok iz hrvatskog Greeting Service-a!";
    }
}
