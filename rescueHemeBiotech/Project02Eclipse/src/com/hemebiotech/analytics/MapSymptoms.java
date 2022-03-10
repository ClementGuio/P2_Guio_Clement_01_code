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
	
	@Override
	public String toString() {
		String str = "";
		for (Symptom sy : this.values()) {
			str += sy+"\n";
		}
		return str;
	}
}
