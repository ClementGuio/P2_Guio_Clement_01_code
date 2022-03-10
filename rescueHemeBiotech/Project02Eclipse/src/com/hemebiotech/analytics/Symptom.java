package com.hemebiotech.analytics;

public class Symptom implements Comparable<Symptom> {
	private final String name;
	private Integer nbOccurences;
	
	public Symptom(String name) {
		this.name = name;
		this.nbOccurences = 1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNbOccurences() {
		return this.nbOccurences;
	}
	
	public void setNbOccurences(int nbOccurences) {
		this.nbOccurences = nbOccurences;
	}
	
	@Override
	public String toString() {
		return name+" : "+nbOccurences;
	}
	
	@Override
	public int compareTo(Symptom s) {
		return name.compareTo(s.getName());
		//return this.nbOccurences-s.nbOccurences;
	}
}
