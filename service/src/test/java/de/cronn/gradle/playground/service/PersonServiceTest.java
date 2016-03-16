package de.cronn.gradle.playground.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import de.cronn.gradle.playground.Person;

public class PersonServiceTest {
	@Test
	public void testEmpyDbReturnsNull() {
		PersonService classUnderTest = new PersonServiceInMemoryImpl();
		assertNull(classUnderTest.find("foo"));
	}

	@Test
	public void coverPersonInDifferentProject() {
		Person person = new Person("essmeyer");
		
		assertNotNull(person.getName());
		person.setName(null);
		assertNull(person.getName());
		assertNotNull(person.getFirstNames());
	}
	
	@Test
	public void testDelete() {
		PersonService classUnderTest = new PersonServiceInMemoryImpl().add(new Person("Essmeyer"));
		Person deletedPerson = classUnderTest.delete("Essmeyer");
		assertNotNull(deletedPerson);
		assertNotNull(deletedPerson.getFirstNames());
	}

}
