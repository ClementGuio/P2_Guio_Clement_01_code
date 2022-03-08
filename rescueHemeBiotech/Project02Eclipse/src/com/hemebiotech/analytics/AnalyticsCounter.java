package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {

		HashMapSymptoms mapSy = new HashMapSymptoms();
		
		BufferedReader reader;
		try{
			reader = new BufferedReader (new FileReader("symptoms.txt"));
		
			try{
				String line = reader.readLine();
		
				while (line != null){
					mapSy.put(new Symptom(line),1);
					line = reader.readLine();
				}
				reader.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		
		}catch (FileNotFoundException f){
			f.printStackTrace();
		}
		

		ArrayList<Symptom> sortedSymptoms = mapSy.sortedSymptoms();
		/*
		for (Symptom s : sortedSymptoms){
			System.out.println(s+" : "+mapSy.get(s));
		}*/
				
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		for (Symptom s : sortedSymptoms) {
			writer.write(s.getName()+" : "+mapSy.get(s)+"\n");
		}
		writer.close();
	}
}
