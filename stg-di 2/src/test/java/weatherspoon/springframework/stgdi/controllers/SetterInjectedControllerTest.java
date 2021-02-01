package weatherspoon.springframework.stgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weatherspoon.springframework.stgdi.Services.ConstructorGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService((new ConstructorGreetingService())); //using setter to inject new greeting service implementation
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}