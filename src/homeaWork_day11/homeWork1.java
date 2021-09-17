package homeaWork_day11;

import java.util.Scanner;

public class homeWork1 {

	public static void main(String[] args) {
		{
	}
		//calculate the sum of 5 user entered inputs
		//num1+num2+num3+num4+num5=total
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter a numner");
		int sum =0;
		for (int i =1; i<=5; i++) {
		
			int input =scan.nextInt();
			
		 sum=input+sum;
		}
		scan.close();
		System.out.println("the sum of the numbers that your enter is " + sum );


}
}
