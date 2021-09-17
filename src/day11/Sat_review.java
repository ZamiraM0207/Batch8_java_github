package day11;

import java.util.Scanner;

public class Sat_review {

	public static void main(String[] args) {
				
		
	int result=0;
	Scanner scan= new Scanner(System.in);
	System.out.println("Input a positive integer");
	
	int number=scan.nextInt();
	 if (number> 0){
		 for (int i=0; i<10;i++) {
			 result=i*number;
		System.out.println(i+" X "+number +" = "+ result);
		
		
			 
		 }
		 scan.close();
	 }
	
	}

}
