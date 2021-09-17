package day15_satReview_String;

public class StringReview {
	public static void main(String[] args) {
		
//	
//String str1 ="Hello";
//String str2= "world";
//String str3= "tech";
//
//	
////1.String method  length :
// int charcount= str1.length();
// //2.String first chararter 
// int firstChar = str1.charAt(0);
// // 3.String concatenation  
//String result= str1.concat(str2);
//// 4.find method : indexof 
////5.equality compare two string 
////6.trim method 
////7.replace method :String word2=word1.replace(oldCh,newCh)
////8.changing case method  :word1.toUpperCase / word1.toLowerCase
////9.Replacements 
////10.substring
////11.numbers to string 
//
// String word1="car";
// String word2=word1.replace('r','t');
//System.out.println(word2);
// 
////when you using print methods on these method you are not updating the current string 
////if you want to update the current string you should declare that string with that method 
////e.g  str=str.trim();
//------------------------------------------------------------------		
		
		
//Compare 2 strings. Store the result in a boolean variable.
//If the boolean variable is true, print a statement stating
//the strings are the same. If false, print a statement stating
 //they're not the same
//equality method task 
String str4="apple";
String str5="banana";
//add trim method 
boolean a =str4.equalsIgnoreCase(str5);

if (a) {
	System.out.println(str4+ " and "+str5 +" are the same string ");
	
}else {
		System.out.println(str4+ " and "+str5 +" are not the same string ");
	}
}
 

}
	

