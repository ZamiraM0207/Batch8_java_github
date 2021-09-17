package day25_MethodParamsAndMethodOverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import methods.StringUtil;

public class ClassroomTasks {

	public static void main(String[] args) {
		
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		


//1.create a function that can check if the given
//integer is positive, negative or zero
		System.out.println(StringUtil.task(110));
		
// 4. create a function that can print a
// string without the duplicated characters
// "aaabbbccc"
// abc

		System.out.println(StringUtil.nonDuplicatedCharacter("aaaagggeeeooo"));

		
		
//5.  write a method that can print out the full name of a person in regular format
// ex:
//fullName("teChCirCle", "SCHOOL");
//output:
//"Techcircle School"
	
	       System.out.println(StringUtil.formatFullName("zAMIRa","MURAT"));
	       
	       
//2. create a function that can calculate the grade of the student
// 0-60 "F"
//60-80 "D"	       
//70-80 "C"	       
//80-90 "B"	       
//90-100 "A"
	       Scanner scan =new Scanner (System.in);
	       System.out.println("please enter a number ");
			int num=scan.nextInt();

	 System.out.println(StringUtil.Grades(num));      
	       
	       
	       
//3. create a function that can print out the combination of two integer arrays	
	 
	 
	 
	}
}
		

		
	
