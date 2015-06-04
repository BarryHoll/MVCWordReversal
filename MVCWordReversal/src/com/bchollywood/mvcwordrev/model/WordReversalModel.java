/**
 * WordReversalModel holds all the data
 * and performs all the calculations.
 */

package com.bchollywood.mvcwordrev.model;

public class WordReversalModel {
	
	private String reversedWords;
	private String reversedSentence;
	
	public void reverseWords(String sentence) {
		String[] words = sentence.split(" ");
		reversedWords = "";
		for(String word : words){
			if(reversedWords.equals("")){
				reversedWords = new StringBuilder(word).reverse().toString();
			}else{
				reversedWords = reversedWords + " " +new StringBuilder(word).reverse().toString();
			}
		}
	}
	
	public void reverseSentence(String sentence) {
		reversedSentence = new StringBuilder(sentence).reverse().toString();
	}
	
	public String getReversedWords() {
		return reversedWords;
	}

	public String getReversedSentence() {
		return reversedSentence;
	}

}
