package com.andt.funny.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.andt.funny.app.model.Cat;
import com.andt.funny.app.model.Dog;
import com.andt.funny.app.service.PetStore;

@Configuration
@ComponentScan(basePackageClasses = { Cat.class, PetStore.class })
public class AppConfig {

	@Bean(initMethod = "sayHi", destroyMethod = "sayBye")
	Dog dog() {
		return new Dog();
	}
}
