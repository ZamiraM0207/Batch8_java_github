package day18_ArrayList;

import java.util.ArrayList;

public class IterateArrayList {

	public static void main(String[] args) {

		
		
		//task form website 
//program to create a new array list,add some colors(string) 
		//and print out the collection 
ArrayList<String> colors = new ArrayList<String>();
		
	colors.add("red");
	colors.add("orange");
	colors.add("greeen");
	colors.add("blue");
		
		System.out.println("For Loop");
		for (int counter = 0; counter < colors.size(); counter++) {
			System.out.println(colors.get(counter));
			
			
			
/*pedro's code 			
 * List<String> colors = new ArrayList<>();
			colors.add("Red");
			colors.add("White");
			colors.add("Blue");
			System.out.println("ArrayList is " + colors);
			System.out.println();
			System.out.println("List printed with Advanced For Loop:");
			for (String america : colors) {
			System.out.println(america);
				*/
		}
	}

}
