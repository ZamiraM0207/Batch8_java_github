package day5ControlFlow;

public class homework7 {

	public static void main(String[] args) {
/*Days In Week
	write program that can print out the 
	name of the day based on the number 1 ~ 7
	number = 1 // 1 ~ 7
	output:
	Monday
	number = 5
	output:Friday 
 */
		int input=1;
		switch (input) {
		case 1:
			System.out.println("monday");
			
			break;
		case 2:
			System.out.println("tuesday");
			
			break;
		case 3:
			System.out.println("wednesday");
			
			break;
		case 4:
			System.out.println("thursday");
			
			break;
		case 5:
			System.out.println("friday");
			
			break;
		case 6:
			System.out.println("saturday");
			
			break;
		case 7:
			System.out.println("sunday");
			
			break;
		default:
			System.out.println("invalid input");
			
		}
		}
	}

