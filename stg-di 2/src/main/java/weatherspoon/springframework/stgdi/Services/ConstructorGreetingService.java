package weatherspoon.springframework.stgdi.Services;

import org.springframework.stereotype.Service;

@Service    //Spring knows to bring an instance of this into its context
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {

        return "Hello World - Constructor";
    }
}
