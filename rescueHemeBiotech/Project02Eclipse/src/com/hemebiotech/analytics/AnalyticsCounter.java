package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Main class of the symptom registry program. 
 * 
 * @author Clément Guio
 *
 */
public class AnalyticsCounter {
	
	
	/**
	 * Main method of this program. Calls methods of other classes to create a map of symptoms stored in a file, 
	 * create an ordered list of symptoms and write the results in a file called results.out .
	 * 
	 * @see MapSymptoms
	 * @see ReadSymptomFromDataFile
	 * @param args
	 */
	public static void main(String args[]){
		
		ReadSymptomDataFromFile readerSymptomFile = new ReadSymptomDataFromFile("symptoms.txt");
		MapSymptoms mapSy = readerSymptomFile.getSymptoms();

		ArrayList<Symptom> sortedSymptoms = mapSy.sortedSymptoms();
		
		//Sort by nbOccurences
		/*ArrayList<Symptom> sortedByNbOccurences = mapSy.sortedByNbOccurences();
		for (Symptom s : sortedByNbOccurences) {
			System.out.println(s);
		}*/
		
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
