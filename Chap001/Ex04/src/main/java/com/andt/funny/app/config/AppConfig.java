package com.andt.funny.app.config;

import org.springframework.context.annotation.ComponentScan;

import com.andt.funny.app.model.Cat;

@ComponentScan(basePackageClasses = Cat.class)
public class AppConfig {

}
