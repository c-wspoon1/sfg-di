package weatherspoon.springframework.stgdi.Services;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
