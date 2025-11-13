package com.codewars.cl1;


/**
 * Write a function that takes in a string of one or more words, and returns the same string, 
 * but with all five or more letter words reversed (Just like the name of this Kata). 
 * Strings passed in will consist of only letters and spaces. 
 * Spaces will be included only when more than one word is present.
 * @author ketannakum
 *
 */
public class SpinWordsVariation {

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
		String[] words = sentence.split(" ");
		//StringJoiner joinSentence = new StringJoiner(" ");

		 for (int i=0; i<words.length; i++) {
			System.out.println("Word : " + words[i]);
			
			// Logic to handle spinning of words which are greater than 5 characters or letters
			if (words[i].length() >= 5) {
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
			
			System.out.println("Word : " + words[i]);
		}
		
		return String.join(" ", words);

	}

}
