package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class classroomTask {

	public static void main(String[] args) {

		String sentence = "The utility package contains all the classes and interfaces";

		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		// count the number of vowels in this string.
//int count = 0;
//for (int i = 0; i < sentence.length(); i++) {
//	for (int j = 0; j < vowels.size(); j++) {
//		if (sentence.charAt(i) == vowels.get(j)) {
//			count++;
//		}
//	}
//}
//System.out.println("The number of vowels is: " + count);

//String sentence = "The utility package contains all the classes and interfaces";

		// find the third vowel and count how many times it occurs in the string

		

		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
		for (int j=0; j<vowels.size();j++) {
			if (sentence.charAt(i)==vowels.get(j-2));
			
			
			
			
			
			}
		
		
	
		}
		
		
		
	}
	
}
