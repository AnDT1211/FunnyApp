package com.andt.funny.app.config;

import org.springframework.context.annotation.ComponentScan;

import com.andt.funny.app.model.Animal;
import com.andt.funny.app.service.PetStoreService;

@ComponentScan(basePackageClasses = {Animal.class, PetStoreService.class})
public class AppConfig {

}
