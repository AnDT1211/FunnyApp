package com.andt.funny.app.config;

import org.springframework.context.annotation.ComponentScan;

import com.andt.funny.app.model.Animal;

//@ComponentScan("com.andt.funny.app.model")	// or
@ComponentScan(basePackageClasses = Animal.class)
public class AnimalConfigScan {

}
