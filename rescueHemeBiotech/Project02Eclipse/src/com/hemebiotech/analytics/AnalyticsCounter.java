package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AnalyticsCounter {
	
	public static void main(String args[]){
		
		ReadSymptomDataFromFile readerSymptomFile = new ReadSymptomDataFromFile("symptoms.txt");
		MapSymptoms mapSy = readerSymptomFile.getSymptoms();
		
		//Lecture du fichier symptoms.text
		/*BufferedReader reader;
		try{
			reader = new BufferedReader (new FileReader("symptoms.txt"));
		
			
			String line = reader.readLine();
			//Mise à jour de MapSymptoms
			while (line != null){
				mapSy.addSymptom(line);
				line = reader.readLine();
			}
			reader.close();
				
		}catch (FileNotFoundException f){
			f.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}*/

		//Tri des symptomes (ordre lexicographique)
		ArrayList<Symptom> sortedSymptoms = mapSy.sortedSymptoms();
		
		//Tri des symptomes (ordre d'occurences)
		ArrayList<Symptom> sortedByNbOccurences = mapSy.sortedByNbOccurences();
		for (Symptom s : sortedByNbOccurences) {
			System.out.println(s);
		}
		
		
		//Ecriture du résultats dans results.out
		try {
			FileWriter writer = new FileWriter ("result.out");
			for (Symptom s : sortedSymptoms) {
				writer.write(s.toString()+"\n");
			}
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
