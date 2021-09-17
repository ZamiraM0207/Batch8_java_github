package day14_StringInterviewQuestions;

import java.util.Scanner;

public class homeworkfromthursday {

	public static void main(String[] args) {
//Given a string replace only the first occurrence of a specified letter
//to another specified letter of your choice 
			
			
		String word = "parallel";
		char char1 = 'a';
		String char2 = "b";
		
		String result = "";
		boolean s = true;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==char1 && s) {
				result+=char2;
				s=false;
			}
			else {
				result+=word.charAt(i);
				
			}	
		}
		System.out.println(result);
	}}

