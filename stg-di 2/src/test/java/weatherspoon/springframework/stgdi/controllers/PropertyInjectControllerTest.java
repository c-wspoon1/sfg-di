package weatherspoon.springframework.stgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weatherspoon.springframework.stgdi.Services.ConstructorGreetingService;

class PropertyInjectControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();                //creating new PorpI controller

        controller.greetingService = new ConstructorGreetingService();     //Accessing directly w/ greeting serice implementation

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}

//Least preferred method