package day5ControlFlow;


public class homework11 {

	public static void main(String[] args) {
		/*
		 * free shipping or not 
		 */
	 int cartTotal=1;
	 boolean memberType=true;
	 if (cartTotal>100 || memberType) {
		 System.out.println("you are qualify for free shipping! ");
		 
	 }
	 else {
		 System.out.println("Sorry,You did not meet the requirements for free shipping.");
	 }
	}

}
