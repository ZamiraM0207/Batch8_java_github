package day6;

public class SwichStatement {

	public static void main(String[] args) {
		String operator ="&";
		
		
		switch (operator) {
		case "+":
			System.out.println("+");
			
			break;
		case"-":
		System.out.println("-");
		break;
		case"*":
		System.out.println("*");
		break;
		case"/":
		System.out.println("/");
		break;
		default:
			System.out.println("invalid operator");
			
		}
	}

}
