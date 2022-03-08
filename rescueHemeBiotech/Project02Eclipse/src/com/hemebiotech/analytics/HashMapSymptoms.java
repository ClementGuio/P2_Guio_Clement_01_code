package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class HashMapSymptoms extends HashMap<Symptom, Integer> {
	
	public HashMapSymptoms() {
		super();
	}
	
	@Override
	public Integer put(Symptom sy, Integer nb){
		if (containsKey(sy)){
			super.put(sy,this.get(sy)+1);
		}else{
			super.put(sy,1);
		}
		return nb;
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
	
	public ArrayList<Symptom> sortedSymptoms(){
		ArrayList<Symptom> listSymptoms = new ArrayList<Symptom>();
		
		listSymptoms.addAll(this.keySet());
		Collections.sort(listSymptoms);
		
		return listSymptoms;
	}
}
