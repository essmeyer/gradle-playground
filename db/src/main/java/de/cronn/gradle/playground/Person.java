package de.cronn.gradle.playground;

import java.util.Collections;
import java.util.List;

public class Person {
	private String name;
	private List<String> firstNames;

	public Person(String name, List<String> firstNames) {
		this.name = name;
		this.firstNames = firstNames;
	}

	public Person(String name) {
		this(name, Collections.emptyList());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFirstNames() {
		return Collections.unmodifiableList(firstNames);
	}

	public void setFirstNames(List<String> firstNames) {
		this.firstNames = firstNames;
	}
}
