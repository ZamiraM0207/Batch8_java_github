package homeWork_array_wrappersClass;

import java.util.ArrayList;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
//		Write java program  that can add a double
//		after the last index of a double array
		
		ArrayList <Double> d1 =new ArrayList<>();
		d1.add(3.25);
		d1.add(1.45);
		d1.add(6.35);
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter a double number");
		double d2=scan.nextDouble();
		
		

		d1.add(d2);
		System.out.println(d1);
			
		
		scan.close();
		
	}
	
	}


