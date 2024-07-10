package com.andt.funny.app.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class Fish {
	@PostConstruct
	public void sayHi() {
		System.out.println("fish: hello");
	}

	@PreDestroy
	public void sayBye() {
		System.out.println("fish: bye");
	}
}
