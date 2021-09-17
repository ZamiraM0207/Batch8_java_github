package day5ControlFlow;

public class homework13 {

	public static void main(String[] args) {
	/* buying milk 2
	 * 
	 */
		
		boolean fullFatmilk=true;
		boolean onSale=true;
		boolean twoPersentMilk=true;
		int exprationDay=14;
		if (fullFatmilk) {
			if(onSale && exprationDay>=14) {
				System.out.println("buy 2 gallons of full fat milk");
			}
			else {System.out.println("buy one gallon of full fat milk");
			
		}
			}
			else if(twoPersentMilk) {
				System.out.println("buy 2% milk");
			}
			else {
				System.out.println("buy skim milk");
			}
			
		
	}

}
