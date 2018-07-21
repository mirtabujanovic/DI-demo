package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorBasedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PrimaryGreetingController;
import guru.springframework.didemo.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController c = (MyController) ctx.getBean("myController");
		c.hello();

		//CONSTRUCTOR BASED
		System.out.println(ctx.getBean(ConstructorBasedController.class).controllerSaysHello());
		//SETTER BASED
		System.out.println(ctx.getBean(SetterBasedController.class).sayHello());
		//PRIMARY BEAN INJECTED FOR GREETING SERVICE
		ctx.getBean(PrimaryGreetingController.class).sayHello();
	}
}
