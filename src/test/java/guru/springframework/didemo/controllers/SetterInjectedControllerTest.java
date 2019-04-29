package guru.springframework.didemo.controllers;

import guru.springframework.didemo.Controllers.SetterInjectedController;
import guru.springframework.didemo.Service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.Hallelujah,setterInjectedController.sayHello());
    }
}
