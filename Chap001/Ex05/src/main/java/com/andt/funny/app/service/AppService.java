package com.andt.funny.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.andt.funny.app.model.SmallApp;

@Configuration
@PropertySource("classpath:messages.properties")
public class AppService {

	@Value("${app.greeting}")
	private String greetingMessage;
	
	@Value("${error.page.message}")
	private String errorMessage;
	
	@Value("${app.bye:Good bye}")
	private String byeMessage;
	
	@Bean
	public SmallApp app() {
		return new SmallApp() {
			{
				setGreetingMessage(greetingMessage);
				setErrorMessage(errorMessage);
				setByeMessage(byeMessage);
			}
		};
	}
}
