package day14_StringInterviewQuestions;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		String str = "ab123456cde78d";
		//Write a program to extract number from a string 
		//expected output:12345678
		
		
		
		for (int i=0; i<str.length();i++){
		 if (str.charAt(i)>47 && str.charAt(i)<58) {
			 
			 System.out.print(str.charAt(i));
		 }
		}
	}

}
