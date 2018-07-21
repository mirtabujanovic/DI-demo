package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorBasedController;
import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorBasedTest {

    private ConstructorBasedController controller;

    @Before
    public void initializeController() {
        this.controller = new ConstructorBasedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        Assert.assertEquals(GreetingService.HELLO_GURUS, controller.controllerSaysHello());
    }
}
