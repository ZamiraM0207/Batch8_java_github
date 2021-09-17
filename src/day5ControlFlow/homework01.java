package day5ControlFlow;


public class homework01 {

	public static void main(String[] args) {

//		Write a program to find current time is am or pm ?  
	//	Write a program to find current time is am or pm ?
	//			if current time is > 12 then its PM
//
//				if current time is < 12 then its AM
//				input :
//				5
//				output:
//				current time is 5 AM
//				input = 16;
//				current time is 4 PM;
		
		
		int currentTime = 25;
		
		if (currentTime>12 && currentTime<24) {
			
			System.out.println("Current time is " +(currentTime-12) +"pm" );
		}
		else if (currentTime<12) {
				System.out.println("Current time is "+ currentTime+ " am");
				}
			
		else {System.out.println("invalid input");
	}
	}
}
