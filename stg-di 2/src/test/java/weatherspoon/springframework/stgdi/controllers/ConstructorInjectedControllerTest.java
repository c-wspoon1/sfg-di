package weatherspoon.springframework.stgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weatherspoon.springframework.stgdi.Services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
    controller = new ConstructorInjectedController(new ConstructorGreetingService());  //Using setter to inject greeting service implementation
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}

//Most Preferred
//cleanest