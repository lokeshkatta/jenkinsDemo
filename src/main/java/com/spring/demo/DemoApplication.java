package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		Hello obj = (Hello) context.getBean("Hello");
        obj.printHello();
	}

}
