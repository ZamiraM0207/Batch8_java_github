package day11;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a string
		// elephant
		
		System.out.println(" please enter a word: ");
		
		Scanner scan = new Scanner(System.in);
		String name =scan.next();
		for( int i=name.length()-1; i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		scan.close();
	}

}
