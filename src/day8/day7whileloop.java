package day8;

import java.util.Scanner;

public class day7whileloop {

	public static void main(String[] args) {
		int count,number;
		System.out.println("Enter a number");
		Scanner keyboard=new Scanner(System.in);
		number =keyboard.nextInt();//number=6
		
		count = 1;
		
		while (count<=number){
			System.out.print(count+",");
			count++;
		}
		
		System.out.println();
		System.out.println("buckle my shoe.");
		System.out.println(count);
		
			
	}
	
}
