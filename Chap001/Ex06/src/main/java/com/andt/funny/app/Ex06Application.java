package com.andt.funny.app;

import java.util.Locale;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.andt.funny.app.service.AppService;

@SpringBootApplication
public class Ex06Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppService.class);
		
		var arg = new Object[] {"An", "18"};
		
		System.out.println(context.getMessage("greeting", arg, new Locale("vn")));
		System.out.println(context.getMessage("greeting", arg, new Locale("en")));
	}

}
