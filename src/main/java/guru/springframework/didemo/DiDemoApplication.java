package guru.springframework.didemo;

import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController c = (MyController) ctx.getBean("myController");
		c.hello();

		System.out.println(ctx.getBean(GreetingServiceImpl.class).sayHello());
	}
}
