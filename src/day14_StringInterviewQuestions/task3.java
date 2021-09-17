package day14_StringInterviewQuestions;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
/*Task:
1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
*/
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a word ");
		String word= scan.next();
		System.out.println("please enter your second word ");
		String word2= scan.next();
		System.out.println(word.substring(1) + word2.substring(1));
		scan.close();
		
		



		
		
		
	}

}
