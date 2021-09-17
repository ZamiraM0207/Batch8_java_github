package day5ControlFlow;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {

		
		
		
//		Odd or even
//		Write a program that can check if the
//		given number is odd or even (OddEven)
//		Ex:
//		number = 100;
//		output:
//		100 is even number
//		number = 101
//		output:
//		101 is odd number
//		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number ");
		int number=scan.nextInt();
		if (number%2==0) {
			System.out.println(number+"is a even number");
		}
		else if (number%2==1){
			System.out.println(number+" is a odd number");
		}
		
		
	}
	

}