package de.cronn.gradle.playground;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;

import de.cronn.gradle.playground.Person;


public class PersonTest {
	@Test
	public void testGetName() {
		Person person = new Person("Kennedy", Arrays.asList("John", "Fitzgerald"));
		assertEquals(person.getName(), "Kennedy");
	}
}
