package guru.springframework.didemo.Service;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cn")
@Primary
public class PrimarySpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "你好";
    }
}
