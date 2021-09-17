package day4reviewsession;

public class homework1 {

	public static void main(String[] args) {
	//CalculateRectangle.    
	//Write a program that can calculate the area & perimeter of any rectangle.

		double width=10;
		double length=13.5;
		
		double theArea=width*length;
		double thePerimeter= (width+length)*2;
		System.out.println("The area of this trangle is "+ theArea);
		System.out.println("The perimeter of this trangle is "+ thePerimeter);
		
		//DVM car registration card   
		//Write a program to describe your drivers license card using primitive variables.
		//Capture all the data on your Drivers license, and print them on your console. 

		//Note you don't have to use your real information. 

		
		String customerID="M-95093450";
		String familyName="Murat";
		String givenName="Zamira";
		String address="3456 Main St,Baltimore,21122";
		String DOB = "02/07/91";
		String Sex = "F";
		String IssOri = "01/22/16";
		double Height = 5.7;
		double Weight = 120;
        String Classification = "C";
	    String Expire = "01/22/26";
	    System.out.println();
	    System.out.println("CustomerIdentifier" + "\n" + customerID+"\n");
		
		System.out.println("FamilyName" + "\n" + familyName+"\n");
		System.out.println("GivenName" + "\n" + givenName+"\n");
		System.out.println("Address"+ "\n" + address+"\n");
		
		System.out.println("DATE OF BIRTH "+DOB+"\n");
	
		System.out.println("SEX "+Sex+"\n");
		
		System.out.println("Height"+ "\t"+"\t"+"Classification"+"\t"+"Expire");
		System.out.println(Height+"\t"+"\t"+Classification+"\t"+"\t"+Expire);
	    
		
		
		
	}

}
