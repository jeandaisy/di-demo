package guru.springframework.didemo.Service;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Hallelujah - Primary Greeting Service";
    }
}

