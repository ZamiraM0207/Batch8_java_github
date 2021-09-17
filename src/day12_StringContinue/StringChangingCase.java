package day12_StringContinue;

public class StringChangingCase {

	public static void main(String[] args) {
//change the name to lower case 
//name.toUpperCase
//name.toLowerCase

//		System.out.println(name.toLowerCase());
//		
//		System.out.println(name.toUpperCase());
		
		String  name1 = name.toLowerCase();
		
		String name2 = name.toUpperCase();
		
		
		if (name.toUpperCase().equals(name2.toUpperCase())) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
		
		
		if (name.toLowerCase().equals(name2.toLowerCase())) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}	
		
		
		
		
	}

}
