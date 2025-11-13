package com.codewars.cl1;

import java.util.StringJoiner;

/**
 * Write a function that takes in a string of one or more words, and returns the same string, 
 * but with all five or more letter words reversed (Just like the name of this Kata). 
 * Strings passed in will consist of only letters and spaces. 
 * Spaces will be included only when more than one word is present.
 * @author ketannakum
 *
 */
public class SpinWords {

	private String RESULT;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * This method takes sentence in the input and returns string which may
	 * have some words in reverse.
	 * @param sentence
	 * @return RESULT
	 */
	public String spinWords(String sentence) {
		String[] stringArray = sentence.split(" ");
		StringJoiner joinSentence = new StringJoiner(" ");

		for (String element : stringArray) {
			System.out.println("Element : " + element);
			
			// Logic to handle spinning of words which are greater than 5 characters or letters
			if (element.length() >= 5) {
				// StringBuffer tempBufferToReverse = new StringBuffer();
				
				//Used string builder because of performance and mutable features
				StringBuilder tempBuilderToReverse = new StringBuilder();

				tempBuilderToReverse.append(element);
				tempBuilderToReverse.reverse();
				joinSentence.add(tempBuilderToReverse.toString());
			} else {
				joinSentence.add(element.toString());
			}
		}

		RESULT = joinSentence.toString();
		return RESULT;

	}

}
