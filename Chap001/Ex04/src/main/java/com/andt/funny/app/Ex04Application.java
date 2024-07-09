package com.andt.funny.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.andt.funny.app.config.AppConfig;
import com.andt.funny.app.model.Cat;
import com.andt.funny.app.model.Dog;

@SpringBootApplication
public class Ex04Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Cat c1 = context.getBean(Cat.class);
		Cat c2 = context.getBean(Cat.class);
		System.out.println(c1 == c2);
		
		Dog d1 = context.getBean(Dog.class);
		Dog d2 = context.getBean(Dog.class);
		System.out.println(d1 == d2);
	}

}
