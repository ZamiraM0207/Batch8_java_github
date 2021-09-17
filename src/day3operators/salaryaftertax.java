package day3operators;

public class salaryaftertax {

	public static void main(String[] args) {

		int salary=100000;
		double taxRate=0.28;
		double totalTax=salary* taxRate;
		double salaryAfterTax= salary-totalTax;
		
		System.out.println("My salary is "+ salaryAfterTax);
		
		
		
		
	}

}
