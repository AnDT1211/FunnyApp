package com.andt.funny.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.andt.funny.app.model.Car;

@Configuration
public class CarConfig {

	@Bean
	public Car lexus() {
		return new Car("Lexus", "Toyota");
	}

	@Bean("bestCar")
	public Car car() {
		return new Car("Duc Dua", "Vinfast");
	}

}
