package day18_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSimple {

	public static void main(String[] args) {		
ArrayList<String> gfg = new ArrayList<String>(Arrays.asList("Geeks","for","Geeks"));
		
//		gfg.add("Geeks");
//		gfg.add("for");
//		gfg.add("Geeks");
		
		System.out.println("ArrayList : "+ gfg);
		
		
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		List<Integer> gfg = new ArrayList<Integer>(arr);
		
		System.out.println("ArrayList : "+gfg);
		
		
		ArrayList <String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		ArrayList <String> list2 = new ArrayList<>();
		list2.add("E");
		list2.add("F");
		
		list1.addAll(2, list2);
		System.out.println(list1);


		ArrayList <String> list3 = new ArrayList<>();
		list3.add("d");
		list3.add("B");
		list3.add("C");
		list3.add("D");
		
		ArrayList <String> list4 = new ArrayList<>();
		list4.add("a");
		list3.addAll(list4);
		System.out.println(list3);
		
		















		
	}

}
