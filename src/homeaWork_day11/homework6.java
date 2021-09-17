package homeaWork_day11;

public class homework6 {
public static void main(String[]args ) {
/*Make it total of 5 characters
Write a program that checks the length of the string. 
If the string length is less than 5 characters then add any character and make it total of five character.
if the length is equal to 5 then keep the original string. 
if string length greater than 5 characters then keep the last 5 characters.
Examples:
String str1 = "computer"; String str2 = "Java"; String str3 = "Pizza";
//expected "puter" , "JavaA" "Pizza"*/	
	
	
	
	
	
	
	String str = "computer";
	
	if (str.length() == 5) {
		System.out.println(str);
	}
	
	
	if (str.length() < 5) {
		
		String str2 = str+"123456789";
		
		System.out.println(str2.substring(0, 5));
		
		
	}
	
	if (str.length() > 5) {
		System.out.println(str.substring(str.length()-5));
	}
}
}
