package day14_StringInterviewQuestions;

public class task4 {

	public static void main(String[] args) {
/*		/*Write an efficient Java program to return 
 * the maximum occurring character
 *  in the input string, e.g., if the input string 
 *  is "Java" then the function should return 'a'.*/
	String str1="Javbbbba";
	String uniqueChar="";
	//String expectedstr= "a"
	String str = "Javaaaaaaaaaaaaaaaaaaa";

	String uniqueChars = "";

	for (int i = 0; i < str.length(); i++) {

		String currentChar = Character.toString(str.charAt(i));

		if (!uniqueChars.contains(currentChar)) {

			uniqueChars += currentChar;

		}

	}

	System.out.println(uniqueChars);
	
	
	int max = 0;
	char maxOccuringChar = ' ';
	
	
	for (int i = 0; i < uniqueChars.length(); i++) {
		
		System.out.println(uniqueChars.charAt(i));
		
		char lookingFor = uniqueChars.charAt(i);
		
		int num = 0;
		
		for (int j = 0; j < str.length(); j++) {

			char found = str.charAt(j);

			System.out.println("Looking for <"+lookingFor+">  found  <"+found+">");
			
			
			if (lookingFor == found) {
				num++;
			}

		}

		if (num > max) {
			max = num;
			
			maxOccuringChar = lookingFor;
		}

	}
	

	System.out.println(maxOccuringChar+" occured "+ max +" times");
	
	
		
	
	

		
		
		
		
	}	
	}


