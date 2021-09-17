package homeWork_array_wrappersClass;

import java.util.ArrayList;
import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		/*Write java program s that can add a String 
		 after the last index of a String array*/
	
		ArrayList <String> str =new ArrayList <>();
		str.add("Broccoli");
		str.add("Cucumber");
		str.add("Tomato");
		str.add("Onion");
		str.add("Garlic");

		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter a vegitable ");
		String str2=scan.next();
		str.add(str2);
		System.out.println(str);
		
		
		
		scan.close();
		
		
		
		
		
	}

}
