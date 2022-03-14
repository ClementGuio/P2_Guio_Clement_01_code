package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Implementation of ISymptomReader.
 * @see ISymptomReader
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * Constructor of a ReadSymptomDataFromFile.
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapSymptoms getSymptoms() {
		MapSymptoms  result = new MapSymptoms();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.addSymptom(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (FileNotFoundException f) {
				f.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return result;
	}
}
