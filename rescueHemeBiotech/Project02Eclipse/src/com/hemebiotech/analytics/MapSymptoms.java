package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class MapSymptoms extends HashMap<String,Symptom> {
	
	public MapSymptoms() {
		super();
	}
	
	public void addSymptom(String nameSy) {
		Symptom sy = this.get(nameSy);
		if (sy==null) {
			this.put(nameSy, new Symptom(nameSy));
		}else {
			sy.setNbOccurences(sy.getNbOccurences()+1);
		}
	}
	
	public ArrayList<Symptom> sortedSymptoms(){
		ArrayList<Symptom> listSymptoms = new ArrayList<Symptom>();
		
		listSymptoms.addAll(this.values());
		Collections.sort(listSymptoms);
		
		return listSymptoms;
	}
	
	
	public ArrayList<Symptom> sortedByNbOccurences(){
		ArrayList<Symptom> listSymptoms = new ArrayList<Symptom>();
		
		listSymptoms.addAll(this.values());
		listSymptoms.sort(
				(s1,s2) -> ((Integer)s2.getNbOccurences()).compareTo((Integer)s1.getNbOccurences()) == 0 
					? s1.getName().compareTo(s2.getName()) 
					: ((Integer)s2.getNbOccurences()).compareTo((Integer)s1.getNbOccurences()));
		return listSymptoms;
	}
	
	@Override
	public String toString() {
		String str = "";
		for (Symptom sy : this.values()) {
			str += sy+"\n";
		}
		return str;
	}
}
