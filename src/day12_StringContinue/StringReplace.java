package day12_StringContinue;

public class StringReplace {

	public static void main(String[] args) {
/*String word2 = word1.replace(oldCh, newCh);
	returns a new string formed from word1 by replacing all occurrences of oldCh with newC*/
		
		String word1="Car";
		String word2= word1.replaceAll("r","t");
		System.out.println(word2);
		
		
String str = "Salary of SDET is 80000";
		
		String str2 = str.replace("80000", "$135,000");
		System.out.println(str);
		System.out.println(str2);
		
		
		
	}

}
