package com.andt.funny.app.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.andt.funny.app.model.Car;

@ComponentScan("com.andt.funny.app")
@Configuration
public class AppConfig {
	@Bean
	public List<Car> cars() {
		return new ArrayList<>() {
			{
				add(new Car("a", "A"));
				add(new Car("b", "B"));
				add(new Car("c", "C"));
				add(new Car("d", "D"));
			}
		};
	}
}
