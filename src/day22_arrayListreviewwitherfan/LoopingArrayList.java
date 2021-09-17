package day22_arrayListreviewwitherfan;

import java.util.ArrayList;
import java.util.Iterator;


public class LoopingArrayList {

	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList<>();
		names.add("Darima");
		names.add("Opal");
		names.add("Dina");
		names.add("Zamira");
		names.add("Ariuna");
		names.add("Erkin");
		names.add("Qasir");
		
		//for loop calling each element
		for (int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		
		
		// while loop calling each element 
		int count = 0;
		while (count < names.size()) {
			System.out.println(names.get(count));
			count++;
		
			
		//do while loop 
			do {
				System.out.println(names.get(count));
				count++;
				
			}
			while (count < names.size());
			
		}
		
		
		
		
		//for each loop 
		for (String name : names ) {
			System.out.println(name);
		}
		
		
		//iterator ,how to calling each element
		Iterator <String> iterator =names.iterator();
		
//		iterator.next();
//		iterator.next();
//		iterator.next();
//		System.out.println(iterator.next());
//		System.out.println(iterator.hasNext());
//		

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
			
			
			
		
		
		
		
	}

}
