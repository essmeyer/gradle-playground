package de.cronn.gradle.playground.service;

import org.junit.Test;

import de.cronn.gradle.playground.service.PersonService;

import static org.junit.Assert.*;

public class PersonServiceTest {
	@Test
	public void testEmpyDbReturnsNull() {
		PersonService classUnderTest = new PersonServiceInMemoryImpl();
		assertNull(classUnderTest.find("foo"));
	}
}
