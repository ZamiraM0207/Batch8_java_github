package homeaWork_day11;

public class homework5 {

	public static void main(String[] args) {
/* 5, Find the middle character of a string
Write a Java program to find the middle character of a string. 
 If the length of the string is odd there will be one middle character.
 If the length of the string is even there will be 2 middle characters.
Input: abcde
output:c
intput car11car
output 11
*/
		
//        012345
String input = "abcdef";

String middleChar = "";


if (input.length()%2 == 1) {
System.out.println("1 middle character");

int index= input.length() / 2;

System.out.println(input.charAt(index));


}else {
System.out.println("2 middle character");

System.out.println(input.length() / 2 -1);
System.out.println(input.length() / 2);

System.out.print(input.charAt(input.length() / 2 -1));
System.out.println(input.charAt(input.length() / 2 ));
}
	}

}
