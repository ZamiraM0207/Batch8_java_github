package homeWork_array_wrappersClass;

public class homework_sumofallthedigits {

	public static void main(String[] args) {
/*write a program that can return 
 * the sum of all the digits from a string
 *  input: “a1b2c3”
                output: 6
                    (1+2+3= 6)
                input: “Today’s date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
*/

		String str= "a1b2c3";
		int count =0;
		for (int i=0;i<str.length();i++) {
			char eachChar=str.charAt(i);
			
		//	System.out.println(eachChar);
		if (Character.isDigit(eachChar)) {
			for (int j=0; j<eachChar; j++) {
		System.out.println(eachChar);	
		}
		
		}
		
		
	}

	}
	}
