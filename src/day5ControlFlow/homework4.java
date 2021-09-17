package day5ControlFlow;

public class homework4 {

	public static void main(String[] args) {
		/*
		 Create a class called LeapYear, and write a program that can identify if the given is Leap Year, 
		 print true if it’s a leap year, otherwise print false
		Ex:
		year = 2020
		output:
		2020 is a leap year: true
		Hint: if the number of year can be evenly divisible by 4, it’s known as a leap year
		*/
	
	
	int year=2024;
	if (year%4==0) {
		System.out.println(year +" is a leap year");
	}
	else {
		System.out.println(year +" is not a leap year");
		
	}
	
	
	}

}
