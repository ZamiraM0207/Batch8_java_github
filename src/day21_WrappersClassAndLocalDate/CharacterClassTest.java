package day21_WrappersClassAndLocalDate;

public class CharacterClassTest {

	public static void main(String[] args) {

		char a = 'A';
		char b = '9';
		
		Character c = a;
		
		System.out.println(c); //A
		
		System.out.println(Character.isDigit(b)); //true
		
		System.out.println(Character.isDigit(a));//false
		
		
		System.out.println(Character.isLetter(b));//false
		System.out.println(Character.isLetter(a));//true

		//extract letters from a string
//		              0123456
		String str = "abc123def456";
			
		for(int i = 0 ; i < str.length(); i++) {
			char eachChar = str.charAt(i);
			
//			System.out.println(eachChar);
			
			if (Character.isLetter(eachChar)) {
				System.out.println(eachChar);
			}
			
			
			if (Character.isDigit(eachChar)) {
				System.out.println(eachChar);
			}
			
		}
			
	}

}
