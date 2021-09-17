package homework_day14;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
/*3- write a program that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three characters
if the string has less than or equal 3 characters, print the string itself
*/
	
		
	Scanner scan =new Scanner(System.in);
	System.out.println("please enter a string");
	String Str=scan.next();
	
	
	if (Str =="343") {
	System.out.println("String is empty");

	}
	if (Str.length()<=3) {
	for (int i=Str.length()-1;1>=0;i--) {
		System.out.println(Str.charAt(i));
		
	}
	}
		System.out.println();
	
	//my logic was right  but dont know the rest 
		
		
		

		
	}
}
