package weatherspoon.springframework.stgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import weatherspoon.springframework.stgdi.Services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired      //Tells Spring we want it to inject an instance of the greeting service
    public GreetingService greetingService;

    public String getGreeting(){
       return greetingService.sayGreeting();
    }
}

