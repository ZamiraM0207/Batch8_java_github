package day5ControlFlow;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		/*
		Compare two numbers using scanner
		write a program that can print out the max 
		 number between two numbers using scanner
		Ex:
		num1 = 20;
		num2 = 30;
		output:
		30 is the max number
		num1 = 20;
		num2 = 20;
		output:both numbers are equal
		*/
		Scanner scan1=new Scanner(System.in);
		System.out.println("please enter your first number ");
		
		int num1=scan1.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.println("please enter your second number ");
		int num2=scan2.nextInt();

		
		if (num1>num2) {
			System.out.println(num1 +" is greater than "+ num2);
		
		}else if (num1<num2) {
			
			System.out.println(num2 +" is greater than "+ num1);
			
		}
		else if (num1==num2) {
			System.out.println("they are the equal"); 
		}
		else {
			System.out.println("invalid input! ");
		}
		
		
		
	}

}
