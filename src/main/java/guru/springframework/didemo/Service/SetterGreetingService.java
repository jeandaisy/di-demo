package guru.springframework.didemo.Service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){

        return "Hallelujah - I was injected by the setter";
    }
}
