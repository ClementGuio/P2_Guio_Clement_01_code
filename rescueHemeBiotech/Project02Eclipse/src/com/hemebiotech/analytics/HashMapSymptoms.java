package com.hemebiotech.analytics;

import java.util.HashMap;

public class HashMapSymptoms extends HashMap<Symptom, Integer> {
	
	public HashMapSymptoms() {
		super();
	}
	
	@Override
	public boolean containsKey(Object key){
		if (!validKey(key)){
			return false;   //EXCEPTION
		}
		Symptom sy = (Symptom) key;
		for (Symptom s : super.keySet()){
			if (s.equals(sy)){
				return true;
			}
		}
		return false;
	}
	
	public boolean validKey(Object obj){
		if (obj == null) return false;
		if (obj instanceof Symptom) return true;
		return false;
	}


}
