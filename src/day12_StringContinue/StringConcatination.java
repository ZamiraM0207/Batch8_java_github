package day12_StringContinue;

public class StringConcatination {

	public static void main(String[] args) {

		
		//adding 3 string togather
		// solution one 
//		String result ="";
//			result += word1; // " "+ "re"
//			System.out.println(result);
//			result += word2; // "re"+ "think"
//			System.out.println(result);
//			result += word3; // "rethink"+ "ing"
//			System.out.println(result);
		String word1="re";
		String word2 ="think";
		String word3= "ing";
			
	//solution two 
	//using concatenation method (is a method that adding 2 string togather) 
		String result ="";
		result= word1.concat(word2).concat(" i can as many as string using concat method ");
		System.out.println(result);
		
	// enter a number :5
	//5 X 1 = 5
	//5 X 2 = 10
	//5 X 3 =15
		
	int num =5;
	for (int i=1; i<=num; i++) {
		int total =num *i;
		String msg=num + "X" + i + "=" +total;
		System.out.println(msg);
	}
		
		
		
			
	}

}
