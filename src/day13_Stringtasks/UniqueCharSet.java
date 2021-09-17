package day13_Stringtasks;

public class UniqueCharSet {

	public static void main(String[] args) {
			
		String str="aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg";
		//String expectedstr= "abc";
		String uniqueChars="";
		
		for (int i=0; i<str.length();i++){
		 //System.out.println(i);
			String currentChar = Character.toString(str.charAt(i));
			
		 //System.out.println(currentChar);
		 
		 if (!uniqueChars.contains(currentChar)) {
				
				uniqueChars += currentChar;//uniqueChars=currentChar+uniqueChars
				
			}
			
		}
		 System.out.println(uniqueChars);

	}
	
	

}
