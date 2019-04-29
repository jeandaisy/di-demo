package guru.springframework.didemo.Controllers;

import guru.springframework.didemo.Service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String hello(){
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();

    }
}
