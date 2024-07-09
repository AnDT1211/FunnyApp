package com.andt.funny.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.andt.funny.app.config.AppConfig;
import com.andt.funny.app.service.PetStoreService;

@SpringBootApplication
public class Ex03Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PetStoreService petService = context.getBean(PetStoreService.class);
		petService.feeding();
		petService.swim();
	}

}
