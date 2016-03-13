package de.cronn.gradle.playground.service;

import de.cronn.gradle.playground.Person;

interface PersonService {
	Person find(String name);
	Person delete(String name);
}
