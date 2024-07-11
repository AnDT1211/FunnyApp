package com.andt.funny.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.andt.funny.app.model.Car;
import com.andt.funny.app.processor.CustomBeanProcessor;

@Configuration
@ComponentScan(basePackageClasses = {Car.class, CustomBeanProcessor.class})
public class AppConfig {
	@Bean("vinfast")
	Car vinCar() {
		return new Car() {
			{
				setName("VinFast");
			}
		};
	}
	
	@Bean("annonymousCar")
	Car annoCar() {
		return new Car() {
			{
				setName("unknown");
			}
		};
	}
}
