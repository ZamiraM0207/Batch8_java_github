package day22_arrayListreviewwitherfan;

import java.util.ArrayList;

public class AddPrimitiveToArrayList {

	public static void main(String[] args) {
		ArrayList <Character> MyChar = new ArrayList<>();
		
		MyChar.add('A');
		MyChar.add('B');
		MyChar.add('C');
		MyChar.add('1');
		MyChar.add('2');
		MyChar.add('3');
		
		System.out.println(MyChar.get(0));
		System.out.println(Character.isDigit(MyChar.get(0))); // false 
		System.out.println(MyChar.size());//6
		System.out.println(MyChar.get(5));//3
		System.out.println(MyChar.get(MyChar.size()-1));// last element of array 3 
		
		



	}

}
