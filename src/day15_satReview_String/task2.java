package day15_satReview_String;

public class task2 {

	public static void main(String[] args) {
		//Count how many vowels are in a string
				//vowels: a, e, i, o, u
				//(example) String: elephant; number of vowels = 3
		
		
		String str="parallel";
		String referenceData = "aeiou";
		int count=0;
//		System.out.println(str.length());
//		for (int i=0;i<=str.length();i++) {
//		System.out.println(str.charAt(i));
			
		for (int i = 0; i <= str.length() - 1; i++) {
			String currentChar = Character.toString(str.charAt(i));
			if (referenceData.contains(currentChar)) {
				count += 1;
			}
		}
		System.out.println(str + "; number of vowels = " + count);
	}
		
			
			
			
		
			
			 
			

			
		}
	


