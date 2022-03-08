package com.hemebiotech.analytics;

public class Symptom implements Comparable<T> {
	String name;
	
	public Symptom(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Symptom s) {
		return namme.compareTo(s.getName());
	}
	
	
}
