package com.hemebiotech.analytics;

public class Symptom implements Comparable<Symptom> {
	private String name;
	private int nbOccurences;
	
	public Symptom(String name) {
		this.name = name;
		this.nbOccurences = 1;
	}
	
	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getNbOccurences() {
		return this.nbOccurences;
	}
	
	//Setters
	public void setNbOccurences(int nbOccurences) {
		this.nbOccurences = nbOccurences;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Symptom s) {
		return name.compareTo(s.getName());
		//return this.nbOccurences-s.nbOccurences;
	}
	
	//EFFACER
	@Override 
	public boolean equals(Object o){
		if (this == o) return true;
		if (o == null) return true;
		if (getClass() != o.getClass()) return false;
		Symptom sy = (Symptom) o;
		return sy.getName().equals(name);
	}
	//EFFACER
	@Override
	public int hashCode(){
		return name.hashCode();
	}
}
