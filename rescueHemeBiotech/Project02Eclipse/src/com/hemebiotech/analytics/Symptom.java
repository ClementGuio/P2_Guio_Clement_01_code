package com.hemebiotech.analytics;

/**
 * Symptom is characterized by a name and a number of occurrences.
 * This class is mainly used by MapSymptoms.
 * It implements Comparable to set the order returned by Collections.sort()
 * 
 * @see MapSymptoms
 * 
 * @author Clément Guio
 *
 */
public class Symptom implements Comparable<Symptom> {
	private final String name;
	private Integer nbOccurences;
	
	/**
	 * Constructor of a symptom
	 * Set nbOccurences at 1
	 * 
	 * @param name of a symptom
	 */
	public Symptom(String name) {
		this.name = name;
		this.nbOccurences = 1;
	}
	
	/**
	 * Return the name of this symptom
	 * 
	 * @return name of this symptom
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Return the number of occurences
	 * 
	 * @return nbOcurrences of this symptom
	 */
	public int getNbOccurences() {
		return this.nbOccurences;
	}
	
	/**
	 * Set the number of occurences at nbOccurences
	 * 
	 * @param nbOccurences
	 */
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
	}
}
