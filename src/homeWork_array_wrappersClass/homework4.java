package homeWork_array_wrappersClass;

import java.util.ArrayList;
import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		ArrayList <Character>char1= new ArrayList<>();
		char1.add('A');
		char1.add('B');
		char1.add('C');
		char1.add('D');
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter a Charactor");
		String char2=scan.next();
		char char3 = char2.charAt(0);
		char1.add(char3);
		System.out.println(char1);
		
		
		scan.close();
		
	}

}
