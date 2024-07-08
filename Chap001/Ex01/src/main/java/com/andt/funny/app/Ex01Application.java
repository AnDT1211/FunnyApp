package com.andt.funny.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.andt.funny.app.config.AnimalConfigScan;
import com.andt.funny.app.config.CarConfig;
import com.andt.funny.app.model.Animal;
import com.andt.funny.app.model.Car;

@SpringBootApplication
public class Ex01Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class, AnimalConfigScan.class);

		Car car1 = context.getBean("lexus", Car.class);
		System.out.println(car1);
		Car car2 = context.getBean("bestCar", Car.class);
		System.out.println(car2);

		Animal animal = context.getBean(Animal.class);
		System.out.println(animal);

	}

}
