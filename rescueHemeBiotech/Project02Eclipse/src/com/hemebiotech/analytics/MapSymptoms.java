package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

/**
 * MapSymptoms associate a name with the corresponding Symptom
 * @see Symptom 
 * 
 * 
 * @author Clément Guio
 *
 */
public class MapSymptoms extends HashMap<String,Symptom> {
	
	/**
	 * Constructor of a MapSymptom
	 */
	public MapSymptoms() {
		super();
	}
	
	/**
	 * Add a symptom in this map.
	 * If nameSy is already stored, it increments the number of occurrences of this symptom.
	 * @param nameSy
	 */
	public void addSymptom(String nameSy) {
		Symptom sy = this.get(nameSy);
		if (sy==null) {
			this.put(nameSy, new Symptom(nameSy));
		}else {
			sy.setNbOccurences(sy.getNbOccurences()+1);
		}
	}
	
	/**
	 * Return a sorted list of symptoms.
	 * @return listSymptoms sort by lexicographic order
	 */
	public ArrayList<Symptom> sortedSymptoms(){
		ArrayList<Symptom> listSymptoms = new ArrayList<Symptom>();
		
		listSymptoms.addAll(this.values());
		Collections.sort(listSymptoms);
		
		return listSymptoms;
	}
	
	/**
	 * Return a sorted list of symptoms
	 * @return listSymptoms sort by their number of occurrences (if equals, sort by lexicographic order)
	 */
	public ArrayList<Symptom> sortedByNbOccurences(){
		ArrayList<Symptom> listSymptoms = new ArrayList<Symptom>();
		
		listSymptoms.addAll(this.values());
		listSymptoms.sort(
				(s1,s2) -> ((Integer)s2.getNbOccurences()).compareTo((Integer)s1.getNbOccurences()) == 0 
					? s1.getName().compareTo(s2.getName()) 
					: ((Integer)s2.getNbOccurences()).compareTo((Integer)s1.getNbOccurences()));
		return listSymptoms;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		String str = "";
		for (Symptom sy : this.values()) {
			str += sy+"\n";
		}
		return str;
	}
}
