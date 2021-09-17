package homeWork_array_wrappersClass;

import java.util.ArrayList;
import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
//1. Write java program that can add an Integer 
//after the  last index of an integer array

		ArrayList<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
System.out.println(num);
Scanner scan = new Scanner(System.in);

System.out.println("enter a number ");
int num2=scan.nextInt();

	num.add(num2);
	System.out.println(num);
	scan.close();
		}
		
	}
		
	

