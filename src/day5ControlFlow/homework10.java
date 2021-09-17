package day5ControlFlow;

import java.util.Scanner;

public class homework10 {
	/* saving account and interest
	 * 
	 */

	public static void main(String[] args) {
	double interest=0.003;
	Scanner scan= new Scanner(System.in);
	System.out.println("please enter your account balance");
	double balance= scan.nextDouble();
	Scanner type= new Scanner(System.in);
	System.out.println("Please enter your account type: '1' is for saving, '2' is for checking ");
	int savings=scan.nextInt();
	double interestRate= interest * balance;
		if (savings==1 && balance>1000) {
				System.out.println("your interest rate id "+interestRate +"."+ "your current account balance is "
			+(balance+interestRate));		
	
	}
		else {
			System.out.println("you did not eligible to receive interest from your current balance");
		}
	
	
	}
}


