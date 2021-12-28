package co.pragra.learning.springdemo;

import co.pragra.learning.springdemo.model.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {

		// SpringApplication.run(SpringdemoApplication.class, args);
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		System.out.println(context.getBean("car", Car.class));
	}

}
