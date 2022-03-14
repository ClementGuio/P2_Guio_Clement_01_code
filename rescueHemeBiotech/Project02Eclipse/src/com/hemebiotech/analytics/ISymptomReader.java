package com.hemebiotech.analytics;

/**
 * Anything that will read symptom data from a source.
 * The return value from the operation is a MapSymptoms with no duplication.
 * The implementation does not need to order the list.
 * @see MapSymptoms
 */
public interface ISymptomReader {
	
	/**
	 * If no data is available, return an empty MapSymptoms.
	 * 
	 * @return a MapSymptoms of all Symptoms obtained from a data source with no duplication. 
	 */
	MapSymptoms getSymptoms ();
}
