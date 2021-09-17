package day12_StringContinue;

public class StringEqual {

	public static void main(String[] args) {
		String word1="Hello ";
		String word2="Java";
		String word3= word1+word2;
		String word4= "Hello Java";
		System.out.println(word3);
		System.out.println(word4);
		System.out.println(word3==word4);//old way 
		// equal method returns true if the string word1 is equal to word2
		System.out.println(word3.equals(word4));//Equal method 
		String word5="HELLO JAVA";
		System.out.println(word4.equals(word5));//false because its upper case 
		System.out.println(word4.equalsIgnoreCase(word5));//Equal ignore case 
		
		
//compare 2 String 
		if (word4.equals(word5)) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}
		
		
		
		if (word4.equalsIgnoreCase(word5)) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}
		
		



		
	
	
	
	}

}
