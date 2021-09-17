package methods;

import java.util.ArrayList;

public class StringUtil {


			public static void reverseString(String str) {
				
				for(int i = str.length()-1; i >= 0 ; i--) {
//					System.out.println(i);
					System.out.print(str.charAt(i));
				}
				
				System.out.println();

			}
			

//----------------------------------------------------------------------

public static void passwordValidation (String password) {
	Boolean hasDigit = false;
	Boolean hasUpperCase = false;
	Boolean hasLowerCase = false;
	Boolean symbol = false;

	if (password.length() > 7) {

		for (int i = 0; i < password.length(); i++) {// i=
			char ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				hasDigit = true;
			}
			if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			}
			if (Character.isLowerCase(ch)) {
				hasLowerCase = true;
			}
			if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
				symbol = true;
			}

		}
		if (hasDigit && hasUpperCase && hasLowerCase && symbol) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Password invalid");
		}
	} else {
		System.out.println("Password must be at least 8 characters long");
	}
}





//----------------------------------------------------------------------

public static String nonDuplicatedCharacter(String str) {
	String uniqueChars="";
	
	for (int i=0; i<str.length();i++){
	 //System.out.println(i);
		String currentChar = Character.toString(str.charAt(i));
		
	 //System.out.println(currentChar);
	 
	 if (!uniqueChars.contains(currentChar)) {
			
			uniqueChars += currentChar;//uniqueChars=currentChar+uniqueChars
			
		}
		
	}
//	 System.out.println(uniqueChars);
return uniqueChars;
}

//-------------------------------------------------------



public static String formatFullName(String givenFirstName,String givenLastName) {

givenFirstName = givenFirstName.toUpperCase().substring(0,1)+(givenFirstName.toLowerCase().substring(1));
givenLastName = givenLastName.toUpperCase().substring(0,1)+(givenLastName.toLowerCase().substring(1));
		

String fullName = givenFirstName + " "+ givenLastName ;
// System.out.println(fullName);
return fullName;
}

//----------------------------------------------------------------------

public static String task(int num ) {
	
	if (num >0)
		return " is positive";
	else if  (num <0)
		return " is negative";
	else 
		return " is zero";
}

public static String Grades(int grade) {
	if (grade>0 && grade<59)
		return "F";
	else if (grade>60 && grade<69)
		return "D";
	else if (grade>70 && grade<79)
		return "C";
	else if (grade>80 && grade<89)
		return "B";
	else if (grade>90 && grade<=100)
		return "A";
	else 
		return "Invalid input";
}



	ArrayList<Integer> num = new ArrayList<>(num);

}


}




