package day8;

import java.util.Scanner;

public class dowhileloop {

	public static void main(String[] args) {
		int count, number;
		System.out.println("Enter a number");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt(); //number = 0
		
		count = 1;
		
		//count=1; number =0
		do{
			System.out.print(count+", ");
			count++;
		}while(count <= number);
		
		System.out.println();
		System.out.println("Buckle my shoe.");
		
		System.out.println(count);

		
	}

}
