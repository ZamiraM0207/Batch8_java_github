package day5ControlFlow;

import java.util.Scanner;

public class classpracticeifstatement {

	public static void main(String[] args) {
		double overdrawnPenalty =8.0;
		double interesRate=0.02;
		double balance;
		System.out.println("Enter your checking account balance:$");
	
		Scanner scanner=new Scanner (System.in);
		balance=scanner.nextDouble();
		System.out.println("Original balance $ "+balance);
	
		if(balance>=0) {
			balance=balance+(interesRate*balance)/12;
		
		}else {
			balance=balance-overdrawnPenalty;
			
		}
		System.out.println("your new balance is $ "+balance);
		
		
		scanner.close();
		
		
	
	
	
	
	}

}
