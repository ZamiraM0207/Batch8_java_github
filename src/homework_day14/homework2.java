package homework_day14;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
//2- write a program that can return the longest string from two user inputs

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a string ");
		String str1=scan.next()	;
		Scanner scan2=new Scanner(System.in);
		System.out.println("please enter another string ");
		String str2=scan.next()	;

	
	if (str1.length()>str2.length()) {
		System.out.println(str1+" is the longest string ");
	}else {
		System.out.println(str2+" is the longest string ");
	}
	
			
		
		
		
		
		
	}

}
