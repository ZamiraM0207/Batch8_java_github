package homework_day14;

public class homework4 {

	public static void main(String[] args) {
		
//		4- ask the user to enter a word.
//      if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
		
		String str4 = "lovely";
		
		
		String subString = str4.substring(str4.length()-2);
		
		System.out.println(subString);
		
		if(subString.equals("ly")) {
			System.out.println("really???");
		}else {
			System.out.println("never mind");
		}
		
		
		if(str4.endsWith("ly")) {
			System.out.println("really???");
		}else {
			System.out.println("never mind");
		}
		
		
		
		
	}

}
