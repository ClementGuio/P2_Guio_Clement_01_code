package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class MapSymptoms extends HashMap<String,Symptom> {
	
	public MapSymptoms() {
		super();
	}
	
	public void add(String nameSy) {
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
}
