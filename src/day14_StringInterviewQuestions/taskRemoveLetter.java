package day14_StringInterviewQuestions;

public class taskRemoveLetter {

	public static void main(String[] args) {
	
		
				// 0123456789112
		String str ="Programming";
		String targetChar ="m";
		//expected :prograing
		System.out.println((str.substring(0,6)+str.substring(8,11)));
		
		String str1 = str.replace("m","");
		System.out.println(str1);
		
	}

}
