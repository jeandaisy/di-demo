package guru.springframework.didemo.controllers;

import guru.springframework.didemo.Controllers.PropertyInjectedController;
import guru.springframework.didemo.Service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.Hallelujah,propertyInjectedController.sayHello());
    }
}
