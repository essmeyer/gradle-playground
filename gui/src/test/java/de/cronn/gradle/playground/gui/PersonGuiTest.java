package de.cronn.gradle.playground.gui;

import org.junit.Test;

import de.cronn.gradle.playground.Person;
import de.cronn.gradle.playground.gui.PersonGui;

import static org.junit.Assert.*;

import java.util.Arrays;

public class PersonGuiTest {
	@Test
	public void testSomeLibraryMethod() {
		PersonGui classUnderTest = new PersonGui();
		assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
	}
	
	@Test
	public void testPerson() throws Exception {
		Person p = new Person("essmeyer");
		p.setFirstNames(Arrays.asList("Jobst"));
		assertNotNull(p.getFirstNames());
	}
}
