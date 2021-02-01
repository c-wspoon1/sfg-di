package weatherspoon.springframework.stgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import weatherspoon.springframework.stgdi.controllers.*;

@SpringBootApplication
public class StgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(StgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());


		MyController myController = (MyController) ctx.getBean("myController");	//Spring provides an instance of this bean (object)------(inversion of control)
		System.out.println("-------Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-------Property");
		PropertyInjectedController propertyInjectController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectController.getGreeting());

		System.out.println("-------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
