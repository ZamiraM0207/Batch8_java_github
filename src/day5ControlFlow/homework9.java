package day5ControlFlow;

import java.util.Scanner;

public class homework9 {

	public static void main(String[] args) {
/*

 How many digits?
Given a number(long) determine and 
print how many digits it has.
Condition: The number has to be 
between 1 and 100000, if it is not print
 "Invalid number"
Ex: 124 --> 3 digits
13213 --> 5 digits
883218 --> Invalid number
23 --> 2 digits/
*/
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number between 1 and 100000");
		long number= scan.nextLong();
		if (number>1 && number<9) {
			System.out.println("The number is 1 digit.");
		}
		else if (number>10 && number<99) {
			System.out.println("The number is 2 digit.");
		}
		else if (number>100 && number<999) {
			System.out.println("The number is 3 digit.");
		}
		else if (number>1000 && number<9999) {
			System.out.println("The number is 4 digit.");
		}
		else if (number>10000 && number<99999) {
			System.out.println("The number is 1 digit.");
		}
		else {
			System.out.println("invalid number ");
		}

	}

}
