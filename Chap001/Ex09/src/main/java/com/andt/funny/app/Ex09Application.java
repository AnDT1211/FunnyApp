package com.andt.funny.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.andt.funny.app.config.AppConfig;

@SpringBootApplication
public class Ex09Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean("carStatic"));
		System.out.println(context.getBean("carStatic") == context.getBean("carStatic")); 			// true
		System.out.println(context.getBean("bikeStatic"));
		System.out.println(context.getBean("bikeStatic") == context.getBean("bikeStatic")); 		// true

		System.out.println(context.getBean("carInstance"));
		System.out.println(context.getBean("carInstance") == context.getBean("carInstance")); 		// true
		System.out.println(context.getBean("bikeInstance"));
		System.out.println(context.getBean("bikeInstance") == context.getBean("bikeInstance")); 	// true

		System.out.println(context.getBean("carSpring"));
		System.out.println(context.getBean("carSpring") == context.getBean("carSpring")); 			// true
		System.out.println(context.getBean("bikeSpring"));
		System.out.println(context.getBean("bikeSpring") == context.getBean("bikeSpring")); 		// true

	}

}
