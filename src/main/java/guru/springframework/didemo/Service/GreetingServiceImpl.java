package guru.springframework.didemo.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String Hallelujah = "Hallelujah!!! - Original";

    @Override
    public String sayGreeting(){
        return Hallelujah;
    }
}
