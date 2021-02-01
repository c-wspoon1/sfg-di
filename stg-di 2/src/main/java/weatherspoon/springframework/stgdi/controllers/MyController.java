package weatherspoon.springframework.stgdi.controllers;

import org.springframework.stereotype.Controller;
import weatherspoon.springframework.stgdi.Services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
