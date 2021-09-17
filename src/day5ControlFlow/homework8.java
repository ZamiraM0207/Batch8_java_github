package day5ControlFlow;

import java.util.Scanner;

public class homework8 {

	public static void main(String[] args) {
/*
 * Age Group
Write a program that can define the age groups of 
a person
age groups are:
infant (0 - 2)
Toddler (3 - 5),
Kid (6 - 9),
Pre-Teen (10 - 12),
Teenager (13 - 17),
Young Adult (18 - 20),
Adult (21 - 39),
Young Middle-Aged Adult (40 - 49),
Middle-Aged Adult (50 - 54),
Very Young Senior Citizen (55 - 64),
Young Senior Citizen (65 - 74),
Senior Citizen (75 - 84),
Old Senior Citizen (85+)
 
 */
	Scanner scan=new Scanner(System.in);
		System.out.println("please enter an age");
		int age=scan.nextInt();
		if (age<0 && age>=2) {
			System.out.println("infat");
		}
		if (age>=3 && age<=5) {
			System.out.println("toddler");
		}
		if (age>=6 && age<=9) {
			System.out.println("kid");
			}
		if (age>=10 && age<=12) {
			System.out.println("pre-teen");
	
		}
		if (age>=13 && age<=17) {
			System.out.println("Teenager");
			
		}
		if (age>=18 && age<=20) {
			System.out.println("young adult");
			
		}
		if (age>=21 && age<=39) {
			System.out.println("adult");
			
		}
		if (age>=40 && age<=49) {
			System.out.println("Young Middle-Aged Adult");
			
		}
		if (age>=50 && age<=54) {
			System.out.println("Middle-Aged Adult");
			
		}
		if (age>=55 && age<=64) {
			System.out.println("Very Young Senior Citizen");
			
		}
		if (age>=65 && age<=74) {
			System.out.println("Young Senior Citizen");
			
		}
		if (age>=75 && age<=84) {
			System.out.println("Senior Citizen");
			
		}
		if (age>=85) {
			System.out.println("Old Senior Citizen");
			
		}
		
		
	
	
	
	}
	

}
