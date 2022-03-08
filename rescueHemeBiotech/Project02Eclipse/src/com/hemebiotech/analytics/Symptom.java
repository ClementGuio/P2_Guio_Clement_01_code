package com.hemebiotech.analytics;

public class Symptom implements Comparable<Symptom> {
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
		return name.compareTo(s.getName());
	}
	
	
}
