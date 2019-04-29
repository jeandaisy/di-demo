package guru.springframework.didemo.controllers;

import guru.springframework.didemo.Controllers.ConstructorInjectedController;
import guru.springframework.didemo.Service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.Hallelujah, constructorInjectedController.sayHello());
    }
}
