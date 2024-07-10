package com.andt.funny.app.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@DependsOn({ "cat", "dog" })
public class PetStore {
	@PostConstruct
	public void sayHi() {
		System.out.println("petStore: hello");
	}

	@PreDestroy
	public void sayBye() {
		System.out.println("petStore: bye");
	}
}
