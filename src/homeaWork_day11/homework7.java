package homeaWork_day11;

public class homework7 {

	public static void main(String[] args) {
		
		String alphanumeric = "a1b2c34d098098efg";
//		
//		String referanceData = "abcdefghijklmnopqrstuvwxyz";
//		
//		for(int i = 0; i <alphanumeric.length(); i++ ) {
////			System.out.println(i);
//			
////			char currentChar = alphanumeric.charAt(i);
//			String currentChar = Character.toString(alphanumeric.charAt(i));
//					
//			if (referanceData.contains(currentChar)) {
//				System.out.println(currentChar);
//			}	
//			
//		}
		
		char a = 'a';
		
		int numA = a;
		
		char z = 'z';
		
		int numZ = z;
		
		System.out.println(numA);
		System.out.println(numZ);
		
		
		
		for(int i = 0 ; i < alphanumeric.length(); i++ ) {
			
			
			char currentChar = alphanumeric.charAt(i);
			
//			System.out.println(currentChar);
			
			
			int num = currentChar;
			
//			System.out.println(num);
			
			
			if (num >= numA && num <= numZ) {
				System.out.print(currentChar);
		
// or pedro's way 
// 		if (currentChar >= 97 && currentChar <= 122) {
//          System.out.print(currentChar);	
	}

}
	}
	
}
	
