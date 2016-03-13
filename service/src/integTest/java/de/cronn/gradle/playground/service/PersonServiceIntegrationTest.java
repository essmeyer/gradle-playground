package de.cronn.gradle.playground.service;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import de.cronn.gradle.playground.Person;

public class PersonServiceIntegrationTest {
	@Test
	public void testEmpyDbReturnsNull() {
		PersonService classUnderTest = new PersonServiceInMemoryImpl();
		assertNull(classUnderTest.find("foo"));
	}

	@Test
	public void testDelete() {
		PersonService classUnderTest = new PersonServiceInMemoryImpl().add(new Person("Essmeyer"));
		assertNotNull(classUnderTest.delete("Essmeyer"));
	}
}
