package com.andt.funny.app.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.ToString;

@ToString
@Component("cat")
public class Cat {
	@PostConstruct
	public void sayHi() {
		System.out.println("meow: hello");
	}

	@PreDestroy
	public void sayBye() {
		System.out.println("meow: bye");
	}
}
