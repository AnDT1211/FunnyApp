package com.andt.funny.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.andt.funny.app.model.SmallApp;
import com.andt.funny.app.service.AppService;

@SpringBootApplication
public class Ex05Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppService.class);
		System.out.println(context.getBean(SmallApp.class));
	}

}
