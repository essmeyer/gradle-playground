package de.cronn.gradle.playground.service;

import java.util.HashMap;
import java.util.Map;

import de.cronn.gradle.playground.Person;

public class PersonServiceInMemoryImpl implements PersonService {
	private Map<String, Person> map = new HashMap<>();
	
	public PersonServiceInMemoryImpl add(Person person) {
		map.put(person.getName(), person);
		return this;
	}
	
	@Override
	public Person find(String name) {
		return null;
	}

	@Override
	public Person delete(String name) {
		return map.remove(name);
	}

}
