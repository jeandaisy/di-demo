package guru.springframework.didemo.Service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Hallelujah - I was injected via the constructor";
    }
}
