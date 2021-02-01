package weatherspoon.springframework.stgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import weatherspoon.springframework.stgdi.Services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    //@Autowired optional for constructors
    public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
