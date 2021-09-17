package day13_Stringtasks;

public class SubstringTask {

	public static void main(String[] args) {
					//  12345678911234567892123456789312
		//String email3 = "irfan.tursun@techcirclesolutions.org";
		//String email1 = "test.gmail.com";
		
//extract username and domain name from email
		
//		String username = email.substring(0,12);
//		String domainName =email.substring(13,32);
//		System.out.println("user name : "+ username);
//		System.out.println("domain name : "+ domainName);

String email2 = "tzami@gmail.com";
		
		String email = "zamira9127@gmail.org";
		
		// Extract username and domain name from email
		
		
//		String username = "irfan.tursun";
//		String domainName = "techcirclesolutions";
		
		String username = email.substring(0,email.indexOf("@"));
		
		System.out.println(username);
		
		System.out.println(email.lastIndexOf("."));
		
		
		int startIndex = email.indexOf("@")+1;
		
		int endingIndex = email.lastIndexOf(".");
		
		String domainName = email.substring(startIndex, endingIndex);
		
		System.out.println(domainName);
		
		
	}

}
