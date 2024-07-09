package com.andt.funny.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.andt.funny.app.model.Animal;
import com.andt.funny.app.model.Fish;

@Component
public class PetStoreService {
	@Autowired
	@Qualifier("cat")
	private Animal dog;

	@Autowired
	private Animal cat;

	@Autowired(required = false)
	private Fish fish;

	public void feeding() {
		System.out.println(dog);
		System.out.println(cat);
	}

	public void swim() {
		System.out.println(fish);
	}
}
